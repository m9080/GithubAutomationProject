package utils;
import utils.CommenMethodsWait;
import utils.CommenMethodsPageOperation;
import utils.CommenScreenshot;

import org.openqa.selenium.WebDriver;

import utils.CommenMethodsBrowserOperation;

public class CommenMethods {
    public CommenMethodsWait waits;
    public CommenMethodsPageOperation pageOps;
    public CommenScreenshot screenshot;
    public CommenMethodsBrowserOperation BrowserOps;
/*
    public CommenMethods() {
        waits = new CommenMethodsWait();
        pageOps = new CommenMethodsPageOperation();
        screenshot = new CommenScreenshot();
        BrowserOps = new CommenMethodsBrowserOperation();
    }
    
    */
    
    
 
        public CommenMethods(WebDriver driver) {
            waits = new CommenMethodsWait(driver);
        }
        
        
}
