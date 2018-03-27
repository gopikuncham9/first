package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DivisionHomeInspect extends BrowserCode {
	static WebElement element;

	static By division=By.linkText("Division");
	static By divisionuser=By.xpath("//*[@id=\"login\"]/form/div[1]/input");
	static By divisionpass=By.name("password");
	static By divisionlogin=By.xpath("//*[@id=\"login\"]/form/button");
	
	public DivisionHomeInspect(WebDriver driver)
	{
		super();
	}

	public static WebElement division()
	{
		element= driver.findElement(division);
	return element;
	}
	public static WebElement divisionuser()
	{
	element= driver.findElement(divisionuser);
	return element;
	}
	public static WebElement  divisionpass()
	{
	element=driver.findElement(divisionpass);
	return element;
	}
	public static WebElement divisionlogin()
	{
	element=driver.findElement(divisionlogin);
	return element;
	}

	
	
}
