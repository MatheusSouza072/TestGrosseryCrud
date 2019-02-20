package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Utils {

	public static void logPrint(String strLog) {

		ExtentTest extentTest = TestRule.getExtentTest();
		try {
			efetuarScreenshot(strLog);
			extentTest.log(Status.INFO, strLog,
					MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir") + "/src/test/resources/Screenshots_Log/" + strLog + ".png").build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void efetuarScreenshot(String strLog) {
		File scrFile = ((TakesScreenshot) TestRule.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(
					System.getProperty("user.dir") + "/src/test/resources/Screenshots_Log/" + strLog + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
