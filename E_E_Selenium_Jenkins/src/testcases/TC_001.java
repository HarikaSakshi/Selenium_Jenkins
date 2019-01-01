package testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_001 {
	@Test
	public void tetcase1() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.findElementById("twotabsearchtextbox").sendKeys("Iphone");
		driver.findElementByXPath("//div[@class='nav-search-submit nav-sprite']/input").click();

		driver.quit();
	}

}
