import java.util.Date;

public class TimeSlot{

    private Date from;
    private Date to;


    public TimeSlot(Date from, Date to){

	this.from = from;
	this.to = to;
    }


    public Date getTimeFrom(){


	return this.from;

    }

    public Date getTimeTo(){


	return this.to;

    }


}
