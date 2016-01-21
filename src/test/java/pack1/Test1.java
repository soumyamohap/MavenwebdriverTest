package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups={"unit"})
	public void test1()
	{
		System.out.println("I am in first method first package");
	}
	
	@Test
	public void test2()
	{
		
		System.out.println("I am in second method");
	}

}
