package myLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumStart {

	public static void main(String[] args) {
		//System.setProperty("Webdriver.chrome.driver", "/drivers/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String URL = "https://www.amazon.in/";
		driver.get(URL);
		System.out.println("The browser has opened");
		
		
	}

}
