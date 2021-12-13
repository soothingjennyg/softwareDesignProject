

class AnnualReportGenerator extends ReportGenerator{

    private String year;
    private String title;
    private Json data;
    private String category;
    private AnnualReport report;
    public Boolean isGenerating;

    public AnnualReport generateReport(String title, Json data, String category, int year, int month){

	Boolean exists = this.checkIfExists();

	if(!exists){

	    this.queueReport();

	    this.report = new AnnualReport(title, data, category, year);
	    this.isGenerating = false;
	}
	
	return this.report;

    }

    public Boolean checkIfExists(){

        return this.report != null;

    }

    public Boolean queueReport(){

	while(this.isGenerating);
	this.isGenerating = true;

	return true;
	
    }

}
