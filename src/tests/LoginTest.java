package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest{
	LoginPage lp = new LoginPage();
	WebDriver driver;
	
		
//	}
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  lp.OpenBrowser();
	  lp.OpenLoginPage();
	  
  }
//	  System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver.exe");
//	//FirefoxDriver driver = new FirefoxDriver();// created for firefox 
//	 driver= new ChromeDriver();
//	  //open chrome
//	 driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=frTJCFXlVDs&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiZnJUSkNGWGxWRHMiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0ODkxNjU0NSwiaWF0IjoxNjQ4OTE1MzQ1LCJqdGkiOiI0MTkxNTYyZC1iNjE3LTRjYWUtYTNlNy01NDEyNjI0MzMyZjEiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.USSGVe1ElgXAErJJ7SWrkVxj3kIhW5Tf7O-K6nINfcqT1J8fbyUtFauR8OOoOcsHzgmWySbQ--f63dd9JVHM-Z2GSd1hmMpSd8ou3LXKn3dlF5gt39_NthYa9WcqEAXnjQ4HfH5G9RDYv9-zrm65yGcF2dAv-O_XCtPapIskeIxpomVQjC7Es5IUZC1M_3NQ2bBfSALEMu9qYLvH_7UKnNQFTAnfDCGkCON0__5Od8Ya9fvPFU77NQtqAkgVUZHPOS5KiXjEAzqlfw3TtyhuN9wRF8spa1t_rgA0yfdNgBHOgYCyD4et-vUdYW4zf-miAV8bZjk_PmuD-YtkMCLRsQ&preferred_environment=l");
//	 // driver.findElement(By.partialLinkText("Sign In")).click();
//	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		
//	  //open login page
//	  //implicit wait
//  }

  @AfterMethod
  public void afterMethod() {
	lp.quit();
	
  }


 @Test (priority = 1)
  public void loginWithWrongDetails() throws InterruptedException {
	 //enter wrong email
	 //enter wrong password
	 lp.login("aerior","12345");
	 
//	// driver.findElement(By.partialLinkText("Sign In")).click();
//	 driver.findElement(By.id("usernameInput-input")).sendKeys("aadfjfjda");
//		driver.findElement(By.name("password")).sendKeys("12345");
//		driver.findElement(By.id("signIn")).click();
//	Thread.sleep(3000);
//	//verify error message
//	String expected = "Please check your card number / username or password and try again.";
//	String actual = driver.findElement(By.id("globalError")).getText();
//	Assert.assertTrue(expected.equals(actual));
  }
 @Test (priority = 2)
 public void loginWithspecialCharater() throws InterruptedException {
	//lp.loginE();
	 lp.login("qwer$%^", "qwas1@");
 }
 @Test (priority =3)
	 
 public void LoginWithEmptyEmailTest() throws InterruptedException {
	// lp.login1();
	 lp.login("", "qwerty");
	 lp.readEmailErr();
	// driver.findElement(By.id("usernameInput-input"));
	//driver.findElement(By.name("password")).sendKeys("12345");
//		driver.findElement(By.id("signIn")).click();
//	Thread.sleep(3000);
//	//verify error message
//	String expected = "Please check your card number / username or password and try again.";
//	String actual = driver.findElement(By.id("globalError")).getText();
//	Assert.assertTrue(expected.equals(actual));
	 
 }
 @Test (priority = 4)
 public void LOginWithEmptyPassword() throws InterruptedException {
	 //lp.login2();
	 lp.login("qwasd", "");
	 lp.readPassErr();
//	 driver.findElement(By.id("usernameInput-input"));
//		//driver.findElement(By.name("password")).sendKeys("12345");
//		driver.findElement(By.id("signIn")).click();
//	Thread.sleep(3000);
//	//verify error message
//	String expected = "Please check your card number / username or password and try again.";
//	String actual = driver.findElement(By.id("globalError")).getText();
//	Assert.assertTrue(expected.equals(actual));
	 
 }
 
}

