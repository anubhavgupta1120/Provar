package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;

@Page(title = "Contacts SF", summary = "", relativeUrl = "", connection = "SalesforceConnection")
public class ContactsSF {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'split-left')]//a[normalize-space(.)='Rose Gonzalez' and contains(@class,'slds-truncate') and @title='Rose Gonzalez']")
	public WebElement roseGonzalez;

}
