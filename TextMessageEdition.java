public class TextMessageEdition implements Subscriber {
	Publisher myPublisher;
	public TextMessageEdition(Publisher yourPublisher) {
		this.myPublisher = yourPublisher;
		
	}
	public void receiveNews(String news) {
		System.out.println("Text message: " + news);
	}
}
