

public class Scheduler{

    private static Scheduler instance;
    private Schedule[] schedules;
    private Matcher matcher;


    private Scheduler(){

    }


    public static Scheduler getInstance(){
        if(instance==null){
            instance = new Scheduler();
        }
        return instance;
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
