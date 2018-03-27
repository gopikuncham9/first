package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/* author Gopi Kuncham
 * Sheet name-----viewproblems 
 * Sheet name-----Problems in each division 
*TC_001
*TC_002
*TC_003
*TC_004
*TC_005
*TC_006
*
*/
public class ViewProblemsInspect  extends BrowserCode{
	
		static WebElement element;

		static By admin=By.id("ad");
		static By adminuser=By.xpath("//*[@id=\"login\"]/form/div[1]/input");
		static By adminpass=By.name("password");
		static By adminlogin=By.xpath("//*[@id=\"login\"]/form/button");

		static By viewproblems=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[5]/a");
		static By kukatpally=By.xpath("/html/body/div[4]/div/div/div/ul/li/a");
		static By manjeera=By.xpath("/html/body/div[4]/div/div/div/ul/li/a");
		static By pendingproblems=By.xpath("/html/body/div[4]/div/div/div/div/ul/li[1]/a");
		static By logout=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[6]/a");
		public ViewProblemsInspect(WebDriver driver)
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

		public static WebElement viewproblems()
		{
		element= driver.findElement(viewproblems);
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
		public static WebElement pendingproblems()
		{
		element=driver.findElement(pendingproblems);
		return element;
		}
		
		public static WebElement logout()
		{
		element=driver.findElement(logout);
		return element;
		}
		
		
	}


