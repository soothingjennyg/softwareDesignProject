

class SmsNotificationDecorator extends NotificationDecorator{

    private Sendable wrapper;

    public SmsNotificationDecorator(Sendable n){

	super(n);
	
    }

    public boolean sendNotification(String subject, String body, String token){

	return false;
	
    }

}
