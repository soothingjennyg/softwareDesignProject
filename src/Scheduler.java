

public class Scheduler extends Singleton {

    private Schedule[] schedules;
    private Matcher matcher;


    private Scheduler(){

    }

    public Boolean addSchedule(Schedule schedule){

	    return null;

    }

    public Boolean executeSchedule(Schedule schedule){

        if(schedule.getJob().equals("match")){

            this.matcher.setStrategy(schedule.getStrategy());

            this.matcher.match(schedule.getEmployee(), schedule.getShift());

            return true;

        }
        return false;
	
    }

}
