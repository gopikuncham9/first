package Executions;

import org.testng.annotations.Test;

import Actions.AddConstitutionActions;
import Actions.ViewConstitutionActions;
import Objects.BrowserCode;
/* author Gopi Kuncham
 * Sheet name-----Viewconstitution  
*TC_001
*TC_002
*TC_003
*TC_004
*/
public class ViewConstitutionExecution {
	@Test
	public void Signin() throws Exception 
	{

	BrowserCode.Browser();
	ViewConstitutionActions.viewConstitution();
	
	}
}

