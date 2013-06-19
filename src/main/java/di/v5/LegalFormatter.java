package di.v5;

public class LegalFormatter {

    public String format(String responseContent) {
        return String.format("%s %s" , responseContent ,"content is copyrighted be awesomesite" );
    }
}
