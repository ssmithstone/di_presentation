package di;

public class SocialMedia2 {

    public void publish(String content) {

//        new TwitterPublisher().publish(content);
//        new FacebookPublisher().publish(content);
        publishFacebook();
        publishTwitter();
    }

    private void publishTwitter(){}
    private void publishFacebook(){}

    private class TwitterPublisher {
        public void publish(String content) {
            // connect to twitter and publish
        }
    }


    private class FacebookPublisher {
        public void publish(String content) {
            // connect and publish to facebook
        }
    }
}
