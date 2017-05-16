package Date;

public class Date {
	public Date()
	{
		month = 1;
		day = 1;
		year = 2002;
	}
    public Date(int theMonth, int theDay, int theYear)
    {
    	month= theMonth;
    	day = theDay;
    	year = theYear;
    }
    public boolean equals(Object rhs)
    {
    	if(!(rhs instanceof Date))
    		return false;
    	Date rhDate = (Date) rhs;
    	return rhDate.month == month && rhDate.day == day && rhDate.year == year;
    }
    public String toString()
    {
    	return month +"/" + day +"/" +year;
    }
    private int month;
    private int day;
    private int year;
}
