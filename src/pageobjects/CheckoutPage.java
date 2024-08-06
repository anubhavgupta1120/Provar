package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.provar.core.testapi.annotations.Page;

@Page(title = "Checkout Page", summary = "", relativeUrl = "", connection = "UI_Connection")
public class CheckoutPage {

	@FindBy(id = "add-new-btn")
	private WebElement addNewAddressWebElement;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder = 'Enter your complete address']")
	private WebElement addressTextAreaWebElement;

	@FindBy(xpath = "//button[@tabindex = '0' and contains(@class, 'MuiButton-containedSizeMedium MuiButtonBase-root')]")
	private WebElement addressAddButton;

	@FindBy(xpath = "//button[@tabindex = '0' and contains(@class, 'MuiButton-containedSizeMedium MuiButtonBase-root')]")
	private WebElement placeOrderButton;

	@FindBy(xpath = "//div[contains(@class, 'address-item')]/div[1]/p")
	private WebElement selectAddressWebElement;

	public void addNewAddress(String address) throws InterruptedException {
		addNewAddressWebElement.click();
		addressTextAreaWebElement.sendKeys(address);
		addressAddButton.click();
	}

	public void placeOrder() {
		placeOrderButton.click();
	}
}
