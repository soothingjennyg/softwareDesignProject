import java.util.Date;
import java.util.ArrayList;

class FeedbackBiasStrategy implements MatchStrategy{
    
    private Json config;

    public MatchedShift match(Employee employee, Shift shift){

        if(this.matchAddress(employee, shift)
	   && this.matchTime(employee, shift)
	   && this.matchFeedback(employee, shift)){

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

    public Boolean matchFeedback(Employee employee, Shift shift){

	Review[] employeeReviews = employee.getReviews();
	Review[] shiftReviews = shift.getReviews();

	if(getMeanRating(employeeReviews) >= 5
	   && getMeanRating(shiftReviews) >= 5){

	    return true;

	}

	return false;
	
    }

    private float getMeanRating(Review[] reviews){

        int totalRating = 0;

	for(int i = 0; i < reviews.length; i++){

	    totalRating += reviews[i].getRating();

	}

	return (float)totalRating / reviews.length;

    }

}
