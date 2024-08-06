package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page(title = "NewStudentPage", summary = "", relativeUrl = "", connection = "SalesforceConnection")
public class NewStudentPage {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Students']")
	public WebElement studentsTab;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[contains(@class,'slds-input') and @name='Mother_Name__c']")
	public WebElement motherName;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Name__c']")
	public WebElement name;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Father_Name__c']")
	public WebElement fatherName;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[contains(@class,'slds-combobox__input') and @maxlength='255' and @placeholder='Search Classes...']")
	public WebElement class_WebElement;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span/span/span[normalize-space(.)='Show more results for \"Salesforce Admin\"' and contains(@class,'slds-truncate')]")
	public WebElement classLookUP;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Phone__c']")
	public WebElement phone;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Email__c']")
	public WebElement email;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'open') and @data-aura-class='uiModal--medium uiModal--recordActionWrapper uiModal forceModal']//textarea[contains(@class,'slds-textarea') and @required='']")
	public WebElement address;

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Age__c']")
	public WebElement age;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='SaveEdit']")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Gaurav Kumar' and contains(@class,'test-id__field-value')]")
	public WebElement name1;

	@ButtonType(file = true)
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Upload Files']")
	public WebElement fileInput;

}
