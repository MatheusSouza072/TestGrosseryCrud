package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletarElementsMap {
	
	

	@FindBy(css = "#gcrud-search-form > div.header-tools > div.floatR > a.btn.btn-primary.search-button.t5 > i")
	protected WebElement clicarLupa;
	
	@FindBy(name = "search")
	protected WebElement inputDigitar;
	
	@FindBy(xpath = "//*[@id=\'gcrud-search-form\']/div[2]/table/thead/tr[2]/td[1]/div/input")
	protected WebElement checkBoxDel;
	
	@FindBy(css = "#gcrud-search-form > div.scroll-if-required > table > thead > tr.filter-row.gc-search-row > td.no-border-left > div.floatL > a > span")
	protected WebElement botaoDelete;

	@FindBy(css = "body > div.container-fluid.gc-container > div.row > div.delete-multiple-confirmation.modal.fade.in.show > div > div > div.modal-body > p.alert-delete-multiple-one") 
	protected WebElement textoDelete;
	
	@FindBy(css = "body > div.container-fluid.gc-container > div.row > div.delete-multiple-confirmation.modal.fade.in.show > div > div > div.modal-footer > button.btn.btn-danger.delete-multiple-confirmation-button")
	protected WebElement popupButtonDelete;
	
	@FindBy(css = "body > div.alert.alert-success.growl-animated.animated.bounceInDown > span:nth-child(4) > p")
	protected WebElement mensagemEsperada;
	
}
