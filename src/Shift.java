import java.io.File;  
import java.util.Date;

class Shift{

    private String title;
    private Comment[] comments;
    private Break[] breaks;
    private Attachment[] attachments;
    private MatchedShift matchedShift;

    public Shift(String title, int count){

	this.title = title;
    }

    public Skill addSkill(String name, int level){

	return null;

    }
    public Skill[] getSkills(){

	return null;

    }
    public Review[] getReviews(){

	return null;

    }
    
    public Payrate addPayrate(int rate, String currency){

	return null;

    }
    public Payrate getCurrentPayrate(){

	return null;

    }
    public TimeSlot addTimeSlot(Date from, Date to){

	return null;

    }
    public TimeSlot[] getTimeSlot(){

	return null;

    }
    public Address addAddress(){

	return null;

    }
    public Address getAddress(){

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

    public Attachment[] getAttachments(){

	return null;
	
    }

    public Break[] getBreaks(){

	return null;
	
    }

}
