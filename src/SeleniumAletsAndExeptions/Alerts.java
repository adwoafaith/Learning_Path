package SeleniumAletsAndExeptions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//visit the site
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//maximize screen
		driver.manage().window().maximize();
		
		//i'm waiting for the pop up to be visible
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("[class='btn btn-danger']")).click();
		Thread.sleep(3000);
		
		//switchingcontrol to the alert window
		Alert alert = driver.switchTo().alert();
		
		//getting the text on the alert window
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(3000);
		System.out.println("done");
		
		//clicking on the okay button 
		Thread.sleep(3000);
		alert.accept();
		
//		//dealing with pop ups
//		driver.findElement(By.id("Popup")).click(); // i don't have the site
//		Robot robot = new Robot();
//		robot.mouseMove(400,5);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		driver.quit(); 
		

	}

}
