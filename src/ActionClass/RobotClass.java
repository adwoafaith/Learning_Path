package ActionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.edureka.co/");
		driver.findElement(By.cssSelector(".ga_courses_click")).click();
		
		Robot robot = new Robot();
		Thread.sleep(3000);
		
	System.out.println("pressing the key");	
		robot.keyPress(KeyEvent.VK_DOWN);
		System.out.println("the key pressed");	
		Thread.sleep(4000);
		
		//press the tab key
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		System.out.println("tab1");
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		System.out.println("tab2");
		robot.keyPress(KeyEvent.VK_TAB);
		System.out.println("tab3");
		
		
		//mouse move
		robot.mouseMove(30, 100);
		System.out.println("mouse1");
		driver.quit();

	}

}
