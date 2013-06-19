package di;

import org.apache.commons.io.IOUtils;

import java.net.URL;
import java.util.Calendar;

public class Syndication2 {

    public static final String URL = "http://www.awesomesite.com";

    public Content syndication() throws Exception {
        java.net.URL url = new URL(URL);
        final String contentString = IOUtils.toString(url);
        return new Content(){{content = contentString ; date = Calendar.getInstance() ; }};
    }

    public static class Content {
        public String content;
        public Calendar date;
    }
}



class Syndication2Application {


    public static void main(String[] args) throws Exception {
        Syndication2.Content content = new Syndication2().syndication();
        System.out.println(String.format("%s %s" , content.content , content.date));
    }

}
