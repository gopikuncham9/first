import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Objects.BrowserCode;

public class AddDivision {
	WebDriver driver;
    XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFSheet sheet1;
	XSSFCell cell;
	//naginidance
	//jukwksa
	//neekkavalcindhi   
	@Test 
	public void read() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "D:\\gopikuncham\\GopiKuncham\\Selenium\\jarfiles\\chromedriver.exe");
		  ChromeOptions co =new ChromeOptions();
			co.addArguments("Start-Maximized");
			 driver= new ChromeDriver(co);
			Thread.sleep(5000);
			driver.get("http://localhost:8081/bjpcode/main.jsp");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.id("ad")).click();
	File f= new File("D:\\gopikuncham\\bjpcode\\ExternalData\\BJP Excel1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	workbook =new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(3);
	sheet1 = workbook.getSheetAt(8);
	for(int j=1; j<=1;j++)
	{
		//driver.findElement(By.xpath("//*[@id=\"link-effect-2\"]/ul/li[3]/a")).click();
		cell =sheet.getRow(j).getCell(1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[1]/input")).sendKeys(cell.getStringCellValue());
		 cell =sheet.getRow(j).getCell(2);
		 driver.findElement(By.name("password")).sendKeys(cell.getStringCellValue());
		 driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
	 
	 try {
	     System.out.println("ened");
		 String s2 =driver.findElement(By.xpath("//*[@id=\"link-effect-2\"]/ul/li[2]/a")).getText();
		 System.out.println("text" +s2);
		 String s3="ADD CONSTITUTION";
		 if (s2.equalsIgnoreCase(s3)) {
	
	for(int i=1; i<=2; i++) {
		
		
		 driver.findElement(By.xpath("//*[@id=\"link-effect-2\"]/ul/li[3]/a")).click();
		 cell =sheet1.getRow(i).getCell(1);
		Select s =new Select(driver.findElement(By.xpath("//*[@id=\"country13\"]")));
		 s.selectByValue(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(2);
		 driver.findElement(By.name("divisionname")).sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(3);
		 driver.findElement(By.name("firstname")).sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(4);
		 driver.findElement(By.name("lastname")).sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(5);
		 driver.findElement(By.name("username")).sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(6);
		 driver.findElement(By.name("password")).sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(7);
		 driver.findElement(By.name("email")).sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(8);
		 
          if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
	    	 int k =(int)cell.getNumericCellValue();
	    		String g=String.valueOf(k);
	    	            System.out.println(g);
	    	            Thread.sleep(5000);
	    	            driver.findElement(By.name("mobile")).sendKeys(g);
	   			   }
	       else {
	    	   driver.findElement(By.name("mobile")).sendKeys(cell.getStringCellValue());
	         }
          cell =sheet1.getRow(i).getCell(9);
          Select s1=new Select(driver.findElement(By.name("gender")));
          s1.selectByValue(cell.getStringCellValue());
          Thread.sleep(5000);
          driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/form/input[8]")).click();
          System.out.println("clicked on register");
	}
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"link-effect-2\"]/ul/li[3]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/form/input[8]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"link-effect-2\"]/ul/li[6]/a")).click();
	
	
		 }
	 }
	
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
		
	 }
	 
	}
	
	
	}
