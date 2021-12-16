import java.util.Date;

public class BuildShiftDirector{

    private BuildShift builder;

    public BuildShiftDirector(){

	
    }

    public void changeBuilder(BuildShift builder){

	
    }

    public Shift makeShift(BuildShift builder, Date start, Date end){

	this.builder = builder;

	this.builder.constructShift();

	this.builder.populateTimeSlot(start, end);
	
	return this.builder.getResult();
	
    }

}
