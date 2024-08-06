package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.FacetFindBy;
import com.provar.core.testapi.annotations.FacetFindBys;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageRow;
import com.provar.core.testapi.annotations.PageTable;
import com.provar.core.testapi.annotations.TextType;

@Page(title = "HTMLTablePage", summary = "", relativeUrl = "", connection = "HTML_Tables")
public class HTMLTablePage {

	@PageRow()
	public static class Example {

		@TextType()
		@FindBy(xpath = "//td[1]")
		public WebElement Company;

		@TextType()
		@FindBy(xpath = "//td[2]")
		public WebElement Contact;

		@TextType()
		@FindBy(xpath = "//td[3]")
		public WebElement Country;
	}

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = "tbody/tr"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "tbody/tr[1]"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "(//table[@id='customers'])[1]")
	@PageTable(firstRowContainsHeaders = false, row = Example.class)
	public List<Example> example;

}
