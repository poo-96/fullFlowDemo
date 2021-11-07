package Demo;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		WebElement src=driver.findElementByXPath("//*[@id='draggable']");
		WebElement tgt=driver.findElementByXPath("//*[@id='droppable']");
		
		
		Actions action=new Actions(driver);
		action.dragAndDrop(src, tgt).perform();;
		
		
		
		
		
		
		
		
		
		
		/*
		 * WebElement
		 * e=driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[5]/a"));
		 * 
		 * Actions action=new Actions(driver); action.moveToElement(e).perform();
		 * //driver.findElement(By.xpath("//a[text()='Makeup']")).click();
		 * driver.findElementByXPath("//a[text()='Makeup']").click();
		 */
		
	}

}
