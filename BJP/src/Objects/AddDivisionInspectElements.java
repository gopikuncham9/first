package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/* author Gopi Kuncham
 * Sheet name-----Adddivision 
*TC_001
*TC_002
*TC_003
*TC_004
*/
public class AddDivisionInspectElements extends BrowserCode {
static WebElement element;

static By admin=By.id("ad");
static By adminuser=By.xpath("//*[@id=\"login\"]/form/div[1]/input");
static By adminpass=By.name("password");
static By adminlogin=By.xpath("//*[@id=\"login\"]/form/button");

static By adddivision=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[3]/a");
static By constitution=By.xpath("//*[@id=\"country13\"]");
static By division=By.name("divisionname");
static By firstname=By.name("firstname");
static By lastname=By.name("lastname");
static By username=By.name("username");
static By password=By.name("password");
static By email=By.name("email");
static By mobile=By.name("mobile");
static By gender=By.name("gender");
static By register=By.xpath("/html/body/div[3]/div/div[2]/div/div/form/input[8]");
static By logout=By.xpath("//*[@id=\"link-effect-2\"]/ul/li[6]/a");
static By loginpage=By.xpath("//*[@id=\"link-effect-2\"]/ul/li/a");
public AddDivisionInspectElements(WebDriver driver)
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

public static WebElement adddivision()
{
element= driver.findElement(adddivision);
return element;
}
public static Select  constitution()
{
	Select s=new Select(driver.findElement(constitution));
return s;
}
public static WebElement division()
{
element=driver.findElement(division);
return element;
}
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
public static WebElement logout()
{
element=driver.findElement(logout);
return element;
}
public static WebElement loginpage()
{
element=driver.findElement(loginpage);
return element;
}
}



