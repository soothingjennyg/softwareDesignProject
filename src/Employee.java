import java.util.Date;
import java.util.ArrayList;

class Employee extends Matchable{

    private int id;
    private User user;
    private int maxDailyWorkingHr;

    private Address address;
    private Payrate payrate;
    private Skill[] skills;
    private ArrayList<TimeSlot> timeSlots;
    private Review[] reviews;



    public int getMaxDailyWorkingHr(){

	return -1;
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

}
