package Actions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import Objects.BrowserCode;
import Objects.ViewProblemsInspect;
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
public class ViewProblemsActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	static XSSFCell cell;
	
public static void viewProblemsInspect() throws Exception{
	ViewProblemsInspect.admin().click();
	
	File f1=new File("D:\\gopikuncham\\bjpcode\\ExternalData\\BJP Excel1.xlsx");
	FileInputStream fis=new FileInputStream(f1);
	workbook =new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(3);

	System.out.println("sheet.getLastRowNum()"+sheet.getLastRowNum());
	for(int j=1; j<=sheet.getLastRowNum(); j++) {
		 cell =sheet.getRow(j).getCell(1);
		 ViewProblemsInspect.adminuser().sendKeys(cell.getStringCellValue());
		 cell =sheet.getRow(j).getCell(2);
		 ViewProblemsInspect.adminpass().sendKeys(cell.getStringCellValue());
		 ViewProblemsInspect.adminlogin().click();
	 
	 try {
			
		 String s2 =BrowserCode.driver.findElement(By.xpath("//*[@id=\"link-effect-2\"]/ul/li[2]/a")).getText();
		 System.out.println("text" +s2);
		 String s3="ADD CONSTITUTION";
		 if (s2.equalsIgnoreCase(s3)) {
			 ViewProblemsInspect.viewproblems().click();
			 ViewProblemsInspect.kukatpally().click();
			 ViewProblemsInspect.manjeera().click();
			 ViewProblemsInspect.pendingproblems().click();
			 ViewProblemsInspect.logout().click();
}
		 else {
			 BrowserCode.driver.close();
		 }
}
	 catch (Exception e) {
		 
		System.out.println(e);
		
		
	}
}
}
}
