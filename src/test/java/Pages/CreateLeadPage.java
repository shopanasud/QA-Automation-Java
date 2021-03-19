package Pages;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;

import CommonMethods.projectSpecificMethod;

public class CreateLeadPage extends projectSpecificMethod {
	
	public CreateLeadPage(RemoteWebDriver driver, ExtentTest eachnode) {
		this.driver = driver;
		this.eachNode = eachnode;
	}
	
	public ViewLeadPage enterValues(String cName, String FName, String LName) throws IOException {
		
		enterValue(locateElement("id", "createLeadForm_companyName"), cName);
		 enterValue(locateElement("id", "createLeadForm_firstName"), FName);
		 enterValue(locateElement("id", "createLeadForm_lastName"), LName);
		 enterValue(locateElement("id", "createLeadForm_firstNameLocal"), "Shopana ");
		 enterValue(locateElement("id", "createLeadForm_lastNameLocal"), "Sudhakar ");
		 selectdropDown(locateElement("id", "createLeadForm_marketingCampaignId"), "Automobile");
		 selectdropDown(locateElement("id", "createLeadForm_dataSourceId"), "Conference");
		 enterValue(locateElement("id", "createLeadForm_personalTitle"), "Mrs");
		 enterValue(locateElement("id", "createLeadForm_generalProfTitle"), "QA ENgineer ");
		 enterValue(locateElement("id", "createLeadForm_departmentName"), "Quality");
		 enterValue(locateElement("id", "createLeadForm_annualRevenue"), "12,500,000");
		 selectDDValue(locateElement("id", "createLeadForm_currencyUomId"), "USD");
		 selectDDValue(locateElement("id", "createLeadForm_industryEnumId"), "IND_SOFTWARE");
		 selectDDValue(locateElement("id", "createLeadForm_ownershipEnumId"), "OWN_PARTNERSHIP");
		 enterValue(locateElement("id", "createLeadForm_numberEmployees"), "200");
		 enterValue(locateElement("id", "createLeadForm_sicCode"), "1234567");
		 enterValue(locateElement("id", "createLeadForm_tickerSymbol"), "1222222");
		 enterValue(locateElement("id", "createLeadForm_description"), "jbckuyg byurkbf ygukf ryugfk yugrfkb   kfe fhuy gyubhkcbh ub h hbehbk hb");
		 enterValue(locateElement("id", "createLeadForm_importantNote"), "bckduyc yukb yvkbc hvbke hjbvkem hjbvv, fhm");
		 enterValue(locateElement("id", "createLeadForm_primaryPhoneCountryCode"), "1");
		 enterValue(locateElement("id", "createLeadForm_primaryPhoneAreaCode"), "94131");
		 enterValue(locateElement("id", "createLeadForm_primaryPhoneNumber"), "0997766646");
		 enterValue(locateElement("id", "createLeadForm_primaryPhoneExtension"), "123");
		 enterValue(locateElement("id", "createLeadForm_primaryPhoneAskForName"), "Shopana");
		 enterValue(locateElement("id", "createLeadForm_primaryEmail"), "123@123.com");
		 enterValue(locateElement("id", "createLeadForm_primaryWebUrl"), "www.google.com");
		 enterValue(locateElement("id", "createLeadForm_generalToName"), "Shopana S");
		 enterValue(locateElement("id", "createLeadForm_generalAttnName"), "Sho");
		 enterValue(locateElement("id", "createLeadForm_departmentName"), "xjlndkj dx");
		 enterValue(locateElement("id", "createLeadForm_departmentName"), "m,.lJNLWK ");
		 enterValue(locateElement("id", "createLeadForm_generalCity"), "NAMAKKAL");
		 selectdropDown(locateElement("id", "createLeadForm_generalStateProvinceGeoId"), "California");
		 enterValue(locateElement("id", "createLeadForm_generalPostalCode"), "94131");
		 selectDDValue(locateElement("id", "createLeadForm_generalCountryGeoId"), "USA");
		 enterValue(locateElement("id", "createLeadForm_generalPostalCodeExt"), "555");
		 click(locateElement("xpath", "//input[@class='smallSubmit']"));
		 return new ViewLeadPage(driver, eachNode);
	}
	
	

}
