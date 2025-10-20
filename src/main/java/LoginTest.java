import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginTest {
    private static final Logger logger = LogManager.getLogger(LoginTest.class);
public static void main (String [] args) {
	runTest();
	
}
    public static void runTest() {
        logger.info("Starting login test");
        logger.debug("Checking username field");
        logger.error("Login failed due to invalid credentials");
    }
}
