

public class NotificationDecorator implements Sendable{

    private Sendable wrapper;


    public NotificationDecorator(Sendable n){

	
    }

    public boolean sendNotification(String subject, String body, String token){

	return false;
	
    }

}
