package WebElemnts;
import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		//instantiate the action class and link it to the driver
		Actions builder = new Actions(driver);
		
		//using the moveToElement method will shift the cursor to the centre of the element to be selected
		builder.moveToElement(driver.findElement(By.xpath("//a[@href='#' and @class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat' and @data-toggle='dropdown']//b[@class='caret']"))).build().perform();
		System.out.println("found");
		Thread.sleep(3000);
		
		//find software testing under the drop down and clicking it
		WebElement test = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown_menu_multi_level hidden-xs hidden-sm']//li//a[text()='Software Testing']"));
		builder.moveToElement(test).build().perform();
		Thread.sleep(3000);
		test.click();
		System.out.println("found2");
		
		
		//find the search box
		Thread.sleep(3000);
		WebElement find = driver.findElement(By.className("open_search_overlay"));
		builder.moveToElement(find).build().perform();		
		Thread.sleep(3000);
		System.out.println("found3");
//		
		//click on the search button
		WebElement search = driver.findElement(By.xpath("//div[@class='search_header']"));
		builder.moveToElement(search).build().perform();
		Thread.sleep(3000);
		System.out.println("found4");
		
		
		//lets perform the actions
		builder
				.sendKeys(find,"selenium")
				.keyDown(search,Keys.SHIFT)
				.keyUp(search,Keys.SHIFT)
				.build()
		        .perform();
		driver.quit();
//		
//		
//		
//		

	}

}
