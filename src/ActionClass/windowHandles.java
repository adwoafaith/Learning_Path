package ActionClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent handle" +parentWindowHandle);
		System.out.println("found");
		
		WebElement myWindow = driver.findElement(By.cssSelector("#windowButton"));
		
		
		//we want to click the window 3 times so in other to do that let's use the for loop
	
		for(int i=0;i<3;i++) {
			myWindow.click();
			Thread.sleep(3000);
		}
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle: allWindowHandles) {
			System.out.println("Window handle" + handle);
		}
		driver.close();

	}

}
