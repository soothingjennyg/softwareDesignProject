import java.util.Date;

class LoggedInDevice implements BelongToUser{

    private int userId;
    private String model;
    private String pushNotificationToken;
    private Date date;

    public LoggedInDevice(String model, String token, int uid){

	
    }

    
    public User getOwner(){

	return null;
	
    }

}
