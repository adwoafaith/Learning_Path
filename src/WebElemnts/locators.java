package WebElemnts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class locators {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//find element by Id
		driver.get("https://accounts.google.com/");
		WebElement username =driver.findElement(By.id("identifierId"));
		username.sendKeys("adwoafaith");
		
		//find element  by name
		driver.get("https:www.google.com/");
		WebElement name =driver.findElement(By.name("identifierId"));
		name.sendKeys("Deeper life");
		
	
		//used when there is no id or name attribute on the page
		//find element by link text(only used for hyperlinks)
		driver.findElement(By.linkText("LCD")).click();
		
		
		//find element by  css selector
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.cssSelector("#login-username")).sendKeys("mine@gmail.com");
		
		//Partial link text
		//so if the text in the link is login here 
		//you can provide just login
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.partialLinkText("login")).sendKeys("mine@gmail.com");
		
		
		
		//using xpath
		//we have absolute and relative
		//input[@id='login-username'
		//input[@type='text']
		
		
}
}
