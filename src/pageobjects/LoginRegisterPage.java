package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page(title = "LoginRegisterPage", connection = "UI_Connection")
public class LoginRegisterPage {

	@SuppressWarnings("unused")
	private WebDriver driver;

	public LoginRegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@TextType()
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;

	@TextType()
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@TextType()
	@FindBy(xpath = "//input[@id='confirmPassword']")
	private WebElement confirmPassword;

	@ButtonType()
	@FindBy(xpath = "//button[@tabindex = '0' and contains(@class, 'MuiButton-containedSizeMedium MuiButtonBase-root')]")
	private WebElement register;

	@ButtonType()
	@FindBy(xpath = "//button[@tabindex ='0' and contains(@class,'MuiButton-containedSizeMedium MuiButtonBase-root')]")
	private WebElement login;

	public String Register(String user, String pass) {
		register.click();
		username.sendKeys(user);
		password.sendKeys(pass);
		confirmPassword.sendKeys(pass);
		//register.isDisplayed();
		register.click();
		return user;
	}

	public void Login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		login.click();
	}

}
