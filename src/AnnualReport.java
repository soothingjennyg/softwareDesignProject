

public class AnnualReport implements Report{

    public String title;
    public Json data;
    public String category;
    public int year;


    public AnnualReport(String title, Json data, String category, int year){
        this.title = title;
        this.data = data;
        this.category = category;
        this.year = year;
    }

    public Boolean deleteReport(){
	    return true;
    }

}
