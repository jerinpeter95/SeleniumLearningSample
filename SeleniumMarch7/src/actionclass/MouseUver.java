package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseUver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JERIN'S\\Documents\\SeleniumItems\\Chrome 100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    //Login to page as admin
	    driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
	    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();		
	    
	    //mouseover to admin-->usermanagement-->click user
	    Actions act=new Actions(driver);
	    
	    WebElement admin=driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b"));
	    WebElement usmg=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
	    WebElement user=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
	    
	    /*act.moveToElement(admin).build().perform(); 
	    act.moveToElement(usmg).build().perform();
	    act.moveToElement(user).click().build().perform();*/ 
	    
	    //OR
	    
	    act.moveToElement(admin).moveToElement(usmg).moveToElement(user).click().build().perform();
	    

	}

}
