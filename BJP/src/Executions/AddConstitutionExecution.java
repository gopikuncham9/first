package Executions;

import org.testng.annotations.Test;

import Actions.AddConstitutionActions;
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
public class AddConstitutionExecution {
	@Test
	public void Signin() throws Exception 
	{

	BrowserCode.Browser();
	AddConstitutionActions.addConstitution();
	
	}
}
