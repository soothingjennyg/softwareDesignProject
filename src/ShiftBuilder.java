import java.util.Date;

class ShiftBuilder implements BuildShift{

    private Shift result;

    public Boolean reset(){

	return null;
	
    }
    public Boolean constructShift(){

	this.result = new Shift();

	return true;
	
    }

    public Boolean populateTimeSlot(Date start, Date end){

	this.result.addTimeSlot(start, end);
	return true;
	
    }

    public Boolean addTitleDescription(){

	return null;
	
    }

    public Boolean addRequiredSkills(Skill[] skills){

	return null;
	
    }

    public Shift duplicateShift(int shiftId){

	return null;
	
    }

    public Boolean addBreak(Break shiftBreak){

	return null;
	
    }

    public Boolean addAttachment(Attachment attachment){

	return null;
	
    }

    public Shift getResult(){

	return this.result;
    }

}
