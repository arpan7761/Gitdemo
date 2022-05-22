package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import data.LoginData;

public class LoginPage {

	LoginData dt = new LoginData();
	WebDriver driver;
	/* WebElement email =driver.findElement(By.id("usernameInput-input"));
	 WebElement pass =driver.findElement(By.name("password"));
	 WebElement signin =driver.findElement(By.id("signIn"));
	 WebElement ge =driver.findElement(By.id("globalError"));
	 WebElement passworderr =driver.findElement(By.xpath("//*[contains(text(),'Please enter your username or card number.')]"));*/
	@FindBy(name="password")
	public WebElement pass;
	@FindBy(id="usernameInput-input")
	public WebElement email;
	@FindBy(id="signIn")
	public WebElement signin;
	@FindBy(id="globalError")
	public WebElement ge;
	@FindBy (xpath="//*[contains(text(),'Please enter your username or card number.')]")
	public WebElement passworderr;
	String reademail = ("Please enter your username or card number.");
	String readPass = ("Please enter your username or card number.");
	String globalerr = ("Please check your card number / username or password and try again.");
	public void OpenBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver.exe");
//		//FirefoxDriver driver = new FirefoxDriver();// created for firefox 
		 driver= new ChromeDriver();
		 PageFactory.initElements(driver, this);

//		FileInputStream f = new FileInputStream("C:\\Testing\\prop.properties");
//		Properties prop = new Properties();
//		prop.load(f);
//		String browser = prop.getProperty("browser");
//		System.out.println(browser);
//		System.out.println(prop.getProperty("browser"));
//		if (browser.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "C:\\selenium jars\\geckodriver.exe");
//			 driver = new FirefoxDriver();
//		}else if(browser.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver.exe");
//			 driver = new ChromeDriver();
//		}
//		
//		
//		
//		
}


	
	public void OpenLoginPage() {
		 driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=frTJCFXlVDs&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiZnJUSkNGWGxWRHMiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0ODkxNjU0NSwiaWF0IjoxNjQ4OTE1MzQ1LCJqdGkiOiI0MTkxNTYyZC1iNjE3LTRjYWUtYTNlNy01NDEyNjI0MzMyZjEiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.USSGVe1ElgXAErJJ7SWrkVxj3kIhW5Tf7O-K6nINfcqT1J8fbyUtFauR8OOoOcsHzgmWySbQ--f63dd9JVHM-Z2GSd1hmMpSd8ou3LXKn3dlF5gt39_NthYa9WcqEAXnjQ4HfH5G9RDYv9-zrm65yGcF2dAv-O_XCtPapIskeIxpomVQjC7Es5IUZC1M_3NQ2bBfSALEMu9qYLvH_7UKnNQFTAnfDCGkCON0__5Od8Ya9fvPFU77NQtqAkgVUZHPOS5KiXjEAzqlfw3TtyhuN9wRF8spa1t_rgA0yfdNgBHOgYCyD4et-vUdYW4zf-miAV8bZjk_PmuD-YtkMCLRsQ&preferred_environment=l");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	//method with arguments to make it more generic.
	
	public void login(String a,String b) throws InterruptedException {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
		driver.findElement(By.id("signIn")).click();
	Thread.sleep(3000);
	}
	//simple methods that i used.
	
	public void loginE() throws InterruptedException {
		email.sendKeys("aadfjfjda@##");
		pass.sendKeys("12345");
		signin.click();
	Thread.sleep(3000);
	}
	public void login1() throws InterruptedException {
		//driver.findElement(By.id("usernameInput-input")).sendKeys("aadfjfjda");
		pass.sendKeys("12345");
		signin.click();
	Thread.sleep(3000);
	}
	public void login2() throws InterruptedException {
		email.sendKeys("aadfjfjda");
		//driver.findElement(By.name("password")).sendKeys("12345");
		signin.click();
	Thread.sleep(3000);
	}
	public void readErr() {
		
		String expected=("Please check your card number / username or password and try again.");
		String actual = ge.getText();
		System.out.println(actual);
		
	}
	public void readEmailErr() {
		//String expected =("Please enter your username or card number.");
		String expected = reademail;
		String actual = driver.findElement(By.xpath("//*[contains(text(),'Please enter your username or card number.')]")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		
	}
	public void readPassErr() {
		
		//*[contains(text(),'Please enter your password.')]
		//String expected =("Please enter your username or card number.");
		String expected = readPass;
		String actual = driver.findElement(By.xpath("//*[contains(text(),'Please enter your username or card number.')]")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		
	}
	public void quit() {
		driver.close();
//		String reademail = ("Please enter your username or card number.");
//		String readPass = ("Please enter your username or card number.");
//		String globalerr = ("Please check your card number / username or password and try again.");
	}
}
