
public class MobileAppEdition implements Subscriber {
	Publisher myPublisher;
	public MobileAppEdition(Publisher yourPublisher) {
		this.myPublisher = yourPublisher;
		
	}
	public void receiveNews(String news) {
		System.out.println("New news on App: " + news);
	}
}
