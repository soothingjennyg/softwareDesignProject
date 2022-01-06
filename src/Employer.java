


public class Employer{

    private int id;
    private User user;
    private BuildShiftDirector builderShiftDirector;

    public boolean makeReport(String type, Json period){

			if(type.equals("annual")){
				return AnnualReportGenerator.getInstance(AnnualReportGenerator.class).generateReport(period);
					
			} else{

				return MonthlyReportGenerator.getInstance(MonthlyReportGenerator.class).generateReport(period);

			}
	
    }

}
