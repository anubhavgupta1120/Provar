package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page(title = "Home Page", summary = "", relativeUrl = "", connection = "UI_Connection")
public class HomePage {
	// div[contains(@class, 'MuiCardContent-root')]/p[1] --> Name of Product
	// (//input[@name = 'search'])[1] --> SearchBox Text (SendKeys will work)
	// select[@id = 'uncontrolled-native'] --> SizeDropdown
	// /..//following-sibling::div//select -> Chained drowdown
	// /..//following-sibling::div/button --> Chained dropdown

	@SuppressWarnings("unused")
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class, 'MuiCardContent-root')]/p[1]")
	private List<WebElement> allProductWebElement;

	@TextType()
	@FindBy(xpath = "(//input[@name = 'search'])[1]")
	private WebElement searchBox;

	@FindBy(how = How.XPATH, using = "//button[@tabindex = '0' and contains(@class, 'MuiButton-containedSizeMedium MuiButtonBase-root')]")
	private WebElement checkoutButtonElement;

	public void searchItem(String productName) {
		searchBox.sendKeys(productName, Keys.ENTER);
	}

	public void AddToCart(String productName) {
		for (WebElement element : allProductWebElement) {
			if (element.getText().contains(productName)) {
				element.findElement(By.xpath("./..//following-sibling::div/button")).click();
				break;
			}
		}
	}

	public void goToCheckOutPage() {
		checkoutButtonElement.click();
	}
}
