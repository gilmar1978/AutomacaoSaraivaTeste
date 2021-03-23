package CadastroUsuarios;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroSteps {

	private static CadastroUsuariosPageObject cadastroUsuarios;

	public CadastroSteps() {

		cadastroUsuarios = new CadastroUsuariosPageObject();
	}

	@Dado("que eu estou acessando o portal")
	public void acessarOPortal() {
		cadastroUsuarios.acessarPortal();
	}
								
	@Quando("^clico no link cadastre se$")
	public void clico_no_link_cadastre_se() throws Throwable {
		cadastroUsuarios.clicaLinkCadastreSe();
	}

	@Quando("^clico no botão Entrar ou cadastre se$")
	public void clico_no_botão_Entrar_ou_cadastre_se() throws Throwable {
		  cadastroUsuarios.clicaBotaoEntreOucadastre1();
	}

	@Quando("^clico no botão cadastrar$")
	public void clico_no_botão_cadastrar() throws Throwable {
		cadastroUsuarios.clicaCadastrar();
//		
	}

	@Quando("^preencho o campo nome  \"([^\"]*)\"$")
	public void preencho_o_campo_nome(String nome) throws Throwable {
		cadastroUsuarios.preencheNome(nome);
	}

	@Quando("^preencho o campo sobrenome \"([^\"]*)\"$")
	public void preencho_o_campo_sobrenome(String SobreNome) throws Throwable {
		cadastroUsuarios.preencheSobreNome(SobreNome);
	}

	@Quando("^preencho o campo email \"([^\"]*)\"$")
	public void preencho_o_campo_email(String email) throws Throwable {
		 cadastroUsuarios.preencheEmail(email);
	}

	@Quando("^preencho o campo senha \"([^\"]*)\"$")
	public void preencho_o_campo_senha(String senha) throws Throwable {
		cadastroUsuarios.preencheSenha(senha);
	}

	@Quando("^preencho o campo confirme a senha \"([^\"]*)\"$")
	public void preencho_o_campo_confirme_a_senha(String ConfirmaSenha) throws Throwable {
		 cadastroUsuarios.preencheConfirmaSenha(ConfirmaSenha);
	}

	@Quando("^preencho o campo CPF \"([^\"]*)\"$")
	public void preencho_o_campo_CPF(String CPF) throws Throwable {
		  cadastroUsuarios.preencheCPF(CPF);
	}

	@Quando("^seleciono Sexo$")
	public void seleciono_Sexo() throws Throwable {
		 cadastroUsuarios.selecionaSexo();
	}

	@Quando("^preencho o campo data de nascimento \"([^\"]*)\"$")
	public void preencho_o_campo_data_de_nascimento(String DataNascimento) throws Throwable {
	 	 cadastroUsuarios.preencheDataNascimento(DataNascimento);
	}

	@Quando("^preencho o campo telefone \"([^\"]*)\"$")
	public void preencho_o_campo_telefone(String Telefone) throws Throwable {
	 	cadastroUsuarios.preenchoTelefone(Telefone);
	}

	@Quando("^seleciono país$")
	public void seleciono_país() throws Throwable {
		cadastroUsuarios.selecionoPais();
	}

	@Quando("^preencho o campo CEP \"([^\"]*)\"$")
	public void preencho_o_campo_CEP(String CEP) throws Throwable {
		 cadastroUsuarios.preencheCep(CEP);
	}

	@Quando("^preencho o campo numero \"([^\"]*)\"$")
	public void preencho_o_campo_numero(String Numero) throws Throwable {
		cadastroUsuarios.preencheNumero(Numero);
	}

	@Quando("^preencho o campo telefone para contato \"([^\"]*)\"$")
	public void preencho_o_campo_telefone_para_contato(String TelefoneContato) throws Throwable {
		 cadastroUsuarios.preencheTelefoneContato(TelefoneContato);
	}

	@Quando("^escolho em receber ou não email com promoções$")
	public void escolho_em_receber_ou_não_email_com_promoções() throws Throwable {
		cadastroUsuarios.escolhaRecebePromocao();
	}

	@Quando("^clico no botao finalizar cadastro Finalizar cadastro$")
	public void clico_no_botao_finalizar_cadastro_Finalizar_cadastro() throws Throwable {
		cadastroUsuarios.clicaFinalizarCadastro();
	}

	@Então("^valido cadastro realziado com sucesso$")
	public void valido_cadastro_realziado_com_sucesso() throws Throwable {
		cadastroUsuarios.validarPalavraChave();
		
	}
	
	
}
