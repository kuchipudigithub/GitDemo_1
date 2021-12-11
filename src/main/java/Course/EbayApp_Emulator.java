package Course;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EbayApp_Emulator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		    dc.setCapability(MobileCapabilityType.DEVICE_NAME, "MyDevice");
		    dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
			dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			
	
			
			dc.setCapability("appPackage", "com.ebay.mobile");
			dc.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
			
			 AndroidDriver<MobileElement> driver =new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
			
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       
	       driver.findElementById("com.ebay.mobile:id/button_register").click();
	       
	       driver.findElementById("com.ebay.mobile:id/button_register1").click();
	       driver.findElementById("com.ebay.mobile:id/button_register2").click();
	       driver.findElementById("com.ebay.mobile:id/button_register3").click();
	       
	       //surendra 
	       driver.findElementById("com.ebay.mobile:id/button_register4").click();
	       driver.findElementById("com.ebay.mobile:id/button_register5").click();
	       
	       driver.findElementById("com.ebay.mobile:id/button_register6").click();
	       driver.findElementById("com.ebay.mobile:id/button_register7").click();
	       
	       
	       driver.findElementById("com.ebay.mobile:id/button_register8").click();
	       driver.findElementById("com.ebay.mobile:id/button_register9").click();
	       driver.findElementById("com.ebay.mobile:id/button_register10").click();
	       //b2 by x user
	       driver.findElementById("com.ebay.mobile:id/button_register11").click();
	       //b2 by x user
	       driver.findElementById("com.ebay.mobile:id/button_register122222").click();
	       // create buss account
	       
	       driver.findElementById("com.ebay.mobile:id/button_business").click();
	       
	     
	       //field legal buss name
	       //driver.findElementById("businessname").sendKeys("surendra & Co");
	       driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText").sendKeys("surendra & Co");
	       
	       //email 	
	       driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.widget.EditText").sendKeys("surendra.kumar@boral.com.au");
	       
	       //reenter
	       driver.findElementByXPath("//*[@resource-id='rbusinessemail']").sendKeys("surendra.kumar@boral.com.au");
	
	//pasword
	       driver.findElementByXPath("//*[@resource-id='PASSWORD_BIZREG']").sendKeys("Sathyavathi*12345");
	       
	       
	       
	       //select country
	        
	       driver.findElementByXPath("//*[@resource-id='selected-flagphoneFlagComp1Business']").click();

	       Thread.sleep(9000);
driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View/android.view.View/android.widget.ListView/android.view.View[16]").click();
                           

	       
	       //phone

driver.findElementByXPath("//*[@resource-id='phoneFlagComp1Business']").click();
	       driver.findElementByXPath("//*[@resource-id='phoneFlagComp1Business']").sendKeys("423427428");
	       
	       
	       
	       //register
	       driver.findElementByXPath("//*[@resource-id='sbtBtnBusiness']").click();
	}

}
