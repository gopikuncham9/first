package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/* author Gopi Kuncham
 * Sheet name-----Viewconstitution  
*TC_001
*TC_002
*TC_003
*TC_004
*/
public class ViewConstitutionInspect extends BrowserCode {
	static WebElement element;

	static By admin=By.id("ad");
	static By adminuser=By.xpath("//*[@id=\"login\"]/form/div[1]/input");
	static By adminpass=By.name("password");
	static By adminlogin=By.xpath("//*[@id=\"login\"]/form/button");

	static By viewconstitution=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[4]/a");
	static By kukatpally=By.xpath("/html/body/div[4]/div/div/div/ul/li/a");
	static By manjeera=By.xpath("/html/body/div[3]/div/div/div/ul/li/a");
	static By delete=By.xpath("/html/body/div[3]/div/div[2]/div/div/form/input[1]");
	static By logout=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[6]/a");
	public ViewConstitutionInspect(WebDriver driver)
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

	public static WebElement viewconstitution()
	{
	element= driver.findElement(viewconstitution);
	return element;
	}
	public static WebElement kukatpally()
	{
	element= driver.findElement(kukatpally);
	return element;
	}
	public static WebElement manjeera()
	{
	element=driver.findElement(manjeera);
	return element;
	}
	public static WebElement delete()
	{
	element=driver.findElement(delete);
	return element;
	}
	
	public static WebElement logout()
	{
	element=driver.findElement(logout);
	return element;
	}
	
	
}
