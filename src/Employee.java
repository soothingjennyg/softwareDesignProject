import java.util.Date;


class Employee extends Matchable{

    private int id;
    private User user;
    private int maxDailyWorkingHr;

    private Address address;
    private Payrate payrate;
    private Skill[] skills;
    private TimeSlot[] timeSlots;



    public int getMaxDailyWorkingHr(){

	return -1;
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

}
