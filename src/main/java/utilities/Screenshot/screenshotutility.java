package utilities.Screenshot;

import globalResources.GLOBALSTATIC;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class screenshotutility {


        public static void  CaptureScreenschot(String  screenshotName) {
            try {
                TakesScreenshot screenshot = (TakesScreenshot) GLOBALSTATIC.driver;
                File screenshotSource = screenshot.getScreenshotAs(OutputType.FILE);
                File screenshotDestination = new File("D:/TestsRunEvidences/"+GLOBALSTATIC.Testcase_ID+"/"+screenshotName+".png");
                FileUtils.copyFile(screenshotSource,screenshotDestination);
            }
            catch(IOException e ){
                System.out.println("Something wrong with source & destination of screenshot location");

            }

        }
}
