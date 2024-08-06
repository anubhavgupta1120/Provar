package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.Page;

@Page(title = "Confirmation Page", summary = "", relativeUrl = "", connection = "UI_Connection")
public class ConfirmationPage {

	@FindBy(xpath = "//button[@type = 'primary']")
	private WebElement logoutButtonWebElement;

	public void logout() {
		logoutButtonWebElement.click();
	}
}
