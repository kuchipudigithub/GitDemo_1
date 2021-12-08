package Course;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LibertySiteAutomation {
	
	@Test
	public void liberty() throws MalformedURLException {
		
	DesiredCapabilities dc= new DesiredCapabilities();
	
	                     dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	                     dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	                     dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	                     
	                     dc.setCapability(MobileCapabilityType.DEVICE_NAME, "My Device");
	                     dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	                     
	                     //from line 16 to 21 we configured mobile capability
	                     
	                    // to setup package and activity to laucnch chrome browser we are using chrome options obj
	                     ChromeOptions options = new ChromeOptions();
	                     
	                        //package is android package and activity is com.android.chrome(this activity will make open chrome browser)
	                     options.setExperimentalOption("androidPackage", "com.android.chrome");
	                     
	                     //set chromeoptions to desired capability
	                     
	                         dc.setCapability(ChromeOptions.CAPABILITY, options);
	                       
	                         //from line 26 to 33 we configured browser  capability using chrome options
	                         
	                       //set chrome driver path using desired capabillities
	              		   
	              		   dc.setCapability("chromedriverExecutable", "D:\\selenium-workspace\\Appium_Practise\\drivers\\chromedriver_emulator.exe");
	              		          
	                         AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	                         
	                       driver.get("http://www.libertytestingcenter.com");
	                       
	       MobileElement          element=      driver.findElementByXPath("(//*[@name='course_id'])[1]");
	                         
	}

}
