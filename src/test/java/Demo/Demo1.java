package Demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "ChromeDriver");
		
		
		  WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize(); 
		  driver.get("http://demo.automationtesting.in/Windows.html");
		  driver.findElement(By.cssSelector("a[href='#Seperate']")).click();
		  //driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']/button")).click();
		  driver.findElement(By.cssSelector("div#Seperate>button")).click();
		  Set<String> windowHandle =  driver.getWindowHandles();
		  System.out.println(windowHandle);
		  
		 Iterator<String> iterator =  windowHandle.iterator();
		 
		 String parentHandle=iterator.next();
		 System.out.println(parentHandle);
		 String childHandle=iterator.next();
		 System.out.println(childHandle);
		 
		 driver.switchTo().window(childHandle);
		 
		 driver.findElement(By.xpath("//a[@href='/documentation/webdriver/']")).click();
		  
		 driver.switchTo().window(parentHandle);
		 System.out.println(driver.getTitle());
		 
		 driver.quit();
		 
		  //added comment to validate git 
		  
		/*
		 * WebElement frame1=driver.findElement(By.id("iframeResult"));
		 * driver.switchTo().frame(frame1);
		 * driver.findElement(By.xpath("/html/body/button")).click(); Alert
		 * alert=driver.switchTo().alert(); System.out.println(alert.getText());
		 * 
		 * alert.accept();
		 */
		  
		/*
		 * driver.manage().window().maximize(); WebElement
		 * frame1=driver.findElement(By.id("iframeResult"));
		 * driver.switchTo().frame(frame1);
		 * System.out.println(driver.findElement(By.xpath("/html/body/button")).getText(
		 * )); driver.findElement(By.xpath("/html/body/button")).click();
		 */
		  
		
		  
		
		/*
		 * driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		 * driver.findElement(By.xpath("//span[text()='From']")).click();; WebElement
		 * from=driver.findElement(By.cssSelector("input[placeholder=From]"));
		 * from.sendKeys("re"); from.sendKeys(Keys.ARROW_DOWN);
		 * from.sendKeys(Keys.ENTER);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement to=driver.findElement(By.cssSelector("input[placeholder='To']"));
		 * to.sendKeys("in"); to.sendKeys(Keys.ARROW_DOWN); to.sendKeys(Keys.ENTER);
		 */
		  
		  
		/*
		 * WebElement dd=driver.findElement(By.id("dropdown-class-example")); Select
		 * s=new Select(dd); s.selectByIndex(2);
		 */
		/*
		 * WebElement multiselect = driver.findElement(By.id("multi-select")); Select s
		 * =new Select(multiselect);
		 * 
		 * 
		 * s.selectByIndex(7); s.selectByIndex(5); WebElement firstSelected=
		 * s.getFirstSelectedOption(); System.out.println(firstSelected.getText());
		 * Thread.sleep(2000); List<WebElement> allSelected =s.getAllSelectedOptions();
		 * System.out.println(allSelected.size()); Thread.sleep(2000); s.deselectAll();
		 * List<WebElement> allSelected1 =s.getAllSelectedOptions();
		 * System.out.println(allSelected1.size());
		 */
		  
		/*
		 * List<WebElement> ddList = driver.findElementsByName("States");
		 * 
		 * for (int i=0; i<ddList.size() ; i++) {
		 * System.out.println(ddList.get(i).getAttribute("value"));
		 * System.out.println(ddList.get(i).getText());
		 * 
		 * }
		 * 
		 * driver.close();
		 */
		  
		  
		  

	}

}
