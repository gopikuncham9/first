package Executions;

import org.testng.annotations.Test;

import Actions.IndexActions;
import Objects.BrowserCode;
/* author Gopi Kuncham
 * Sheet name-----Index 
*TC_001
*TC_002
*
*/
public class IndexExecutions {

	@Test
	public void indexEx() throws Exception {
		Thread.sleep(5000);
		BrowserCode.Browser();
		IndexActions.index();
	}
	
}

