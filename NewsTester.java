
public class NewsTester {
	public static void main(String[] args) {
		HawksNews hawkNewsPublisher = new HawksNews();
		OnlineEdition weSubscriber = new OnlineEdition(hawkNewsPublisher);
		
		hawkNewsPublisher.addSubscriber(weSubscriber);
		
		hawkNewsPublisher.acceptNews("School Closed");
		
	    hawkNewsPublisher.removeSubscriber(weSubscriber);
	    
	    hawkNewsPublisher.acceptNews ("School NOT Closed");
	    
	    
	}
}
