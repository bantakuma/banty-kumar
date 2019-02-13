class Date 
     {
int	intDay, intMonth, intYear;
	// Constructor

	Date(int intDay, int intMonth, int intYear)  	{
		this.intDay = intDay;
this.intMonth = intMonth;
this.intYear = intYear;
	}
	// setter and getter methods
	void setDay(int intDay)	
	{
		this.intDay = intDay;
	}
		int intgetDay( )		
	{
		return  this.intDay;
	}
	
	void setMonth(int intMonth)
	{
		this.intMonth = intMonth;
	}

	int intgetMonth( )
	{
		return  this.intMonth;
	}

	void setYear(int intYear)
	{
		this.intYear=intYear;
	}



	int intgetYear( )
	{
		return  this.intYear;
	}
	public String toString() //converts date obj to string.    
	{
		return	("Date is" +intDay+"/"+intMonth+"/"+intYear); 
	}
	
	
	} // Date class
