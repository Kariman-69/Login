package newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait; 
import org.openqa.selenium.support.ui.ExpectedConditions; 

import io.github.bonigarcia.wdm.WebDriverManager;






public class NewTest {
	 

@Test public void login()  { 
	
	
	/*WebDriverManager.chromedriver ().setup (); 
	WebDriver driver = new ChromeDriver (); 
	driver.manage ().  window () .maximize (); 
	
	WebDriverWait wait = new
	WebDriverWait (driver, 10);
	driver.get ("https://www.douglas.de/mydouglas/login" );
	By cookies_accept = By.id ("uc-btn-accept-banner");
	wait.until (ExpectedConditions.elementToBeClickable (By.id ("uc-btn-accept-banner"))).click (); 
	//Correct Credentials scenario
	wait.until (ExpectedConditions.elementToBeClickable (By.xpath ("//*[@data-ui-name=\"loginForm.email\"]")));
	WebElement email_field = driver.findElement (By.xpath ("//*[@data-ui-name=\"loginForm.email\"]")); 
	email_field.sendKeys ("karemanelmnesy69@gmail.com");
	
	wait.until (ExpectedConditions.elementToBeClickable (By.xpath ("//*[@data-ui-name=\"loginForm.password\"]"))); 
	WebElement password = driver.findElement (By.xpath ("//*[@data-ui-name=\"loginForm.password\"]")); 
	password.sendKeys ("Kariman_12345"); 
	
	WebElement loginBtn = driver.findElement (By.xpath ("/html/body/responsive-design/main/div/div[3]/div[1]/div/div[1]/div/form/button"))  ;  
	loginBtn.click ();
	String actualUrl="https://www.douglas.de/mydouglas/";
    String expectedUrl= "https://www.douglas.de/mydouglas/";
     Assert.assertEquals(expectedUrl,actualUrl); */
    
    
	
	
	//Wrong credentials scenario
	
/*	WebDriverManager.chromedriver ().setup (); 
	WebDriver driver = new ChromeDriver (); 
	driver.manage ().  window () .maximize (); 
	
	WebDriverWait wait = new
	WebDriverWait (driver, 10);
	driver.get ("https://www.douglas.de/mydouglas/login" );
	By cookies_accept = By.id ("uc-btn-accept-banner");
	wait.until (ExpectedConditions.elementToBeClickable (By.id ("uc-btn-accept-banner"))).click (); 
	
	wait.until (ExpectedConditions.elementToBeClickable (By.xpath ("//*[@data-ui-name=\"loginForm.email\"]")));
	WebElement email_field = driver.findElement (By.xpath ("//*[@data-ui-name=\"loginForm.email\"]")); 
	email_field.sendKeys ("karemanelmnesy69@gmail.com");
	
	wait.until (ExpectedConditions.elementToBeClickable (By.xpath ("//*[@data-ui-name=\"loginForm.password\"]"))); 
	WebElement password = driver.findElement (By.xpath ("//*[@data-ui-name=\"loginForm.password\"]")); 
	password.sendKeys ("Kariman"); 
	
	WebElement loginBtn = driver.findElement (By.xpath ("/html/body/responsive-design/main/div/div[3]/div[1]/div/div[1]/div/form/button"))  ;  
	loginBtn.click (); 
	
	if(driver.findElement(By.xpath("/html/body/responsive-design/main/div/div[3]/div[1]/div/div[1]/div/form/div/span"))!= null)
	
	
	{
		System.out.println("Wrong Credantials");

		}else{

		System.out.println("Login successfully");

		} */
	
	

	//Reset password scenario 
	
	
	WebDriverManager.chromedriver ().setup (); 
	WebDriver driver = new ChromeDriver (); 
	driver.manage ().  window () .maximize (); 
	
	WebDriverWait wait = new
	WebDriverWait (driver, 10);
	driver.get ("https://www.douglas.de/mydouglas/login" );
	By cookies_accept = By.id ("uc-btn-accept-banner");
	wait.until (ExpectedConditions.elementToBeClickable (By.id ("uc-btn-accept-banner"))).click (); 
	
	wait.until (ExpectedConditions.elementToBeClickable (By.xpath ("//*[@data-ui-name=\"loginForm.email\"]")));
	WebElement email_field = driver.findElement (By.xpath ("//*[@data-ui-name=\"loginForm.email\"]")); 
	email_field.sendKeys ("karemanelmnesy69@gmail.com");
	
	wait.until (ExpectedConditions.elementToBeClickable (By.xpath ("//*[@data-ui-name=\"loginForm.password\"]"))); 
	WebElement password = driver.findElement (By.xpath ("//*[@data-ui-name=\"loginForm.password\"]")); 
	password.sendKeys ("Kariman"); 
	
	WebElement loginBtn = driver.findElement (By.xpath ("/html/body/responsive-design/main/div/div[3]/div[1]/div/div[1]/div/form/button"))  ;  
	loginBtn.click (); 
	
	
	WebElement passLink = driver.findElement(By.xpath("/html/body/responsive-design/main/div/div[3]/div[1]/div/div[1]/div/form/div/span"));
	
	passLink.click();
	
	
	WebElement submitPass = driver.findElement (By.xpath ("/html/body/responsive-design/main/div/div/form/div/div/div/div/button"))  ;  
	submitPass.click ();  
}


} 
	  
	