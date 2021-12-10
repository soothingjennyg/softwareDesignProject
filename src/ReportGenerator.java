

abstract class ReportGenerator{

    public Boolean isGenerating;

    public abstract Report generateReport();
    public abstract Boolean checkIfExists();
    public abstract Boolean queueReport();
}
