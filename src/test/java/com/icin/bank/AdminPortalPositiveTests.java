package com.icin.bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminPortalPositiveTests {


	@Test(priority = 1)
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
		
		String url = "http://localhost:4201/";
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
		password.sendKeys("admin");
		sleep(2000);
		
		
		
		//click login button
		WebElement loginButton = driver.findElement(By.xpath("//app-root//app-login//form/div[3]/button[@class='btn btn-primary']"));
		loginButton.click();
		sleep(2000);
		
		//verifications
		
		//new url
		String expectedUrl = "http://localhost:4201/users-info";
//		String expectedUrl = "https://the-internet.herokuapp.com/secure-broken"; error
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual path url is not the same as expected");
		
		//logout button is visible
		WebElement logoutButton = driver.findElement(By.xpath("//div[@id='navbarNav']/ul[@class='navbar-nav']//a[@href='/logout']"));
		Assert.assertTrue(logoutButton.isDisplayed(), "Log Out Button is not visible");
		logoutButton.click();
		sleep(2000);
		
		//successful login message
		
		String expectedUrl2 = "http://localhost:4201/";
		String actualUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2, "Actual path url2 is not the same as expected");
			
		//close browser
		driver.quit();
	}
	
	@Test(priority = 2)
	public void diableUserTest() throws Exception {
		
		System.out.println("starting login test");
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.8:4444/wd/hub"),DesiredCapabilities.chrome());
		
		//sleep for 3 seconds
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		String url = "http://localhost:4201/";
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
		password.sendKeys("admin");
		sleep(2000);
		
		
		
		//click login button
		WebElement loginButton = driver.findElement(By.xpath("//app-root//app-login//form/div[3]/button[@class='btn btn-primary']"));
		loginButton.click();
		sleep(2000);
		
		//verifications
		
		//new url
		String expectedUrl = "http://localhost:4201/users-info";
//		String expectedUrl = "https://the-internet.herokuapp.com/secure-broken"; error
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual path url is not the same as expected");
		
		
		
		//logout button is visible
		WebElement disableButton = driver.findElement(By.xpath("//app-root/div[@class='container']/app-users-account-info/table[@class='table table-bordered-md']/tbody[1]/tr/td[6]/button[@class='btn btn-success']"));
		Assert.assertTrue(disableButton.isDisplayed(), "Log Out Button is not visible");
		disableButton.click();
		sleep(2000);
				
		//logout button is visible
		WebElement logoutButton = driver.findElement(By.xpath("//div[@id='navbarNav']/ul[@class='navbar-nav']//a[@href='/logout']"));
		Assert.assertTrue(logoutButton.isDisplayed(), "Log Out Button is not visible");
		logoutButton.click();
		sleep(2000);
		
		//successful login message
		
		String expectedUrl2 = "http://localhost:4201/";
		String actualUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2, "Actual path url2 is not the same as expected");
			
		//close browser
		driver.quit();
	}
	
	
	@Test(priority = 3)
	public void enableUserTest() throws Exception {
		
		System.out.println("starting login test");
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.8:4444/wd/hub"),DesiredCapabilities.chrome());
		
		//sleep for 3 seconds
		sleep(2000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		String url = "http://localhost:4201/";
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
		password.sendKeys("admin");
		sleep(2000);
		
		
		
		//click login button
		WebElement loginButton = driver.findElement(By.xpath("//app-root//app-login//form/div[3]/button[@class='btn btn-primary']"));
		loginButton.click();
		sleep(2000);
		
		//verifications
		
		//new url
		String expectedUrl = "http://localhost:4201/users-info";
//		String expectedUrl = "https://the-internet.herokuapp.com/secure-broken"; error
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual path url is not the same as expected");
		
		
		//logout button is visible
		WebElement toDisabledLink = driver.findElement(By.xpath("//div[@id='navbarNav']/ul[@class='navbar-nav']//a[@href='/blocked-users']"));
		Assert.assertTrue(toDisabledLink.isDisplayed(), "Log Out Button is not visible");
		toDisabledLink.click();
		sleep(2000);
		
		String expectedUrl1 = "http://localhost:4201/blocked-users";
		String actualUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl1, expectedUrl1, "Actual path url is not the same as expected");
		
		//enable button is visible
		WebElement enableButton = driver.findElement(By.xpath("/html//app-root//app-blocked-users/table[@class='table table-bordered-md']//button[@class='btn btn-success']"));
		Assert.assertTrue(enableButton.isDisplayed(), "Log Out Button is not visible");
		enableButton.click();
		sleep(2000);
		
				
		//logout button is visible
		WebElement logoutButton = driver.findElement(By.xpath("//div[@id='navbarNav']/ul[@class='navbar-nav']//a[@href='/logout']"));
		Assert.assertTrue(logoutButton.isDisplayed(), "Log Out Button is not visible");
		logoutButton.click();
		sleep(2000);
		
		//successful login message
		
		String expectedUrl2 = "http://localhost:4201/";
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
