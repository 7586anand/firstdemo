package collection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/bitlasoft/Downloads/chromedriver_linux64 (4)/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		Thread.sleep(5);
		driver.findElement(By.xpath("//*[@id='toPlaceName']")).click();
		Thread.sleep(5);
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}

}
