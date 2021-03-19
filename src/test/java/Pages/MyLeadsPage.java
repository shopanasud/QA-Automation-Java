package Pages;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import CommonMethods.projectSpecificMethod;


public class MyLeadsPage extends projectSpecificMethod {
	
	public MyLeadsPage(RemoteWebDriver driver, ExtentTest eachnode) {
		this.driver = driver;
		this.eachNode = eachnode;
	}
	
	public CreateLeadPage clickCreateLeads() {
		click(locateElement("xpath", "//a[normalize-space()='Create Lead']"));
		return new CreateLeadPage(driver, eachNode);
	
	}
	
	public FindLeadsPage clickFindLead() {
		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
		return FindLeadsPage();
		
		
	}

	private FindLeadsPage FindLeadsPage() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
