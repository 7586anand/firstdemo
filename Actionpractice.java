package collection;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionpractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/bitlasoft/Downloads/chromedriver_linux64 (4)/chromedriver");
		WebDriver driver=new ChromeDriver();
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		WebElement src=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
//		WebElement dst=driver.findElement(By.xpath("//div[.='Spain']"));
//		Actions act=new Actions(driver);
//		act.dragAndDrop(src, dst).perform();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement rclick=driver.findElement(By.id("opentab"));
		Actions act=new Actions(driver);
		act.contextClick(rclick).perform();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		
		WebElement mouse=driver.findElement(By.id("mousehover"));
		act.moveToElement(mouse).perform();
		
		

	}
}
