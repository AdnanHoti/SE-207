import java.util.ArrayList;
import java.util.List;


public class HawksNews implements Publisher  {

//instance variable to track subscribers
	
	List<Subscriber> mySubscribers = new ArrayList<>();
	
	public void addSubscriber(Subscriber newSubscriber) {
		mySubscribers.add(newSubscriber);
		
	}
	
	public void removeSubscriber(Subscriber currentSubscriber) {
		mySubscribers.remove(currentSubscriber);
		

	}

	public void notifySubscribers(String news) {
		for (Subscriber subscriber: mySubscribers) {
			subscriber.receiveNews(news);
			
		}	
			
	}
	public void acceptNews (String news) {
		notifySubscribers(news);
		
	}
}
