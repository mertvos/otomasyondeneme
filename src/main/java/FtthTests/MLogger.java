package FtthTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;

import java.util.Date;
import java.util.Iterator;

public class MLogger {

    public static String getMessage(WebDriver driver){
        Logs logs = driver.manage().logs();
        LogEntries logEntries = logs.get(LogType.SERVER);
        String mLog ="";
        Iterator<LogEntry> logIterator = logEntries.iterator();
        while(logIterator.hasNext()){
            String logMessage = logIterator.next().getMessage();
            Date logDate = new Date( logIterator.next().getTimestamp());
            mLog.concat(logMessage);
        }
        return mLog;
    }
}
