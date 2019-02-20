package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import util.Utils;

public class CadastroSteps {
	@Dado("que estou na homepage do grocerycrud")
	public void abrirHomePage() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.AbrirHomePage();
		Utils.logPrint("Home Page");
	}

	@Quando("altero o valor da combo Select version para 'Bootstrap V4 Theme'")
	public void alterarValorDoCombo() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.AlterarValorCombo();
		Utils.logPrint("Altera valor do combo");
	}

	@E("clico no botao Add Customer")
	public void clicarNoBotaoAddCustomer() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.ClicarNoBotaoAddCostumer();
		Utils.logPrint("Clica no botão AddCostumer");
	}

	@E("digito o valor 'Teste Sicredi' no campo Name")
	public void preencherCampoFirstName() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PreencherCampoName();
		Utils.logPrint("Digita valor no campo Name");
	}

	@E("digito o valor 'Teste' no campo Last name")
	public void preencherCampoLastName() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PreencherCampoLastName();
		Utils.logPrint("Digita valor no campo Last Name");
	}

	@E("digito o valor 'Matheus' no campo ContactFirstName")
	public void preencherCampoContactFirstName() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PreencherCampoContactFirstName();
		Utils.logPrint("Digita valor no campo ContactFirstName");
	}

	@E("digito o valor '51 9999-9999' no campo Phone")
	public void preencherCampoPhone() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PreencherCampoPhone();
		Utils.logPrint("Digita valor no campo Phone");
	}

	@E("digito o valor 'Av Assis Brasil, 3970' no campo AddressLine1")
	public void preencherCampoAddressLine1() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PreencherCampoAddressLine1();
		Utils.logPrint("Digita valor no campo address1");
	}

	@E("digito o valor 'Torre D' no campo AddressLine2")
	public void preencherCampoAddressLine2() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PreencherCampoAddressLine2();
		Utils.logPrint("Digita valor no campo Address2");
	}

	@E("digito o valor 'Porto Alegre' no campo City")
	public void preencherCampoCity() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PreencherCampoCity();
		Utils.logPrint("Digita valor no campo City");
	}

	@E("digito o valor 'RS' no campo State")
	public void preencherCampoState() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PrencherCampoState();
		Utils.logPrint("Digita valor no campo State");
	}

	@E("digito o valor '91000-000' no campo PostalCode")
	public void preencherCampoPostalCode() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PreencherCampoPostalCode();
		Utils.logPrint("Digita o Código Postal");
	}

	@E("digito o valor 'Brasil' no campo Country")
	public void preencherCampoCountry() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PreencherCampoCountry();
		Utils.logPrint("Digita nome do país");
	}

	@E("clico na opção Fixter no combo chosen-select")
	public void clicarNaOpcaoFixter() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.AlterarValorComboEmployeer();
		Utils.logPrint("Escolhe Fixter no combo chosen-select");
	}

	@E("digito o valor 200 no campo CreditLimit")
	public void preencherCampoCreditLimit() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.PreencherCampoCreditLimit();
		Utils.logPrint("Digita valor no campo CreditLimit");
	}

	@E("clico no botão  Save")
	public void clicarNoBotaoSave() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.ClicarNoBotaoSave();
		Utils.logPrint("Cliente Cadastrado");
	}

	@Entao("^quando vejo a mensagem 'Your data has been successfully stored into the database\\. Edit Customer or Go back to list'$")
	public void apresentarMensagemNaTela() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.ApresentarMensagemNaTela();
		Utils.logPrint("Valida Mensagem retornada");
	}

	@Dado("^clico no link Go back to list$")
	public void clicarNoLinkGoBackToList() {
		CadastroPage cadastroPage = new CadastroPage();
		cadastroPage.ClicarNoLinkGoBackToList();
		Utils.logPrint("Volta para a lista");

	}
	
	
}
