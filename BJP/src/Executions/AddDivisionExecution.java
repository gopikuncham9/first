package Executions;

import org.testng.annotations.Test;

import Actions.AddDivisionActions;
import Objects.BrowserCode;
/* author Gopi Kuncham
 * Sheet name-----Adddivision 
*TC_001
*TC_002
*TC_003
*TC_004
*/
public class AddDivisionExecution {
	@Test
	public void Signin() throws Exception
	{
	Thread.sleep(5000);
	BrowserCode.Browser();
	AddDivisionActions.addDivision();
	
	}


}
