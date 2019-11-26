package com.training.sanity.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC01_RealEstateAdminChangeProfileDetails {
		private WebDriver driver;
		private String baseUrl;
		private LoginPOM loginPOM;
		private static Properties properties;
		private ScreenShot screenShot;
		private GenericMethods genericmeth;

		@BeforeClass
		public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}

		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			loginPOM = new LoginPOM(driver); 
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); 
			//genericmeth = new GenericMethods(driver);
			// open the browser 
			driver.get(baseUrl);
			//genericmeth.assertURL("baseUrl");
		}
		
		@AfterMethod
		public void tearDown() throws Exception {
			Thread.sleep(10000L);
			driver.quit();
		}
		@Test
		public void validLoginTestAndUpdatedMyProfileTest() throws InterruptedException {
			loginPOM.clickLinkTextLogin();
			loginPOM.sendUserName("admin");
			loginPOM.sendPassword("admin@123");
			loginPOM.clickLoginBtn();
			Thread.sleep(5000L);
			screenShot.captureScreenShot("validLoginTest");
			/*genericmeth.assertText("admin","//*[@id=\"wp-admin-bar-user-info\"]/a/span","xpath", "Admin text is Present");
			Thread.sleep(5000L);
			genericmeth.assertText("Edit My Profile","//*[@id=\"wp-admin-bar-edit-profile\"]/a","xpath", "Edit My Profile text is Present");
			Thread.sleep(5000L);
			genericmeth.assertText("Log Out","//*[@id=\"wp-admin-bar-logout\"]/a","xpath", "Log Out text is Present");*/
		
			loginPOM.clickHyperLinkAdmin();
			loginPOM.sendLastName("reva");
			loginPOM.sendPhone("9876543210");
			loginPOM.clickSubmitBtn();
			Thread.sleep(5000L);
			//genericmeth.assertText("Profile updated.","//*[@id=\"message\"]/p/strong","xpath", "Profile updated.text is Present");
			screenShot.captureScreenShot("UpdatedMyProfileTest");
			
		}


	}

