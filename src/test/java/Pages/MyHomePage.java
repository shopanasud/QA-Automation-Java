package Pages;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import CommonMethods.projectSpecificMethod;

public class MyHomePage extends projectSpecificMethod  {
	
	public MyHomePage(RemoteWebDriver driver, ExtentTest eachnode) {
		this.driver = driver;
		this.eachNode = eachnode;
	}
	
	public MyLeadsPage clickLeads() {
		click(locateElement("xpath", "//a[normalize-space()='Leads']"));
		return new MyLeadsPage(driver, eachNode);
		
	}

}
