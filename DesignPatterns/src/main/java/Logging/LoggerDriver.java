package Logging;

import java.util.logging.LogManager;

public class LoggerDriver {
  public static void main(String[] args) {
    MyLogger logger = MyLogManager.getLogger();
    logger.writeLog("logging");
  }
}
