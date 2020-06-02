package Com.TestCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.BaseClass.WrapperClass;
import Com.Pages.SeleniumPage;

public class SeleniumTestAssert extends WrapperClass
{
	//In BeforeTest annotation launch the browser operation is performed
	@BeforeTest
	public void launch() throws IOException
	{
		launchbrowser("https://www.selenium.dev/");
		screenshot("C:\\Users\\A.SUSHMITHA\\Pictures\\Restored\\Screenshot_2020-01-23-20-25-27-656_com.android.chrome.png");
	}

	//Through Test annotation we perform specified operations
	@Test
	public void testdata() throws InterruptedException
	{
		//seleniumpage class constructor 
		SeleniumPage seleniumpage= new SeleniumPage(driver);
		seleniumpage = PageFactory.initElements(driver, SeleniumPage.class);

		seleniumpage.seleniumdownload();
		
		//Thread.sleep is for pausing the next operation
		Thread.sleep(3000);
		//Download location for the WindowsIE 64bit in the downloads folder
		File f= new File("C:\\Users\\A.SUSHMITHA\\Downloads\\SeleniumHQ project\\downloads\\IEDriverServer_x64_3.150.1.zip");
		boolean a= f.exists();
		
		SoftAssert sort= new SoftAssert();
		sort.assertTrue(a, "Doesn't meet my requirements");
		sort.assertAll();
		System.out.println(a);
	}
	
	//To close the browser
	@AfterTest
	public void close()
	{
		CloseBrowser();
	}
}
