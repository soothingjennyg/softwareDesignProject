


class MonthlyReportGenerator extends ReportGenerator{

    private int month;
    private int year;
    private String title;
    private Json data;
    private String category;
    private MonthlyReport report;
    public Boolean isGenerating;

    public MonthlyReport generateReport(String title, Json data, String category, int year, int month){

      Boolean exists = this.checkIfExists();

	if(!exists){

	    this.queueReport();

	    this.report = new MonthlyReport(title, data, category, year, month);
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
