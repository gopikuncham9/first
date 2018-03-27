package Executions;

import org.testng.annotations.Test;

import Actions.DivisionActions;
import Objects.BrowserCode;

public class DivisionExecution {
	@Test
	public void Signin() throws Exception
	{
	Thread.sleep(5000);
	BrowserCode.Browser();
	DivisionActions.Login();
	
	}


}
