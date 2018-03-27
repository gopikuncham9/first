package Actions;

import Objects.IndexInspectElements;



/* author Gopi Kuncham
 * Sheet name-----Index 
*TC_001
*TC_002
*
*/
public class IndexActions {
	public static void index() {
	 IndexInspectElements.loginpage().click();
	IndexInspectElements.adminstrator().click();
	 IndexInspectElements.loginpage().click();
	IndexInspectElements.constitution().click();
	 IndexInspectElements.loginpage().click();
	IndexInspectElements.division().click();
	 IndexInspectElements.loginpage().click();
}
}