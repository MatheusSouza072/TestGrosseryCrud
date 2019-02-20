package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.DeletarElementsMap;
import util.TestRule;

public class DeletarPage extends DeletarElementsMap {

	WebDriver driver = TestRule.getDriver();

	public DeletarPage() {

		PageFactory.initElements(TestRule.getDriver(), this);

	}
	public void clicarLupaConteudoDoName() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(clicarLupa));
		clicarLupa.click();
	}

	public void digitarNoInputDaLupa() {

		inputDigitar.sendKeys("Teste Sicredi");
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(inputDigitar));
		inputDigitar.sendKeys(Keys.ENTER);
		
	}

	public void MarcarCheckBox() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		checkBoxDel.click();

	}

	public void ClicarNoBotaoDelete() {
		
		botaoDelete.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}

	public void ValidarTextoDelete() {
		
		String textoElementoDelete = textoDelete.getText();
		Assert.assertEquals("Are you sure that you want to delete this 1 item?", textoElementoDelete);

	}

	public void ClicarNoBotaoDeleteNaPopup() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		popupButtonDelete.click();

	}

	public void ExibirMensagemEsperada() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String textoElementoSucessDelete = mensagemEsperada.getText();
		Assert.assertEquals("Your data has been successfully deleted from the database.", textoElementoSucessDelete );

	}

}
