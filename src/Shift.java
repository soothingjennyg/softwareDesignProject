import java.io.File;  
import java.util.Date;

class Shift{

    private String title;
    private int count;
    private Date from;
    private Date to;
    private Skill[] requiredSkills;
    private Comment[] comments;
    private Break[] breaks;
    private Attachment[] attachments;
    private MatchedShift matchedShift;
    private Address address;

    public Shift(String title, int count, Skill[] skills){

	
    }

    public Boolean setTime(Date from, Date to){

	return null;
	
    }

    public Shift updateShift(String title, int count, Skill[] skill){

	return null;
	
    }

    public Boolean addAttachment(File attachment){

	return null;
	
    }

    public Comment addComment(){

	return null;
	
    }

    public Comment[] getComments(){

	return null;
	
    }

}
