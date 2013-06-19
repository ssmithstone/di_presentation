package di.v5;

import java.util.Calendar;
import java.util.TimeZone;

public class Content {
    public String content;
    public Calendar date;

    public Content(String content, Calendar date) {

        this.content = content;
        this.date = date;
    }

    public static class Builder {

        public static Content build(final String content) {
            return new Content(content, Calendar.getInstance(TimeZone.getTimeZone("Europe/Madrid")));
        }
    }
}
