


public class Employer{

    private int id;
    private User user;
    private BuildShiftDirector builderShiftDirector;



    public Report makeReport(String type, String title, Json data, String category, int year, int month){

	if(type.equals("annual")){

	    return AnnualReportGenerator.getInstance().generateReport(title, data, category, year, month);
	    
	}
	else{

	    return MonthlyReportGenerator.getInstance().generateReport(title, data, category, year, month);

	}
	
    }

}
