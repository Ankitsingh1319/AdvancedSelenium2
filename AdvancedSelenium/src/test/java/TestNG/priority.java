package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test
	public void a()
	{
		Reporter.log("Ram", true);;
		}
	@Test
	public void b()
	{
		Reporter.log("Sita", true);;
		}
	@Test
	public void c()
	{
		Reporter.log("Hanuman", true);;
		}
}
