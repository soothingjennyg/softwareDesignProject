public class Complaint extends Review{


    private Boolean isResolved = false;

    public Complaint(int reviewerId, String comment) {
        super(reviewerId,comment);
    }

    public Boolean resolve(){
        return true;
    }

}
