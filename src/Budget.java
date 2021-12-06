import java.util.Date;

class Budget implements Finance{

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
