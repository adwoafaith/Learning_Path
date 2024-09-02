package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		//lets switch to the frame
		driver.switchTo().frame(0);
		WebElement SourceElement = driver.findElement(By.cssSelector("div[id='draggable'] p"));
		WebElement destinationElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//after we find the target and the source we must perform an action on it 
		//like drag and drop
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		//drag and drop
		action.dragAndDrop(SourceElement, destinationElement).build().perform();
		System.out.println("done");
		driver.quit();

	}

}
