package fi.examcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App 
{
	WebDriver driver;
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
//	public void launchBrowser() 
//	{
//		System.setProperty("webdriver.edge.driver","E:\\selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
//	  	
//
	}
	public void navigate() throws InterruptedException
	{
		driver.navigate().to("https://www.flipkart.com/");
		
		
	}
	public void flipkart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("prashnatgrj515@gmail.com");
		 Thread.sleep(2000);
		//driver.close();
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("identifierNext")).click();
		
	}
	 public void closebrowser() {
			driver.quit();
			
		}
    public static void main( String[] args ) throws InterruptedException
    {
       App ob = new App();
       ob.launchBrowser();
       ob.navigate();
       ob.flipkart();
       ob.closebrowser();
    }
}
