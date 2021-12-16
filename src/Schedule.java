

public class Schedule{

    private String job;
    private MatchStrategy strategy;
    private Employee employee;
    private Shift shift;

    public Schedule(String job, MatchStrategy strategy, Employee employee, Shift shift){

	this.job = job;
	this.strategy = strategy;
	this.employee = employee;
	this.shift = shift;

    }

    public String getJob(){

	return this.job;

    }

    public MatchStrategy getStrategy(){

	return this.strategy;

    }

    public Employee getEmployee(){

	return this.employee;

    }

    public Shift getShift(){

	return this.shift;

    }

}
