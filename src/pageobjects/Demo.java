package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "Demo", summary = "", relativeUrl = "", connection = "SalesforceConnection")
public class Demo {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement leads;

	public boolean isVisible() {
		return leads.isDisplayed();
	}

}
