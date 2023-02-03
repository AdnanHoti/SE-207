
public class PhoneCallEdition implements Subscriber {
	Publisher myPublisher;
	public PhoneCallEdition(Publisher yourPublisher) {
		this.myPublisher = yourPublisher;
		
	}
	public void receiveNews(String news) {
		System.out.println("Transcribing Message: " + news);
	}
}
