
public interface Publisher {
	public void addSubscriber(Subscriber newSubscriber);
	public void removeSubscriber(Subscriber currentSubscriber);
	public void notifySubscribers(String news);
}
