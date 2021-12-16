


public class MonthlyReportGenerator extends ReportGenerator<MonthlyReport> {

    private int month;
    private int year;
    private String title;
    private Json data;
    private String category;
    private MonthlyReport report;
    public Boolean isGenerating;

    private static MonthlyReportGenerator instance;

    public static MonthlyReportGenerator getInstance(){
        if(instance==null){
            instance = new MonthlyReportGenerator();
        }
        return instance;
    }

    public MonthlyReport generateReport(String title, Json data, String category, int year, int month){

      Boolean exists = this.checkIfExists();

	if(!exists){

	    this.queueReport();
	    this.report = new MonthlyReport(title, data, category, year, month);

	}
	
	return this.report;

    }

    public Boolean checkIfExists(){

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

    public Boolean queueReport(){

	return true;
	
    }

}
