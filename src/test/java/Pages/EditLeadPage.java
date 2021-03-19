package Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import CommonMethods.projectSpecificMethod;

public class EditLeadPage extends projectSpecificMethod{
	
	public EditLeadPage(RemoteWebDriver driver, ExtentTest eachnode) {
		this.driver = driver;
		this.eachNode = eachnode;
	}
	
	
	public ViewLeadPage editCompanyInfo() {
		enterValue(locateElement("id", "updateLeadForm_companyName"), "Apple");
		click(locateElement("xpath", "//input[@value='Update']"));
		return new ViewLeadPage(driver, eachNode);
		
	}

}
