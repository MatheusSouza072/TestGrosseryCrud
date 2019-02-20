package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.DeletarPage;
import util.Utils;

public class DeletarSteps {


	@Quando("clico na lupa")
	public void clicarLupaConteudoDoName() {
		DeletarPage deletarPage = new DeletarPage();
		deletarPage.clicarLupaConteudoDoName();
		Utils.logPrint("Clica Na Lupa");
		
	}
	
	@Quando("digito o conteudo do Name 'Teste Sicredi'")
	public void digitarConteudoDoName() {
		DeletarPage deletarPage = new DeletarPage();
		deletarPage.digitarNoInputDaLupa();
		Utils.logPrint("Pesquisa Cliente");
	}
	

	@E("clico no checkbox abaixo de Actions")
	public void marcarCheckBox() {
		DeletarPage deletarPage = new DeletarPage();
		deletarPage.MarcarCheckBox();
		Utils.logPrint("Marca Checkbox");
	}

	@E("clico no botao Delete")
	public void clicarNoBotaoDelete() {
		DeletarPage deletarPage = new DeletarPage();
		deletarPage.ClicarNoBotaoDelete();
		Utils.logPrint("Clica No Botao Delete");

	}

	@E("apresenta a mensagem Are you sure that you want to delete this 1 item?")
	public void validarTexto() {
		DeletarPage deletarPage = new DeletarPage();
		deletarPage.ValidarTextoDelete();
		Utils.logPrint("Valida confirmação para deletar");

	}

	@E("clico no proximo botao Delete")
	public void clicarNoBotaoDeleteNaPopup() {
		DeletarPage deletarPage = new DeletarPage();
		deletarPage.ClicarNoBotaoDeleteNaPopup();
		Utils.logPrint("Cliente Deletado com sucesso");

	}

	@Entao("deve apresentar 'Your data has been successfully deleted from the database.'")
	public void exibirMensagemEsperada() {
		DeletarPage deletarPage = new DeletarPage();
		deletarPage.ExibirMensagemEsperada();
		Utils.logPrint("Validade que foi deletado");
	}
}
