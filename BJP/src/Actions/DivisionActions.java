package Actions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Objects.BrowserCode;
import Objects.DivisionHomeInspect;

public class DivisionActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	
public static void Login() throws Exception{
	/*WebElement butttonToClick = BrowserCode.driver.findElement(By.id("dd"));
	((JavascriptExecutor)BrowserCode.driver).executeScript("arguments[2].click();",butttonToClick );*/
	DivisionHomeInspect.division().click();
	File f1=new File("D:\\gopikuncham\\bjpcode\\ExternalData\\Sadanandam_BJP_Division Page.xlsx");
	FileInputStream fis=new FileInputStream(f1);
	
	workbook =new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(8);

	for(int j=2; j<=sheet.getLastRowNum(); j++) {
		 cell =sheet.getRow(j).getCell(1);
		 DivisionHomeInspect.divisionuser().sendKeys(cell.getStringCellValue());
		 cell =sheet.getRow(j).getCell(2);
		 DivisionHomeInspect.divisionpass().sendKeys(cell.getStringCellValue());
	
		 DivisionHomeInspect.divisionlogin().click();
}
}
}