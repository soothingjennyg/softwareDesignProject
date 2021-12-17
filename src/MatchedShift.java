

public class MatchedShift{

    private int shiftId;
    private int employeeId;
    private int rank;
    private Boolean isApproved;
    private Boolean isCompleted;
    private Employee employee;
    private Shift shift;



    public MatchedShift(Employee employee, Shift shift){

	this.employee = employee;
	this.shift = shift;
        
    }

    public Boolean appoveShift(){

	this.isApproved = true;

	return true;
	
    }

    public Boolean rejectShift(){

	this.isApproved = false;

	return true;
	
    }

    public Boolean getIsApproved(){

	return null;
	
    }

    public Boolean deleteShift(){

	return null;
	
    }

    public MatchedShift updateShift(Shift info){

	return null;

    }

    public MatchedShift editShift(Shift info){

	return null;
	
    }

    public Boolean updateDatabaseCompletedShift(){

	return null;
	
    }

    public Employee getEmployee(){

	return null;
	
    }

    public Shift getShift(){

	return null;
	
    }

    public Review createReview(int reviewerId, String type, String comment, int rating){

        if(type.equals("complaint")){
            return new Complaint(reviewerId, comment);
        }
        else{
            return new Feedback(reviewerId, comment, rating);
        }
	
    }

    public Boolean resolveComplaint(Review review) {
        if (review instanceof Complaint) {
            ((Complaint) review).resolve();
        }
        return true;
    }

}
