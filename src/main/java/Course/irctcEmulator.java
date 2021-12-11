package Course;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class irctcEmulator {
	

	
	@Test
	public void irctcRegisteration() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "My Device");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		
		
		ChromeOptions chromeoptions = new ChromeOptions();
		
		               chromeoptions.setExperimentalOption("androidPackage", "com.android.chrome");
		                             
		                  dc.setCapability(chromeoptions.CAPABILITY, chromeoptions);
		                  
		                  dc.setCapability("chromedriverExecutable", "D:\\selenium-workspace\\Appium_Practise\\drivers\\chromedriver_emulator.exe");
		                  
		                  AndroidDriver<MobileElement> driver =new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		                  
		                     driver.get("https://www.irctc.co.in/nget/train-search");
		                     
		                     //click on menu button
		                     
		                 driver.findElementByXPath("//*[@class='h_menu_drop_button moblogo hidden-sm']//child::i").click();
		                 
		                 //click on ogin button
		                 
		                driver.findElementByXPath("//*[text()='LOGIN']").click();
		                
		                //surendra
		                driver.findElementByXPath("//*[text()='LOGIN1']").click();
		                driver.findElementByXPath("//*[text()='LOGIN2']").click();
		                driver.findElementByXPath("//*[text()='LOGIN3']").click();
		                
		                
		                driver.findElementByXPath("//*[text()='LOGIN4']").click();
		                driver.findElementByXPath("//*[text()='LOGIN5']").click();
		                driver.findElementByXPath("//*[text()='LOGIN6']").click();
		                Thread.sleep(12000);
		                //click on register
		                driver.findElementByXPath("//*[text()='REGISTER']").click();
		                
		                Thread.sleep(9000);
		                
		                driver.findElementById("userName").sendKeys("surendraliberity");
		                driver.findElementById("usrPwd").sendKeys("Secret12");
		                driver.findElementById("cnfUsrPwd").sendKeys("Secret12");
		                Thread.sleep(20000);
		                //select security question
		                
		               driver.findElementByXPath("//label[text()='Select Security Question']").click();
		               Thread.sleep(3000);
		       // MobileElement      securityQuestion =   driver.findElementByXPath("//label[text()='Select Security Question']]");
		                
		        
		        Thread.sleep(9000);
		        
		List<MobileElement>     securityqueslist =   driver.findElementsByXPath("(//div[@class='ui-dropdown-items-wrapper'])[1]//child::ul//child::li");
		
                                   
		               System.out.println("security question list size is "+securityqueslist.size());
		               
		                 
		                 securityqueslist.get(2).click();
		                 
		                 //security answer
		                 driver.findElementByXPath("//input[@placeholder='Security Answer']").click();
		                 driver.findElementByXPath("//input[@placeholder='Security Answer']").sendKeys("deepti emglish medium school");
		                 
		                 
		                 //preferred language pick list
		                 
		                 driver.findElementByXPath("//label[text()='Select Preferred Language']").click();
		                 
		  List<MobileElement>        preferreflanflist   =    driver.findElementsByXPath("(//div[@class='ui-dropdown-items-wrapper'])[2]//child::ul//child::li");
		                 
		                    preferreflanflist.get(0).click();
		                 
		                 //first name
		                    driver.findElementById("firstName").sendKeys("surendra");
		                    //middle name
		                    driver.findElementById("middleName").sendKeys("kumar");
		                    //last name
		                    driver.findElementById("lastname").sendKeys("kuchipudi");
		                    
		                    //gender
		                    driver.findElementByXPath("//input[@id='M']").click();
		                 
		                    
		                    //dob
		                   
		                    driver.findElementByXPath("//*[@formcontrolname='dob']").click();
		                    Thread.sleep(4000);
		            MobileElement    month=     driver.findElementByXPath("(//div[@class='ui-datepicker-title']//child::select)[1]");
		                 
		                       Select monthselect= new Select(month);
		                       
		                          monthselect.selectByIndex(1);
		                          
		                          Thread.sleep(4000);
		                          MobileElement    year = driver.findElementByXPath("(//div[@class='ui-datepicker-title']//child::select)[2]");
		                 
		                          Select yearselect= new Select(year);
			                       
		                          yearselect.selectByVisibleText("1980");
		                          
		                          
		                         MobileElement calendraTable = driver.findElementByXPath("//table[contains(@class,'ui-datepicker-calendar ng-tns')]");
		                         
		                         
		                         
		                                                              List<MobileElement>  columns    =   calendraTable.findElementsByTagName("td"); 
		                                                              
		                                                              Calendar cal = Calendar.getInstance();
		                                                              int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		                                                              
		                                                              for (MobileElement cell: columns) {
		                                                               
		                                                                  //Select Today's Date
		                                                                  if (cell.getText().equals("19")) {
		                                                                      cell.click();
		                                                                      break;
		                                                                  }             
		                                                              
		                                                              }
		                                                              
		                                                              
		    
		       //occupation
		                                                              
		        driver.findElementByXPath("//label[text()='Select Occupation']").click();
		        
		        Thread.sleep(2000);
		        
	List<MobileElement>	   occupList =  driver.findElementsByXPath("(//ul[contains(@class,'ui-dropdown-items ui-dropdown-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-tns')])//child::li");
	Thread.sleep(4000);
	occupList.get(1);  //public
	
	
//marital status
                driver.findElementByXPath("(//input[@value='M'])[2]").click();
                
                //email
                driver.findElementByXPath("//input[@id='email']").sendKeys("surendra@gmail.com");
                
               // isd-mobile
                driver.findElementById("mobile").sendKeys("61451027427");
                
                //address
                driver.findElementById("resAddress1").sendKeys("sydney");
                
                driver.findElementById("resAddress2").sendKeys("parramatta");
                
                driver.findElementById("resAddress3").sendKeys("Australia");
                
                driver.findElementByName("resPinCode").sendKeys("500002");
                
                driver.findElementById("resState").click();
                
                Thread.sleep(4000);
                
                driver.findElementByXPath("driver.findElementByXPath(\"//*[@formcontrolname='resCity']\")").click();
                
          MobileElement  city =     driver.findElementByXPath("//*[@formcontrolname='resCity']");
          
             Select  c= new Select(city);
                
             c.selectByVisibleText("Hyderabad");
                

                
                
	
	}
	
	}

