package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/* author Gopi Kuncham
 * Sheet name-----AddConstitution 
*TC_001
*TC_002
*TC_003
*TC_004
*TC_005
*TC_006
*TC_007
*TC_008
*
*/
public class AddConstitutionInsp extends BrowserCode{
	static WebElement element;

	static By admin=By.id("ad");
	static By adminuser=By.xpath("//*[@id=\"login\"]/form/div[1]/input");
	static By adminpass=By.name("password");
	static By adminlogin=By.xpath("//*[@id=\"login\"]/form/button");

	static By addconstitution=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[2]/a");
	static By constitution=By.xpath("/html/body/div[3]/div/div[2]/div/div/form/input[1]");
	//static By division=By.name("divisionname");
	static By firstname=By.name("firstname");
	static By lastname=By.name("lastname");
	static By username=By.name("username");
	static By password=By.name("password");
	static By email=By.name("email");
	static By mobile=By.name("mobile");
	static By gender=By.xpath("//*[@id=\"country13\"]");
	static By register=By.xpath("/html/body/div[3]/div/div[2]/div/div/form/input[8]");

	public AddConstitutionInsp(WebDriver driver)
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

	public static WebElement addconstitution()
	{
	element= driver.findElement(addconstitution);
	return element;
	}
	public static WebElement  constitution()
	{
	element=driver.findElement(constitution);
	return element;
	}
	/*public static WebElement division()
	{
	element=driver.findElement(division);
	return element;
	}*/
	public static WebElement firstname()
	{
	element=driver.findElement(firstname);
	return element;
	}
	public static WebElement lastname()
	{
	element=driver.findElement(lastname);
	return element;
	}
	public static WebElement username()
	{
	element=driver.findElement(username);
	return element;
	}
	public static WebElement password()
	{
	element=driver.findElement(password);
	return element;
	}
	public static WebElement email()
	{
	element=driver.findElement(email);
	return element;
	}
	public static WebElement mobile()
	{
	element=driver.findElement(mobile);
	return element;
	}
	public static Select gender()
	{
		Select s=new Select(element=driver.findElement(gender));
	    return s;
	}
	public static WebElement register()
	{
	element=driver.findElement(register);
	return element;
	}
}
