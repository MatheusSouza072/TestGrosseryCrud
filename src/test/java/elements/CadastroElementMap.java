package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroElementMap {
	
	
	@FindBy(css = "body > div.container-fluid.gc-container > div.row > div.table-section > div.table-label > div.floatL.l5")
	protected WebElement customers;
	
	@FindBy(css="#gcrud-search-form > div > div > a > i[class='el el-plus']")
	protected WebElement addCustomer;
	
	@FindBy(css="#field_salesRepEmployeeNumber_chosen > a > span")
	protected WebElement fromEmployeer;
	
	@FindBy(css="#field_salesRepEmployeeNumber_chosen > div > div > input[type='text']")
	protected WebElement inputEmployeer;
	
	@FindBy(id = "switch-version-select")
	protected WebElement switchVersionSelect;
	
	
	@FindBy(id = "field-customerName")
	protected WebElement fieldCustomerName;
	
	@FindBy(id = "field-contactLastName")
	protected WebElement fieldContactLastName;
	
	@FindBy(id = "field-contactFirstName")
	protected WebElement fieldContactFirstName;
	
	@FindBy(id = "field-phone")
	protected WebElement fieldPhone;
	
	@FindBy(id = "field-addressLine1")
	protected WebElement fieldAddressLine1;
	
	@FindBy(id = "field-addressLine2")
	protected WebElement fieldAddressLine2;
	
	@FindBy(id = "field-city")
	protected WebElement fieldCity;
	
	@FindBy(id = "field-state")
	protected WebElement fieldState;
	
	@FindBy(id = "field-postalCode")
	protected WebElement fieldPostalCode;
	
	@FindBy(id = "field-country")
	protected WebElement fieldCountry;
	
	@FindBy(id = "field-creditLimit")
	protected WebElement fieldCreditLimit;
	
	@FindBy(id = "form-button-save" )
	protected WebElement formButtonSave;
	
	@FindBy(css="#report-success > p")
	protected WebElement primeiraMensagem;
	
	@FindBy(css="#report-success > p")
	protected WebElement validaMensagem;
	
	@FindBy(css = "#report-success > p > a:nth-child(2)")
	protected WebElement backToList;
	
	
		
}
