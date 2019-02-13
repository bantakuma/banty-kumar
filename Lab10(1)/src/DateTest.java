
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateTest {


	static	Date d=null;
	@BeforeClass
	public static void setUp()
	{
	d=new Date(10,20,1996);
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
	public void testPer1()
	{
		Assert.assertEquals(10,d.intgetDay());
		}
	@Test
	public void testDivide2()
	{
		Assert.assertEquals(20,d.intgetMonth());
		}

	@Test
	public void testDivide3()
	{
		Assert.assertEquals(1996,d.intgetYear());
		}
	}






