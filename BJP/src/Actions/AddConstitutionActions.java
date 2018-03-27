package Actions;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import Objects.AddConstitutionInsp;
import Objects.BrowserCode;
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
public class AddConstitutionActions {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFSheet sheet1;
	static XSSFCell cell;
	
public static void addConstitution() throws Exception{
	BrowserCode.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	AddConstitutionInsp.admin().click();
	File f1=new File("D:\\gopikuncham\\bjpcode\\ExternalData\\BJP Excel1.xlsx");
	FileInputStream fis=new FileInputStream(f1);
	
	workbook =new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(3);
	sheet1 = workbook.getSheetAt(6);
	for(int j=1; j<=1; j++) {
		 cell =sheet.getRow(j).getCell(1);
		 AddConstitutionInsp.adminuser().sendKeys(cell.getStringCellValue());
		 cell =sheet.getRow(j).getCell(2);
		 AddConstitutionInsp.adminpass().sendKeys(cell.getStringCellValue());
	
		 AddConstitutionInsp.adminlogin().click();
		 	
		 try {
				
			 String s2 =BrowserCode.driver.findElement(By.xpath("//*[@id=\"link-effect-2\"]/ul/li[2]/a")).getText();
			 System.out.println("text" +s2);
			 String s3="ADD CONSTITUTION";
			 if (s2.equalsIgnoreCase(s3)) {
	

	for(int i=1; i<=2; i++) {
		AddConstitutionInsp.addconstitution().click();
		 cell =sheet1.getRow(i).getCell(1);
		 AddConstitutionInsp.constitution().sendKeys(cell.getStringCellValue());
		/* cell =sheet.getRow(i).getCell(2);
		 AddConstitutionInsp.division().sendKeys(cell.getStringCellValue());*/
		 cell =sheet1.getRow(i).getCell(2);
		 AddConstitutionInsp.firstname().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(3);
		 AddConstitutionInsp.lastname().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(4);
		 AddConstitutionInsp.username().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(5);
		 
		 if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
	    	 int k =(int)cell.getNumericCellValue();
	    		String g=String.valueOf(k);
	    	            System.out.println(g);
	    	            
	    	            AddConstitutionInsp.password().sendKeys(g);
	   			   }
	       else {
	    	   AddConstitutionInsp.password().sendKeys(cell.getStringCellValue());
	         }
		 
		 
		 cell =sheet1.getRow(i).getCell(6);
		 AddConstitutionInsp.email().sendKeys(cell.getStringCellValue());
		 cell =sheet1.getRow(i).getCell(7);
           if(cell.getCellType() ==XSSFCell.CELL_TYPE_NUMERIC) {
	    	 int k =(int)cell.getNumericCellValue();
	    		String g=String.valueOf(k);
	    	            System.out.println(g);
	    	            
	    	            AddConstitutionInsp.mobile().sendKeys(g);
	   			   }
	       else {
	    	   AddConstitutionInsp.mobile().sendKeys(cell.getStringCellValue());
	         }
           cell =sheet1.getRow(i).getCell(8);
           AddConstitutionInsp.gender().selectByValue(cell.getStringCellValue());
          
           AddConstitutionInsp.register().click();
	}
	
	AddConstitutionInsp.addconstitution().click();
	
	AddConstitutionInsp.register().click();
	}
		 }
		 catch (Exception e) {
			System.out.println(e);
		}
	}
	}
	
	
		
	

}	

//}

