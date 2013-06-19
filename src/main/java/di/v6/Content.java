package di.v6;

import java.util.Calendar;

public class Content {
    public String content;
    public Calendar date;

    public Content(String content) {

        this.content = content;
        this.date = Calendar.getInstance();
    }

    public static class Builder {

        public static Content build(final String content) {
            return new Content(content);
        }
    }
}


