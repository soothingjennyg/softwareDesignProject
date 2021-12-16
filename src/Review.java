

public class Review{
    
    private int rating;
    private String comment;
    private int reviewerId;

    public Review(int reviewerId, int rating, String comment){

	this.reviewerId = reviewerId;
	this.rating = rating;
	this.comment = comment;
    }

    public String getComments(){

	return this.comment;
	
    }

    public int getRating(){

	return this.rating;
	
    }

}
