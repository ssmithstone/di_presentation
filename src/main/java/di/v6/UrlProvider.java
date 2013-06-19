package di.v6;

import java.net.MalformedURLException;
import java.net.URL;

class UrlProvider {
    public URL getUrl() throws MalformedURLException {

        return new URL("http://www.awesomesite.com");
    }
}
