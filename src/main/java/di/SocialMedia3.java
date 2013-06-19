package di;

import java.util.List;

public class SocialMedia3 {

    private List<Publisher> publisherList;

    public void publish(String content){
        for(Publisher p : new Publisher[]{new TwitterPublisher()}){

        }
    }

    private abstract class Publisher {

        public abstract void publish();
    }

    class TwitterPublisher extends Publisher {

        @Override
        public void publish() {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
