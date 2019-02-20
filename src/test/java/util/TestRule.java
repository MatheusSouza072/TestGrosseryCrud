package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.CadastroPage;

public class TestRule extends CadastroPage {

	private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;

	@Before
	public void beforeCenario(Scenario cenario) {
		if (extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/HtmlReport/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);

		}

		extentTest = extentReport.createTest(cenario.getId());

		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.grocerycrud.com/demo/bootstrap_theme");
	}

	@After
	public void afterCenario(Scenario cenario) {
		extentTest.log(Status.PASS, "Cenário " + cenario.getName() + " executado com sucesso!");
		extentReport.flush();
		driver.quit();

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static ExtentTest getExtentTest() {
		return extentTest;
	}

}
