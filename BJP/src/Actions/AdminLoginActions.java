package Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Objects.AdminLoginInspectElements;
import Objects.BrowserCode;

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
public class AdminLoginActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	
public static void adminLogin() throws Exception{
	
	AdminLoginInspectElements.admin().click();
	Thread.sleep(5000);
	File f1=new File("D:\\gopikuncham\\bjpcode\\ExternalData\\BJP Excel1.xlsx");
	FileInputStream fis=new FileInputStream(f1);
	
	workbook =new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(3);

	for(int j=1; j<=3; j++) {
		Thread.sleep(5000);
		 cell =sheet.getRow(j).getCell(1);
		 AdminLoginInspectElements.adminuser().sendKeys(cell.getStringCellValue());
		 cell =sheet.getRow(j).getCell(2);
		 AdminLoginInspectElements.adminpass().sendKeys(cell.getStringCellValue());
	
		 AdminLoginInspectElements.adminlogin().click();
		 Thread.sleep(5000);
		 try {
		 WebElement ele=AdminLoginInspectElements.addconstitution();
		/* System.out.println(ele);
		 String s3="ADD CONSTITUTION";*/
		
		 if (ele.isDisplayed()) {
			 AdminLoginInspectElements.adminlogout().click();
		 }
		 else {
			 BrowserCode.driver.close();
		 }

	     AdminLoginInspectElements.adminlogin().click();
	     
		 if(ele.isDisplayed()){
			 //System.out.println(s3);
	     	Thread.sleep(5000);
	     sheet.getRow(j).createCell(3).setCellValue("pass");
	     FileOutputStream fos= new FileOutputStream(f1);
	     workbook.write(fos);
	  
	     }
	     else {
	    	System.out.println("else");
	     sheet.getRow(j).createCell(3).setCellValue("fail");
	     FileOutputStream fos= new FileOutputStream(f1);
	     workbook.write(fos);
	     }
		 
}

		 catch(Exception e){
			 
			 System.out.println(e);
 }
		
}

}
}