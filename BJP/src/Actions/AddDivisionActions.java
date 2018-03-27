package Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import Objects.BrowserCode;
import Objects.AddDivisionInspectElements;
import Objects.AdminLoginInspectElements;
/* author Gopi Kuncham
 * Sheet name-----adddivision 
*TC_001
*TC_002
*TC_003
*TC_004
*
*/
public class AddDivisionActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFSheet sheet1;
	static XSSFCell cell;
	
public static void addDivision() throws Exception{
	AddDivisionInspectElements.admin().click();
	
	File f1=new File("D:\\gopikuncham\\bjpcode\\ExternalData\\BJP Excel1.xlsx");
	FileInputStream fis=new FileInputStream(f1);
	workbook =new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(3);
	sheet1 = workbook.getSheetAt(8);
	System.out.println("sheet.getLastRowNum()"+sheet.getLastRowNum());
	for(int j=1; j<=sheet.getLastRowNum(); j++) {
		 cell =sheet.getRow(j).getCell(1);
		 AddDivisionInspectElements.adminuser().sendKeys(cell.getStringCellValue());
		 cell =sheet.getRow(j).getCell(2);
		 AddDivisionInspectElements.adminpass().sendKeys(cell.getStringCellValue());
	 AddDivisionInspectElements.adminlogin().click();
	 
	 try {
	
		 String s2 =BrowserCode.driver.findElement(By.xpath("//*[@id=\"link-effect-2\"]/ul/li[2]/a")).getText();
		 System.out.println("text" +s2);
		 String s3="ADD CONSTITUTION";
		 if (s2.equalsIgnoreCase(s3)) {
	
	for(int i=1; i<=2; i++) {
		
		AddDivisionInspectElements.adddivision().click();
		 cell =sheet1.getRow(i).getCell(1);
		 AddDivisionInspectElements.constitution().selectByValue(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(2);
		 AddDivisionInspectElements.division().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(3);
		 AddDivisionInspectElements.firstname().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(4);
		 AddDivisionInspectElements.lastname().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(5);
		 AddDivisionInspectElements.username().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(6);
		 AddDivisionInspectElements.password().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(7);
		 AddDivisionInspectElements.email().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(8);
		 
           if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
	    	 int k =(int)cell.getNumericCellValue();
	    		String g=String.valueOf(k);
	    	            System.out.println(g);
	    	            Thread.sleep(5000);
	    	            AddDivisionInspectElements.mobile().sendKeys(g);
	   			   }
	       else {
		                AddDivisionInspectElements.mobile().sendKeys(cell.getStringCellValue());
	         }
           cell =sheet1.getRow(i).getCell(9);
           AddDivisionInspectElements.gender().selectByValue(cell.getStringCellValue());
           Thread.sleep(5000);
           
           AddDivisionInspectElements.register().click();
           System.out.println("clicked on register");
	}
	
	Thread.sleep(5000);
	AddDivisionInspectElements.adddivision().click();
	Thread.sleep(5000);
	AddDivisionInspectElements.register().click();
	Thread.sleep(5000);
	AddDivisionInspectElements.logout().click();
	
		 }
	 }
	
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
		
	 }
	 
	}
	
	
	}
	
	
		
	

	

//}