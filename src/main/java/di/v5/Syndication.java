package di.v5;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class Syndication {


    public Content syndication() throws Exception {
        return Content.Builder.build(getLegalFormattedContent());
    }

    private String getLegalFormattedContent() throws IOException {
        String responseContent = IOUtils.toString(new UrlProvider().getUrl());
        return new LegalFormatter().format(responseContent);
    }

}

class SyndicationApplication {

    public static void main(String[] args) throws Exception {
        Content content = new Syndication().syndication();
        System.out.println(String.format("%s %s" , content.content , content.date));
    }

}
