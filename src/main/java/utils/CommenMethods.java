package utils;

import utils.CommenMenthodsWait;
import utils.CommenMethodsBrowserOperation;
import utils.CommenMethodsPageOperation;
import utils.CommenScreenshot;


public class CommenMethods {

	public CommenMenthodsWait waits;
    public CommenMethodsPageOperation pageOps;
    public CommenMethodsBrowserOperation browserOps;
    public CommenScreenshot ScreenShort;

    public CommenMethods() {
        waits = new CommenMenthodsWait();
        pageOps = new CommenMethodsPageOperation();
        browserOps = new CommenMethodsBrowserOperation();
        ScreenShort = new CommenScreenshot();

        
    }
    
    

}
