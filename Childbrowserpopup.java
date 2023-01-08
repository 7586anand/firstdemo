package collection;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/bitlasoft/Downloads/chromedriver_linux64 (4)/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//String parent_id=driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
		//System.out.println(parent_id);
		int count=allwh.size();
		System.out.println(count);
		
	}

}
