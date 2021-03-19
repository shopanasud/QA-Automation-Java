package Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import CommonMethods.projectSpecificMethod;

public class LoginPage extends projectSpecificMethod {
	
	public LoginPage(RemoteWebDriver driver, ExtentTest eachnode) {
		this.driver = driver;
		this.eachNode = eachnode;
	}
	
	public LoginPage enterUserName() {
		enterValue(locateElement("id", prop.getProperty("login.uname.id")), "DemoSalesManager");
		return this;
		
	}
	
	public LoginPage enterPassword() {
		enterValue(locateElement("id", "password"), "crmsfa");
		return this;
	}
	
	public HomePage submitlogin() {
		click(locateElement("class", "decorativeSubmit"));
		HomePage HP = new HomePage(driver, eachNode);
		return HP;
	}
	
}
