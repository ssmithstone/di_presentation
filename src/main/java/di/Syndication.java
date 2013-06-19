package di;

import org.apache.commons.io.IOUtils;

import java.net.URL;
import java.util.Calendar;

public class Syndication {

    public static final String URL = "http://www.google.com/cows_go_moo";

    public Content syndication() throws Exception {
        URL url = new URL(URL);
        final String contentString = IOUtils.toString(url);
        return new Content(){{content = contentString ; date = Calendar.getInstance() ; }};
    }

    public static class Content {
        public String content;
        public Calendar date;
    }
}



class SyndicationApplication {


    public static void main(String[] args) throws Exception {
        Syndication.Content content = new Syndication().syndication();
        System.out.println(String.format("%s %s" , content.content , content.date));
    }

}
