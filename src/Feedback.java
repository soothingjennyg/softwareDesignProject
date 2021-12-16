public class Feedback extends Review{

    private int rating;

    public Feedback(int reviewerId, String comment, int rating) {
        super(reviewerId, comment);
        this.rating = rating;
    }

    public int getRating(){

        return this.rating;

    }
}
