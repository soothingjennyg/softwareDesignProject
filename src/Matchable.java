import java.util.Date;

abstract class Matchable{

    private Address address;
    private Payrate payrate;
    private Skill[] skills;
    private TimeSlot[] timeSlots;
    

    public abstract Skill addSkill(String name, int level);
    public abstract Skill[] getSkills();
    public abstract Review[] getReviews();
    public abstract Payrate addPayrate(int rate, String currency);
    public abstract Payrate getCurrentPayrate();
    public abstract TimeSlot addTimeSlot(Date from, Date to);
    public abstract TimeSlot[] getTimeSlot();
    public abstract Address addAddress();
    public abstract Address getAddress();


}
