package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.CadastroElementMap;
import util.TestRule;

public class CadastroPage extends CadastroElementMap {
	WebDriver driver = TestRule.getDriver();

	public CadastroPage() {

		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void AbrirHomePage() {
		String textoElement = customers.getText();
		Assert.assertEquals("Customers", textoElement);

	}

	public void AlterarValorCombo() {
		Select cmbVersao = new Select(switchVersionSelect);
		cmbVersao.selectByValue("bootstrap_theme_v4");

	}

	public void ClicarNoBotaoAddCostumer() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(addCustomer));

		addCustomer.click();

	}

	public void PreencherCampoName() {
		fieldCustomerName.sendKeys("Teste Sicredi");
	}

	public void PreencherCampoLastName() {
		fieldContactLastName.sendKeys("Teste");

	}

	public void PreencherCampoContactFirstName() {
		fieldContactFirstName.sendKeys("Matheus");
	}

	public void PreencherCampoPhone() {
		fieldPhone.sendKeys("51 9999-9999");

	}

	public void PreencherCampoAddressLine1() {
		fieldAddressLine1.sendKeys("Av Assis Brasil, 3970");

	}

	public void PreencherCampoAddressLine2() {
		fieldAddressLine2.sendKeys("Torre D");

	}

	public void PreencherCampoCity() {
		fieldCity.sendKeys("Porto Alegre");

	}

	public void PrencherCampoState() {
		fieldState.sendKeys("RS");

	}

	public void PreencherCampoPostalCode() {
		fieldPostalCode.sendKeys("91000-000");

	}

	public void PreencherCampoCountry() {
		fieldCountry.sendKeys("Brasil");
	}

	public void AlterarValorComboEmployeer() {
		fromEmployeer.click();
		inputEmployeer.sendKeys("Fixter");

	}

	public void PreencherCampoCreditLimit() {
		fieldCreditLimit.sendKeys("200");

	}

	public void ClicarNoBotaoSave() {
		formButtonSave.click();

	}

	public void ApresentarMensagemNaTela() {

		String verPrimeiraMensagem = primeiraMensagem.getText();

		System.out.println(verPrimeiraMensagem);

		String textoElement = validaMensagem.getText();
		Assert.assertEquals(
				"Your data has been successfully stored into the database. Edit Customer or Go back to list",
				textoElement);
	}

	public void ClicarNoLinkGoBackToList() {
		

		backToList.click();
	}

	

}
