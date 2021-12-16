

public class AnnualReportGenerator extends ReportGenerator<AnnualReport>{

    private String year;
    private String title;
    private Json data;
    private String category;
    private AnnualReport report;
    public Boolean isGenerating;

    private static AnnualReportGenerator instance;

    public static AnnualReportGenerator getInstance(){
        if(instance==null){
            instance = new AnnualReportGenerator();
        }
        return instance;
    }

    public AnnualReport generateReport(String title, Json data, String category, int year, int month){

	Boolean exists = this.checkIfExists();

	if(!exists){

	    this.queueReport();

	    this.report = new AnnualReport(title, data, category, year);
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
