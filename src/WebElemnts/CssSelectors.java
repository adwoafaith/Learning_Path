package WebElemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 //visit the site
		 driver.get("http://ebay.com");
		 driver.manage().window().maximize();
		 
		 // scrolling through a page
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 driver.findElement(By.cssSelector("#gh-ac")).sendKeys("ONePLus6T");
		 driver.findElement(By.cssSelector("#gh-btn")).click();
		 js.executeScript("window.scrollBy(0,300)");
		 
	}

}
