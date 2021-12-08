package SamplePackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Introduction_1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
	//we knew chromedriver extends remotewebdriver, same way AppiumDriver extends RemoteWebdriver
		AppiumDriver<WebElement> driver;
		
		/*
		 * we need to set desired capabillities ,what type of browser,what version ,what is platform name etc
		 *   
		 */
		
		
		DesiredCapabilities dc= new DesiredCapabilities();
		 
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "My Device");
		
		dc.setCapability("udid", "emulator-5554");//we get this on comm prompt whem we use command adb devices
		
		//so far we have configured capabilities of device(above)
		
		//now we need to configure chrome ,which we are using to automate using chrome browser
		
		ChromeOptions cop = new ChromeOptions();
		
		/*
		 * we know package has class (which has source code) and class has methods.
		 * same way Android developer has create some package and it has some activities.
		 * we have to access source code & use what activites we need , like we use methods in a class
		 */
		
		   //we know that we are launching chrome browser, so we have to access package & call activity which is nothing but chrome browser
		   cop.setExperimentalOption("androidPackage", "com.android.chrome"); //package,activity for chrome browser
		   
		   //we have to pass this chromeOptions to desiredcapabillities
		   
		   dc.setCapability(ChromeOptions.CAPABILITY, cop);
		   
		   //set chrome driver path using desired capabillities
		   
		   dc.setCapability("chromedriverExecutable", "D:\\selenium-workspace\\Appium_Practise\\drivers\\chromedriver_emulator.exe");
		   
		    
		   driver = new AppiumDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
			
			driver.get("http://www.libertytestingcenter.com");
		
			
			driver.findElementByLinkText("Registration").click();
			
			//driver.findElementByName("name").sendKeys("samvruth");
			driver.findElementByXPath("(//input[@name='name'])[1]");
			driver.findElementById("inputPhone").sendKeys("9405223279");
			driver.findElementById("inputEmail").sendKeys("surendra.sravani1980@gmail.com");
			driver.findElementByName("address").sendKeys("sydney");
			
			
	
			
		WebElement courseofintrest =	driver.findElementByName("course_id");
		
		
		Select s= new Select(courseofintrest);
		
	               s.selectByVisibleText("Appium");
	               
	               driver.findElementByName("pay_amount").sendKeys("1999");
	               
	               driver.findElementByXPath("//*[text()='Pay Now']").click();
		
		
	
		

	}

}
