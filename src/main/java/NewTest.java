import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeMethod;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterMethod;

public class NewTest {
 
  private AppiumDriver driver;
  @Test
  public void f() {
	 // WebElement element= null;
//	  driver.findElementById("com.android.calculator2:id/digit1");
//	  driver.findElementById("com.android.calculator2:id/plus").click();
//	  driver.findElementById("com.android.calculator2:id/digit2").click();
//	  driver.findElementById("com.android.calculator2:id/equal").click();
//	  String result =driver.findElementByClassName("android.widget.EditText").getText();
	  
	  driver.findElementById("com.miui.calculator:id/btn_1").click();
	  driver.findElementById("com.miui.calculator:id/btn_plus").click();
	  driver.findElementById("com.miui.calculator:id/btn_2").click();
	  driver.findElementByClassName("android.view.View").click();
	  //WebElement elementList= driver.findElementByClassName("android.widget.TextView").getText();
	  String result = driver.findElementByClassName("android.widget.TextView").getText();
	  System.out.println("The result is" + result);
  }
  @BeforeMethod

 // public void beforeMethod() {
	  public void calc() throws Exception {
		  	final DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
//			capabilities.setCapability("deviceName", "192.168.56.101.5555");//虚拟机的设备名
//			capabilities.setCapability("platformVersion", "4.4.4");//版本
//			capabilities.setCapability("platformName", "Android");//测试平台
//			capabilities.setCapability("appPackage", "com.android.calculator2");//包名
//			capabilities.setCapability("appActivity", ".com.andriod.calculator2.Calculator");//打开APP的activity
			//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			capabilities.setCapability("deviceName", "99402c90");// 设备名
			capabilities.setCapability("platformVersion", "6.0.1");// 系统版本
			capabilities.setCapability("platformName", "Android");// 系统类别
			capabilities.setCapability("appPackage", "com.miui.calculator");
			capabilities.setCapability("appActivity", "com.miui.calculator.cal.NormalCalculatorActivity");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);//Appium地址
	        
			System.out.println("App is launched!");//设置输出，判断安装运行APP是否成功
		}

	//	 }


  @AfterMethod
  public void afterMethod() {
  }

}
