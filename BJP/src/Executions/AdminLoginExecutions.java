package Executions;

import org.testng.annotations.Test;

import Actions.AdminLoginActions;
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
public class AdminLoginExecutions {
	@Test
	public void adminLoginEx() throws Exception
	{
	Thread.sleep(5000);
	BrowserCode.Browser();
	AdminLoginActions.adminLogin();
	
	}


}