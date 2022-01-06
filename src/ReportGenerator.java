import java.util.List;

abstract class ReportGenerator<T> extends Singleton {

    public List<Integer> queue;

    public abstract Boolean generateReport(Json period);
    public abstract Boolean checkIfExists(Json period);
    public abstract Boolean queueReport(Json period);
    public abstract T getReport(Json period);
}
