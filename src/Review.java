

public abstract class Review{

    private String comments;
    protected int reviewerId;

    public Review(int reviewerId, String comment){
        this.comments = comment;
        this.reviewerId = reviewerId;
    }

    public String getComments(){
        return this.comments;
    }
}
