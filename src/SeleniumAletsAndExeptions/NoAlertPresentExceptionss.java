package SeleniumAletsAndExeptions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException; //always import from selenium not java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertPresentExceptionss {


		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//visit google
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			//this element is not present
			
			try {
				driver.switchTo().alert().accept(); 
			}
			catch(NoAlertPresentException E) {
			E.printStackTrace();
			}
			
			driver.quit();

		}

	}



