package spjportal;


	import java.lang.reflect.Method;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Edit {
		static Logger log = LogManager.getLogger(Edit.class);
		@Test(priority=2)
		public void Edit(Method method) throws InterruptedException {
			System.out.println("\n Welcome \n");
		     log.info("=============Automate Testing============ ");
		     Reporter.log( "=============Automate Testing Start============", true );

		     WebDriverManager.chromedriver().setup();
			    ChromeDriver driver = new ChromeDriver();
		        JavascriptExecutor js = (JavascriptExecutor) driver;

			    log.info("=============Test name============: " + method.getName());  
			    Reporter.log( "=============Test name=======:"+method.getName(), true );

			    log.info("Launching chrome browser");
			    Reporter.log("Launching chrome browser");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				driver.get("https://sp-jain-playground-adminportal.ken42.com/");
				log.info("Launching the FrontEnd portal");
				Reporter.log( "Launching the FrontEnd portal", true );

				driver.manage().window().maximize();
				log.info("Maximize the Browser");
				Reporter.log( "Maximize the Browser", true );

				 driver.findElement(By.xpath("//span[.='Sign In']")).click();
		         Thread.sleep(2000);
		     	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[1]/div/button")).click();
		     	Thread.sleep(1000);
		         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[3]/div[1]")).click();
		         Thread.sleep(1000);
		         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[3]/div[2]/div/div/ul/div[6]/a/div/span")).click();
		         Thread.sleep(3000);
		     		
		     		Thread.sleep(1000);
		     		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[9]/button")).click();
		     	
		     	
		     		Thread.sleep(1000);
		     		driver.findElement(By.xpath("//input[@name=\"protein\"]")).sendKeys("02:30");
		     
		     		Thread.sleep(1000);
		     		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[4]/div/div[2]/input")).sendKeys("20-08-2020");
		     	
		     		Thread.sleep(1000);
		     		driver.findElement(By.xpath("//input[@name=\"exam_type\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"ENd-term");
		     	
		     	
		     		Thread.sleep(1000);
		     		driver.findElement(By.xpath("//input[@name=\"duration\"]")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"45");
	
		     		Thread.sleep(1000);
		     		driver.findElement(By.xpath("//input[@name=\"venue_link\"]")).sendKeys(Keys.chord(Keys.CONTROL,"a"),"http://example.com/login");
		     		
		     		Thread.sleep(1000);
		     		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[9]/button[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a"),"http://example.com/login");
		     	
		     	}

			     
}

