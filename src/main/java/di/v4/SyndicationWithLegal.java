package di.v4;

import org.apache.commons.io.IOUtils;

import java.util.Calendar;
import java.util.TimeZone;

public class SyndicationWithLegal {

    public static final String URL = "http://www.awesomesite.com";

    public Content syndication() throws Exception {
        java.net.URL url = new java.net.URL(URL);
        final String contentString = IOUtils.toString(url) + " content is copyrighted be awesomesite";
        return new Content(){{content = contentString ; date = Calendar.getInstance(TimeZone.getTimeZone("Europe/Madrid")) ; }};
    }

    public static class Content {
        public String content;
        public Calendar date;
    }
}

class Syndication3Application {


    public static void main(String[] args) throws Exception {
        SyndicationWithLegal.Content content = new SyndicationWithLegal().syndication();
        System.out.println(String.format("%s %s" , content.content , content.date));
    }

}
