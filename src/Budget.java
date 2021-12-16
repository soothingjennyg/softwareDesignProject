import java.util.Date;

public class Budget{

    private FinanceMediator mediator;
    private int budgetSetLimit;
    private int budgetReminderLimit;
    private int budgetUsed;
    private Date from;
    private Date to;

    public int getRemainingBudget(){

	return -1;
	
    }

}
