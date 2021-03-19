package Pages;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import CommonMethods.projectSpecificMethod;


public class HomePage extends projectSpecificMethod {
	
	public HomePage(RemoteWebDriver driver, ExtentTest eachnode) {
		this.driver = driver;
		this.eachNode = eachnode;
	}
	
	
		
		public LoginPage clickLogout() {
			click(locateElement("class", "decorativeSubmit"));
			
			return new LoginPage(driver, eachNode);
		}
		
		public MyHomePage clickCRMSFA() {
			click(locateElement("xpath", "//a[normalize-space()='CRM/SFA']"));
			return new MyHomePage(driver, eachNode);
		}
		
	}



