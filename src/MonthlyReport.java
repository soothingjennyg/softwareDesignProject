

public class MonthlyReport implements Report{

    public String title;
    public Json data;
    public String category;
    public int month;
    public int year;


    public MonthlyReport(String title, Json data, String category, int year, int month){

        this.title = title;
        this.data = data;
        this.category = category;
        this.year = year;

    }

    public Boolean deleteReport(){

	    return true;
	
    }

}
