package Practicalexam;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGPractical {
	WebDriver driver; 
	@BeforeTest 
	public void beforetest() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.setProperty("WebDriver.Chrome.Driver","D:\\Automation practical\\AutomationPractical\\chromedriver\\chromedriver.exe");
       driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
        //driver.navigate().to("https://www.demoblaze.com/index.html#");
        System.out.println("Browser start successfully");
        Thread.sleep(2000);
	}
	@Test
	public void Test() throws InterruptedException {
		
		driver.findElement(By.name("firstname")).sendKeys("Amit");
		Thread.sleep(800);
		driver.findElement(By.name("lastname")).sendKeys("kambali");

	}
	
	@Test(priority=1)
	public void gender() throws InterruptedException {
		
		driver.findElement(By.id("sex-0")).click();
		WebElement s = driver.findElement(By.id("sex-0"));
		boolean b = s.isSelected();
		System.out.println(b);
		Thread.sleep(800);
		driver.findElement(By.id("exp-0")).click();
		WebElement a = driver.findElement(By.id("exp-0"));
		boolean ss = a.isSelected();
		System.out.println(ss);
		Thread.sleep(800);
		
		
	}
	
	
	
	@Test(priority=2)
	public void date() throws InterruptedException {
		driver.findElement(By.id("datepicker")).sendKeys("25/08/1999");
		Thread.sleep(800);
		
		
	}
	
	@Test(priority=3)
	public void checkbox() throws InterruptedException {
		driver.findElement(By.id("profession-0")).click();
		Thread.sleep(800);
		
		
	}
	
	@Test(priority=4)
	public void dropdown() throws InterruptedException {
		
		Select dropdown= new Select(driver.findElement(By.name("continents")));
		dropdown.selectByVisibleText("Europe");
		Thread.sleep(800);
		//WebElement d = driver.findElement(By.name("photo"));
		//d.sendKeys("E:\\aishwarya\\swag.png");
		
		
	}
	
	@Test(priority=5)
	public void uploadimage() throws InterruptedException {
		
		Thread.sleep(800);
		WebElement d = driver.findElement(By.name("photo"));
		d.sendKeys("E:\\aishwarya\\swag.png");
		
		
	}
	
	@AfterTest
	public void end() {
		
		System.out.println("All Test Cases covered");
		
	}
	
}
