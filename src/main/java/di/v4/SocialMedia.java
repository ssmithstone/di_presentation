package di.v4;

public class SocialMedia {

    public void publish(String content) {

        new TwitterPublisher().publish(content);
    }

    private class TwitterPublisher {
        public void publish(String content) {
            // connect to twitter and publish
        }
    }
}
