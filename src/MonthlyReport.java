

public class MonthlyReport implements Report{

    private String title;
    private Json data;
    private String category;
    private int month;
    private int year;


    public MonthlyReport(String title, Json data, String category, int year, int month){

	this.title = title;
	this.data = data;
	this.category = category;
	this.year = year;

    }

    public MonthlyReport createReport(){

	return null;
	
    }

}
