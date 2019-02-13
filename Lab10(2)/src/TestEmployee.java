import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestEmployee {
static	ExceptionTest te=null;
@BeforeClass
public static void setUp()
{
	te=new ExceptionTest();
	System.out.print("Setup is call" +"Before the execution of "+"all test cases");
	}
@AfterClass
public static void tearDown()
{System.out.print("tearDown is call once\" +\"Before the execution of \"+\"each test cases");
	}
@Before
public void init()
{System.out.print("init is call once\" +\"Before the execution of \"+\"each test cases");
	}
@After
public void destroy()
{System.out.print("destroy is call once\" +\"after the execution of \"+\"each test cases");
	}


@Test
public void testException()
{
	Assert.assertEquals("Valid",te.checkSalary(5000));
	}
}



