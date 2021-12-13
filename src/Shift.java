import java.io.File;  
import java.util.Date;
import java.util.ArrayList;

class Shift extends Matchable{

    private String title;
    private Comment[] comments;
    private Break[] breaks;
    private Attachment[] attachments;
    private MatchedShift[] matchedShifts;

    private Address address;
    private Payrate payrate;
    private Skill[] skills;
    private ArrayList<TimeSlot> timeSlots;
    private Review[] reviews;

    public Shift(){

    }

    public Skill addSkill(String name, int level){

	return null;

    }
    public Skill[] getSkills(){

	return this.skills;

    }
    public Review[] getReviews(){

	return this.reviews;

    }
    
    public Payrate addPayrate(int rate, String currency){

	return null;

    }
    public Payrate getCurrentPayrate(){

	return null;

    }
    public Boolean addTimeSlot(Date start, Date end){

	TimeSlot timeSlot = new TimeSlot(start, end);

	this.timeSlots.add(timeSlot);
	
	
	return true;

    }
    public ArrayList<TimeSlot> getTimeSlots(){

	return this.timeSlots;

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

    public MatchedShift[] getMatchedShifts(){

	return this.matchedShifts;

    }

}
