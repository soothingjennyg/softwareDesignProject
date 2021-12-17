import java.security.SecureRandom;

public class User{

    private int id;
    private String name;
    private int addressId;
    private String email;
    private String pwd;
    private String phoneNumber;

    private Permission[] permissions;
    private ActivityLog[] activityLogs;
    private Configuration[] configurations;
    private LoggedInDevice[] loggedInDevices;


    public String login(String email, String pwd){

        if(this.email.equals(email) && this.pwd.equals(pwd)){

            SecureRandom random = new SecureRandom();
            byte bytes[] = new byte[20];
            random.nextBytes(bytes);
            return bytes.toString();


        }

        return null;
    }

    public User updateInformation(String info){
	    return null;
    }

    public LoggedInDevice[] getLoggedInDevices(){

	    return null;

    }

    public Configuration[] getConfigurations(){

	    return null;

    }

    public Permission[] getPermissions(){

	    return null;
        
    }

    public ActivityLog[] getActivityLogs(){

	    return null;
        
    }
}
