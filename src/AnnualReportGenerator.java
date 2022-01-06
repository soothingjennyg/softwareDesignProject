import java.util.ArrayList;
import java.util.List;

public class AnnualReportGenerator extends ReportGenerator<AnnualReport>{

    public List<Json> queue = new ArrayList<Json>();

    public Boolean generateReport(Json period){

        Boolean exists = this.checkIfExists(period);

        if(!exists){

            this.queueReport(period);

        }
        
        return true;

    }

    public Boolean checkIfExists(Json period){

        /*
        Check in DB
        if(exists in DB){
            return true;
        }
        else{
            return false;
        }
         */
        return false;

    }

    public Boolean queueReport(Json period){
        this.queue.add(period);
        this.checkExecuteQueue();

	    return true;
	
    }

    public Boolean checkExecuteQueue(){

        if (this.queue.size() > 0){
            int year = (int) this.queue.remove(0).get("year");

            // looking at DB and gather data and save report to DB

            this.checkExecuteQueue();
        }

        return true;

    }

    public AnnualReport getReport(Json period){
        int year = (int) period.get("year");
        Boolean exists = this.checkIfExists(period);

        if(!exists){

            return null;

        }

        Json data = null;
        
        return new AnnualReport("Annual Report for " + year, data, "Period Report", year);

    }

}
