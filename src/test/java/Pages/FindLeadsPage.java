package Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import CommonMethods.projectSpecificMethod;

public class FindLeadsPage extends projectSpecificMethod {
	public FindLeadsPage(RemoteWebDriver driver, ExtentTest eachnode) {
		this.driver = driver;
		this.eachNode = eachnode;
	}
	
	
	public ViewLeadPage enterfName() {
		enterValue(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Shopana");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		return new ViewLeadPage(driver, eachNode);
		
		
	}

	

}
