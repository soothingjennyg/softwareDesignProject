

class Matcher{

    private MatchStrategy strategy;


    public Matcher(){


    }

    public Boolean setStrategy(MatchStrategy strategy){

	this.strategy = strategy;
	return true;
	
    }

    public MatchedShift match(Employee employee, Shift shift){

        return strategy.match(employee, shift);

    }

}
