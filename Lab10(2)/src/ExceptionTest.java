

public class ExceptionTest 
{
String checkSalary(int salary)
  {
	try  {

	if(salary<3000)
	{
		throw new ExceptionCheck();
	}
	else 
		return ("Valid"); 
        }
	catch (ExceptionCheck e)
	{return "Valid";
		//e.printStackTrace();
		}
	
	}
}
