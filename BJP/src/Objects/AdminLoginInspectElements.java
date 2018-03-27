package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/* author Gopi Kuncham 
 * Sheet name-----Admin Login Form
 * Sheet name-----Home
*TC_001
*TC_002
*TC_003
*TC_004
*TC_005
*TC_006
*
*/
public class AdminLoginInspectElements extends BrowserCode{
	static WebElement element;

	static By admin=By.id("ad");
	static By adminuser=By.xpath("//*[@id=\"login\"]/form/div[1]/input");
	static By adminpass=By.name("password");
	static By adminlogin=By.xpath("//*[@id=\"login\"]/form/button");
	static By adminlogout=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[6]/a");
	static By addconstitution=By.cssSelector("#link-effect-2 > ul > li:nth-child(2) > a");
	public AdminLoginInspectElements(WebDriver driver)
	{
		super();
	}

	public static WebElement admin()
	{
	element= driver.findElement(admin);
	return element;
	}
	public static WebElement adminuser()
	{
	element= driver.findElement(adminuser);
	return element;
	}
	public static WebElement  adminpass()
	{
	element=driver.findElement(adminpass);
	return element;
	}
	public static WebElement adminlogin()
	{
	element=driver.findElement(adminlogin);
	return element;
	}
	public static WebElement adminlogout()
	{
	element=driver.findElement(adminlogout);
	return element;
	}
	public static WebElement addconstitution()
	{
	element=driver.findElement(addconstitution);
	return element;
	}

}
