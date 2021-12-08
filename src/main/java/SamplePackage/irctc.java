package SamplePackage;

import java.lang.reflect.Executable;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class irctc {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AppiumDriver<WebElement> driver;
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "My Device");
				dc.setCapability("udid", "emulator-5554");
				
				
				ChromeOptions cop = new ChromeOptions();
				
				cop.setExperimentalOption("androidPackage", "com.android.chrome");
				
				dc.setCapability(ChromeOptions.CAPABILITY, cop);
				
				dc.setCapability("chromedriverExecutable", "D:\\selenium-workspace\\AppiumProject\\drivers\\chromedriver_emulator.exe");
		

				driver=new AppiumDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
				
				
				driver.get("https://www.irctc.co.in/nget/train-search");
				
				Thread.sleep(9000);
				try {
					driver.switchTo().alert();
					driver.switchTo().alert().accept();
					System.out.println("alert present");
				} catch (NoAlertPresentException e) {
					// TODO Auto-generated catch block
				
					System.out.println("alert not present");
					
					
				}
			
				
				
	}

}
