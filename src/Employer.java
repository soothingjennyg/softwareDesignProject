


class Employer{

    private int id;
    private User user;
    private BuildShiftDirector builderShiftDirector;



    public Report makeReport(ReportGenerator type, String title, Json data, String category, int year, int month){

	if(type instanceof AnnualReportGenerator){

	    return type.generateReport(title, data, category, year, month);
	    
	}
	else{

	    return type.generateReport(title, data, category, year, month);

	}
	
    }

}
