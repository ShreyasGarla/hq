package Com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WrapperClass
{
public ChromeDriver driver;

//Method function to launch the chrome browser 
public void launchbrowser(String url)
{
	//To specify the download path of IE DriverServer
	String downpath= System.getProperty("user.dir")+File.separator+"downloads";
	System.out.println(downpath);
	
	Map<String,String> prefference= new HashMap<String,String>();
	prefference.put("download.default_directory", downpath);
	
	ChromeOptions options= new ChromeOptions();
	options.setExperimentalOption("prefs", prefference);
	
	//To launch the chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A.SUSHMITHA\\Downloads\\SeleniumHQ project\\resources\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver(options);
	((WebDriver) driver).get(url);
}

//Screenshot method to take screenshot at specified path 
public void screenshot(String path) throws IOException
{
	File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screen,new File(path));
}

//Method to close browser
public void CloseBrowser()
{
	driver.close();
}
}
