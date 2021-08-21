package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppLogger {

  private static Logger logger;

  public static Logger getLogger() {
    if (logger == null) {
      logger = LogManager.getRootLogger();
    }
    return logger;
  }
}
