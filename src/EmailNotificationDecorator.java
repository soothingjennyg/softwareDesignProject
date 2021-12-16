

public class EmailNotificationDecorator extends NotificationDecorator{

    private Sendable wrapper;

    public EmailNotificationDecorator(Sendable n){

	super(n);
	
    }

    public boolean sendNotification(String subject, String body, String token){

	return false;
	
    }

}
