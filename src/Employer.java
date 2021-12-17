


public class Employer{

    private int id;
    private User user;
    private BuildShiftDirector builderShiftDirector;



    public boolean makeReport(String type, Json period){

			if(type.equals("annual")){
					
				return AnnualReportGenerator.<AnnualReportGenerator>getInstance().generateReport(period);
					
			} else{

				return MonthlyReportGenerator.<MonthlyReportGenerator>getInstance().generateReport(period);

			}
	
    }

}
