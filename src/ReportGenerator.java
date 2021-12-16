

abstract class ReportGenerator<T extends Report> {

    public Boolean isGenerating;

    public abstract T generateReport(String title, Json data, String category, int year, int month);
    public abstract Boolean checkIfExists();
    public abstract Boolean queueReport();
}
