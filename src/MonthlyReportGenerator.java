import java.util.ArrayList;
import java.util.List;

public class MonthlyReportGenerator extends ReportGenerator<MonthlyReportGenerator, MonthlyReport> {

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
            int month = (int) this.queue.remove(0).get("month");

            // looking at DB and gather data and save report to DB

            this.checkExecuteQueue();
        }

        return true;

    }

    public MonthlyReport getReport(Json period){
        int year = (int) period.get("year");
        int month = (int) period.get("month");
        Boolean exists = this.checkIfExists(period);

        if(!exists){

            return null;

        }

        Json data = null;
        
        return new MonthlyReport("Monthly Report for " + year + ", " + month, data, "Period Report", year, month);

    }

}
