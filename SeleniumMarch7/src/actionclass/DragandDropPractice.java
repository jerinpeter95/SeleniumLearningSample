package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JERIN'S\\Documents\\SeleniumItems\\Chrome 100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source=driver.findElement(By.id("box1"));
		
		WebElement target=driver.findElement(By.id("box101"));
		
		Actions act=new Actions(driver);
		
		//act.clickAndHold(source).moveToElement(target).release().build().perform();	
		
		//OR
		
		act.dragAndDrop(source, target).build().perform();

	}

}
