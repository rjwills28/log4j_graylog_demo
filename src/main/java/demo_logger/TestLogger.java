package demo_logger;

import org.apache.log4j.Logger;  

public class TestLogger {
	static Logger logger = Logger.getLogger(TestLogger.class.getName());  

    public static void main(String[] args) {
        logger.info("Hello World!");
    }
}
