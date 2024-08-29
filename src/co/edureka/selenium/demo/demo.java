package co.edureka.selenium.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open gmail.com
		driver.get("http://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("adwoafaith@gmail.com");
		driver.findElement(By.cssSelector("button.VfPpkd-LgbsSe.VfPpkd-LgbsSe-OWXEXe-k8QpJ.VfPpkd-LgbsSe-OWXEXe-dgl2Hf.nCP5yc.AjY5Oe.DuMIQc.LQeN7.BqKGqe.Jskylb.TrZEUc.lw1w4b[jscontroller=\"soHxf\"][jsname=\"LgbsSe\"][type=\"button\"]")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "gmail";
		
		
		//checking of the title of the page
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Test successful");
			
		} 
		else {
			System.out.println("Test Failed");
		}
		
		
		//maximize the window
		driver.manage().window().maximize();
		driver.quit();
	}

}
