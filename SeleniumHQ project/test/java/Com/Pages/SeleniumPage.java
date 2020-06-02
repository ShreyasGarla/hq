package Com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumPage
{
	public WebDriver driver;

	//Intializing the WebElements for download button and 64 bit windowsIE button 
	@FindBy(xpath="//*[@id='navbar']/a[1]")
	public WebElement Download;
	
	@FindBy(partialLinkText="64 bit Windows IE")
	public WebElement WindowsIE;


public SeleniumPage(WebDriver driver)
{
	this.driver=driver;
		
}

//Operations for clicking on the download and 64 windowIE using WebElements
public void seleniumdownload() throws InterruptedException
{
	Download.click();
	Thread.sleep(2000);
	
	WindowsIE.click();
	Thread.sleep(5000);
}


}

