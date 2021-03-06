package com.icin.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserPortalPositiveTests {

	@Test
	public void loginTest() throws Exception {
		
		System.out.println("starting login test");
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.8:4444/wd/hub"),DesiredCapabilities.chrome());
		
		//sleep for 3 seconds
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		String url = "http://localhost:4200/";
		// open test page
		driver.get(url);
		System.out.println("page is opened");
		
		//sleep for 3 seconds
		sleep(2000);
		
		//enter username
		WebElement username = driver.findElement(By.xpath("//app-root/div[@class='container']/app-login//form//input[@name='username']"));
		username.sendKeys("saursingh");
		sleep(2000);
		
		//enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("simplilearn");
		sleep(2000);
		
		
		
		//click login button
		WebElement loginButton = driver.findElement(By.xpath("//app-root//app-login//form/div[3]/button[@class='btn btn-primary']"));
		loginButton.click();
		sleep(2000);
		
		//verifications
		
		//new url
		String expectedUrl = "http://localhost:4200/welcome";
//		String expectedUrl = "https://the-internet.herokuapp.com/secure-broken"; error
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual path url is not the same as expected");
		
		//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='#']
		
		WebElement sessionButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='#']"));
		sessionButton.click();
		sleep(2000);
				
		//logout button is visible
		WebElement logoutButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='/log-out']"));
		Assert.assertTrue(logoutButton.isDisplayed(), "Log Out Button is not visible");
		logoutButton.click();
		sleep(2000);
		
		//successful login message
		
		String expectedUrl2 = "http://localhost:4200/";
		String actualUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2, "Actual path url2 is not the same as expected");
			
		//close browser
		driver.quit();
	}
	
	

	@Test
	public void TransactionTest() throws Exception {
		
		System.out.println("starting login test");
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.8:4444/wd/hub"),DesiredCapabilities.chrome());
		
		//sleep for 2 seconds
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		String url = "http://localhost:4200/";
		// open test page
		driver.get(url);
		System.out.println("page is opened");
		
		//sleep for 2 seconds
		sleep(2000);
		
		//enter username
		WebElement username = driver.findElement(By.xpath("//app-root/div[@class='container']/app-login//form//input[@name='username']"));
		username.sendKeys("saursingh");
		sleep(2000);
		
		//enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("simplilearn");
		sleep(2000);
		
		
		
		//click login button
		WebElement loginButton = driver.findElement(By.xpath("//app-root//app-login//form/div[3]/button[@class='btn btn-primary']"));
		loginButton.click();
		sleep(2000);
		
		//verifications
		
		//new url
		String expectedUrl = "http://localhost:4200/welcome";
//		String expectedUrl = "https://the-internet.herokuapp.com/secure-broken"; error
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual path url is not the same as expected");
		

		//click Transaction History button
		WebElement transactionButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='/transaction-history']"));
		transactionButton.click();
		sleep(2000);
		
		
		
		
		// checking transactional History
		String expectedUrl1 = "http://localhost:4200/transaction-history";
//		String expectedUrl = "https://the-internet.herokuapp.com/secure-broken"; error
		String actualUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl1, expectedUrl1, "Actual path url is not the same as expected");
		

		//logout button is visible
		WebElement savingDisplay = driver.findElement(By.xpath("/html//app-root//app-user-history//h4[.='Type of account: Saving ']"));
		Assert.assertTrue(savingDisplay.isDisplayed(), "Type of account is not visible");
		
		
		// click on session Button
		WebElement sessionButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='#']"));
		sessionButton.click();
		
		
		//logout button is visible
		WebElement logoutButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='/log-out']"));
		Assert.assertTrue(logoutButton.isDisplayed(), "Log Out Button is not visible");
		logoutButton.click();
		sleep(2000);
		
		//successful login message
		
		String expectedUrl2 = "http://localhost:4200/";
		String actualUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2, "Actual path url2 is not the same as expected");
			
		//close browser
		driver.quit();
	}
	
	

	@Test
	public void TransferTest() throws Exception {
		
		System.out.println("starting login test");
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.8:4444/wd/hub"),DesiredCapabilities.chrome());
		
		//sleep for 2 seconds
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		String url = "http://localhost:4200/";
		// open test page
		driver.get(url);
		System.out.println("page is opened");
		
		//sleep for 2 seconds
		sleep(2000);
		
		//enter username
		WebElement username = driver.findElement(By.xpath("//app-root/div[@class='container']/app-login//form//input[@name='username']"));
		username.sendKeys("saursingh");
		sleep(2000);
		
		//enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("simplilearn");
		sleep(2000);
		
		
		
		//click login button
		WebElement loginButton = driver.findElement(By.xpath("//app-root//app-login//form/div[3]/button[@class='btn btn-primary']"));
		loginButton.click();
		sleep(2000);
		
		//verifications
		
		//new url
		String expectedUrl = "http://localhost:4200/welcome";
//		String expectedUrl = "https://the-internet.herokuapp.com/secure-broken"; error
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual path url is not the same as expected");
		

		//click Transaction History button
		WebElement transferButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='/transfer-history']"));
		transferButton.click();
		sleep(2000);
		
		
		// checking transactional History
		String expectedUrl1 = "http://localhost:4200/transfer-history";
//		String expectedUrl = "https://the-internet.herokuapp.com/secure-broken"; error
		String actualUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl1, expectedUrl1, "Actual path url is not the same as expected");
		

		//logout button is visible
		WebElement savingDisplay = driver.findElement(By.xpath("/html//app-root//app-transfer-history//h3[.='Transfer between Accounts History']"));
		Assert.assertTrue(savingDisplay.isDisplayed(), "Type of account is not visible");
		
		
		// click on session Button
		WebElement sessionButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='#']"));
		sessionButton.click();
		
		
		//logout button is visible
		WebElement logoutButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='/log-out']"));
		Assert.assertTrue(logoutButton.isDisplayed(), "Log Out Button is not visible");
		logoutButton.click();
		sleep(2000);
		
		//successful login message
		
		String expectedUrl2 = "http://localhost:4200/";
		String actualUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2, "Actual path url2 is not the same as expected");
			
		//close browser
		driver.quit();
	}
	
	

	@Test
	public void ChequeBookTest() throws Exception {
		
		System.out.println("starting login test");
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.8:4444/wd/hub"),DesiredCapabilities.chrome());
		
		//sleep for 2 seconds
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		String url = "http://localhost:4200/";
		// open test page
		driver.get(url);
		System.out.println("page is opened");
		
		//sleep for 2 seconds
		sleep(2000);
		
		//enter username
		WebElement username = driver.findElement(By.xpath("//app-root/div[@class='container']/app-login//form//input[@name='username']"));
		username.sendKeys("saursingh");
		sleep(2000);
		
		//enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("simplilearn");
		sleep(2000);
		
		
		
		//click login button
		WebElement loginButton = driver.findElement(By.xpath("//app-root//app-login//form/div[3]/button[@class='btn btn-primary']"));
		loginButton.click();
		sleep(2000);
		
		//verifications
		
		//new url
		String expectedUrl = "http://localhost:4200/welcome";
//		String expectedUrl = "https://the-internet.herokuapp.com/secure-broken"; error
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual path url is not the same as expected");
		

		//click Transaction History button
		WebElement chequeBookButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='/cheque-book']"));
		chequeBookButton.click();
		sleep(2000);
		
		
		
		
		// checking cheque book
		String expectedUrl1 = "http://localhost:4200/cheque-book";
//		String expectedUrl = "https://the-internet.herokuapp.com/secure-broken"; error
		String actualUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl1, expectedUrl1, "Actual path url is not the same as expected");
		

		//logout button is visible
		try {
		WebElement chequeBookDisplay = driver.findElement(By.xpath("/html//app-root//app-cheque-book-request//div[@class='alert text-danger']"));
		Assert.assertTrue(chequeBookDisplay.isDisplayed(), "Type of account is not visible");
		
		}catch (Exception e) {
			WebElement chequeBookDisplay2 = driver.findElement(By.xpath("/html//app-root//app-cheque-book-request//h3[.='Request Cheque Book']"));
			Assert.assertTrue(chequeBookDisplay2.isDisplayed(), "Cheque Book is not visible");
		}
		
		
		// click on session Button
		WebElement sessionButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='#']"));
		sessionButton.click();
		
		
		//logout button is visible
		WebElement logoutButton = driver.findElement(By.xpath("//app-root//app-navbar/nav/ul[@class='navbar-nav']//a[@href='/log-out']"));
		Assert.assertTrue(logoutButton.isDisplayed(), "Log Out Button is not visible");
		logoutButton.click();
		sleep(2000);
		
		//successful login message
		
		String expectedUrl2 = "http://localhost:4200/";
		String actualUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2, "Actual path url2 is not the same as expected");
			
		//close browser
		driver.quit();
	}
	


	private void sleep(long m) {
		
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
