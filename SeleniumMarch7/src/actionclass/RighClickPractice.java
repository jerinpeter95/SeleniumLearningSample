package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RighClickPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JERIN'S\\Documents\\SeleniumItems\\Chrome 100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("/html/body/span"));
		
		act.contextClick(button).build().perform(); //right click on element
		
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click(); //click on copy
		
		System.out.println(driver.switchTo().alert().getText()); //capture alert box text
		
		driver.switchTo().alert().accept(); // close alert box
		

	}

}
