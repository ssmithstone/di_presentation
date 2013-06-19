package di.v6;

import org.apache.commons.io.IOUtils;

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Syndication {


    public Content syndication(SyndicationSource source) throws Exception {
        return Content.Builder.build(IOUtils.toString(source.getContent()));
    }

}

interface SyndicationSource {
    Reader getContent();
}

class URLSyndicationSource implements SyndicationSource {

    @Override
    public Reader getContent() {
        try {
            return new InputStreamReader( getUrl().openStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new StringReader("");
    }

    protected URL getUrl() throws MalformedURLException {
        return new URL("http://www.google.com");
    }
}

class LegalSyndication extends Syndication {

    @Override
    public Content syndication(SyndicationSource source) throws Exception {
        return new Content(String.format("%s %s" , super.syndication(source).content , " content is copyrighted be awesomesite"));
    }
}


class SyndicationApplication {

    public static void main(String[] args) throws Exception {
        springApplicationContextFactoryIsJustThis();
    }

    public static void springApplicationContextFactoryIsJustThis() throws Exception {

        URLSyndicationSource source = new URLSyndicationSource();

        Content content =  new Syndication().syndication(source);

        Content content1 =  new LegalSyndication().syndication(source);

        System.out.println(String.format("%s %s" , content.content , content.date));
        System.out.println(String.format("%s %s" , content1.content , content1.date));

    }

}
