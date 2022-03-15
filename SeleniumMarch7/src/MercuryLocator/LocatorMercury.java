package MercuryLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorMercury {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JERIN'S\\Documents\\SeleniumItems\\Chrome 100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.xpath("//*[contains(@name='userName')]")).sendKeys("jerin");
		
		System.out.println("success");

	}

}
