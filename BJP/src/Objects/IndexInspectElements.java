package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/* author Gopi Kuncham
 * Sheet name-----Index
*TC_001
*TC_002
*
*/

public class IndexInspectElements  extends BrowserCode {
	static WebElement element;

	static By loginpage=By.xpath("//*[@id=\"link-effect-2\"]/ul/li/a");
	static By adminstrator=By.xpath("//*[@id=\"ad\"]/a");
	static By constitution=By.xpath("//*[@id=\"cd\"]/a");
	static By division=By.xpath("//*[@id=\"dd\"]/a");
	
	public IndexInspectElements(WebDriver driver)
	{
		super();
	}

	public static WebElement loginpage()
	{
		element= driver.findElement(loginpage);
	return element;
	}
	public static WebElement adminstrator()
	{
	element= driver.findElement(adminstrator);
	return element;
	}
	public static WebElement  constitution()
	{
	element=driver.findElement(constitution);
	return element;
	}
	public static WebElement division()
	{
	element=driver.findElement(division);
	return element;
	} 

}
