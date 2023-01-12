package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","/home/bitlasoft/Downloads/chromedriver_linux64 (4)/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(5);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hello");
		Thread.sleep(5);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		System.out.println("yes clicked on second link");
		
		
		
	}

}
