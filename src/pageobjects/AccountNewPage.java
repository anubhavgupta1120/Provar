package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.Page;

@Page(title = "Account New Page", summary = "", relativeUrl = "", connection = "SalesforceConnection")
public class AccountNewPage {

	@FindBy(xpath = "//div[@aria-label = 'Rating']//span[2]")
	private List<WebElement> ratingElements;

	public List<String> ratingList() {
		List<String> rList = new ArrayList<>();
		for (WebElement element : ratingElements) {
			rList.add(element.getText());
		}
		return rList;
	}

}
