

abstract class ReportGenerator{

    public Boolean isGenerating;

    public abstract Report generateReport(String title, Json data, String category, int year, int month);
    public abstract Boolean checkIfExists();
    public abstract Boolean queueReport();
}
