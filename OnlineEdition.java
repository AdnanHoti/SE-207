
public class OnlineEdition implements Subscriber {
	Publisher myPublisher;
	public OnlineEdition(Publisher yourPublisher) {
		this.myPublisher = yourPublisher;
		
	}
	public void receiveNews(String news) {
		System.out.println("Showing news on webpage as: " + news);
	}
}
