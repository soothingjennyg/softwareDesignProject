import java.util.Date;
import java.util.ArrayList;

public abstract class Matchable{
    

    public abstract Skill addSkill(String name, int level);
    public abstract Skill[] getSkills();
    public abstract Review[] getReviews();
    public abstract Payrate addPayrate(int rate, String currency);
    public abstract Payrate getCurrentPayrate();
    public abstract Boolean addTimeSlot(Date from, Date to);
    public abstract ArrayList<TimeSlot> getTimeSlots();
    public abstract Address addAddress();
    public abstract Address getAddress();


}
