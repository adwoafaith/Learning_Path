package WebElemnts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElements {
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//visit amazon website
				driver.get("http://www.amazon.in/");
				
				//maximize the web page
				driver.manage().window().maximize();
				
				//getting the element by id;
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
				driver.findElement(By.id("nav-search-submit-button")).click();
				System.out.print("ok");
				
				//selecting by link text
				//driver.findElement(By.linkText("Today's Deals")).click();
				//Thread.sleep(7000);
				
				
				//selecting a check box
				//also using by linktext
				driver.findElement(By.linkText("LCD")).click();
				
				
				
				
				//navigating to another webpage
				driver.navigate().to("http://edureka.co/blog");
				Thread.sleep(4000);
				
				//navigating back to amazon back
				driver.navigate().back();
				System.out.println("i'm back");
				driver.quit();
	}

}
