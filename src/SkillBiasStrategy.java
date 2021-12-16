import java.util.Date;
import java.util.ArrayList;

public class SkillBiasStrategy implements MatchStrategy{
    
    private Json config;

    public MatchedShift match(Employee employee, Shift shift){

	if(this.matchAddress(employee, shift)
	   && this.matchTime(employee, shift)
	   && this.matchSkill(employee, shift)){

	    return new MatchedShift(employee, shift);

	}
	else{

	    return null;

	}
	
    }

    public Boolean matchAddress(Employee employee, Shift shift){

	String employeeAddress = employee.getAddress().toString();
	String shiftAddress = shift.getAddress().toString();
	
	return employeeAddress.equals(shiftAddress);
    }

    public Boolean matchTime(Employee employee, Shift shift){

        
	ArrayList<TimeSlot> employeeTimeSlots = employee.getTimeSlots();
	ArrayList<TimeSlot> shiftTimeSlots = shift.getTimeSlots();

	Date employeeTimeFrom;
	Date employeeTimeTo;
	Date shiftTimeFrom;
	Date shiftTimeTo;

	for(int employeeIndex = 0; employeeIndex < employeeTimeSlots.size(); employeeIndex++){
	    for(int shiftIndex = 0; shiftIndex < shiftTimeSlots.size(); shiftIndex++){

	        employeeTimeFrom = employeeTimeSlots.get(employeeIndex).getTimeFrom();
	        employeeTimeTo = employeeTimeSlots.get(employeeIndex).getTimeTo();
	        shiftTimeFrom = shiftTimeSlots.get(shiftIndex).getTimeFrom();
		shiftTimeTo = shiftTimeSlots.get(shiftIndex).getTimeTo();

		if((employeeTimeFrom.compareTo(shiftTimeFrom) >= 0)
		   && (employeeTimeTo.compareTo(shiftTimeTo) <= 0)){

		    return true;
		}

	    }
	}

	return false;
	
    }

    public Boolean matchSkill(Employee employee, Shift shift){

        Skill[] employeeSkills = employee.getSkills();
        Skill[] shiftSkills = shift.getSkills();

	Boolean employeeHasSkill;
	
	for(int shiftIndex = 0; shiftIndex < shiftSkills.length; shiftIndex++){
	    
	    employeeHasSkill = false;
	    
	    for(int employeeIndex = 0; employeeIndex < employeeSkills.length; employeeIndex++){

		if(shiftSkills[shiftIndex].getSkillName().equals(employeeSkills[employeeIndex].getSkillName())){
		    
		    employeeHasSkill = true;
		    
		    if(employeeSkills[employeeIndex].getSkillLevel() >= shiftSkills[employeeIndex].getSkillLevel()){
			
			employeeIndex = employeeSkills.length;
			
		    }
		    else{

			return false;
		    
		    }

		}

	    }

	    if(!employeeHasSkill){

		return false;

	    }
	
	}

	return true;

    }

	

}
