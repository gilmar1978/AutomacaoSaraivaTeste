package CadastroUsuarios;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import servicos.Driver;
import utilidades.Utilidades;

public class CadastroUsuariosPageObject extends Utilidades {

	
	private By btnCadastraSe = By.id("link-account");
	private By btnEntreOuCadastraSe = By.id("vtexIdUI-saraiva-oauth");
	private By btnCadastrar = By.xpath("//a[@class='btn btn--block btn-large m-t-15 cadastra]r-usuario']");
	private By cmpNome = By.id("InputNome1");
	private By cmpSobreNome = By.id("iInputSobrenome1");
	private By cmpEmail = By.id("InputEmail1");
	private By cmpSenha = By.id("InputSenha1");
	private By cmpConfirmaSenha = By.id("InputConfirmeSenha1");
	private By cmpCPF = By.id("InputCpf1");
	private By btnSelSexo = By.id("RadioMasculino1");  
	private By cmpDataNascimento = By.id("InputDataNascimento1");
	private By cmpTelefone = By.id("InputCelular1");
	private By btnSelPais = By.id("SelectPais1");
	private By cmpCEP = By.id("InputCep1");
	private By cmpNumero = By.id("InputNumero1");        
	private By cmpTelContato = By.id("InputTelefone1");
	private By btnEscolhePromocao = By.id("InputOfertasPromocionais1");
	private By btnFinalizarCadastro = By.id("FinalizarCadastro1");





	public void acessarPortal() {
		Driver.getInstance();
		Driver.getInstance().get("https://www.saraiva.com.br/");
	}

//	public void preencherNome(String nome) {
//		esperarAteElementoEstarClicavel(this.cmpNome);
//		limpaEInsereTexto(nome, this.cmpNome);
//	}
//
//	public void preencherEmail(String email) {
//		esperarAteElementoEstarClicavel(this.cmpEmail);
//		limpaEInsereTexto(email, this.cmpEmail);
//	}

//	public void preencherSenha(String senha) {
//		esperarAteElementoEstarClicavel(cmpSenha);
//		limpaEInsereTexto(senha, this.cmpSenha);
//	}

//	public void clicarCadastrar() {
//		clicar(this.btnCadastrar);
//		
//	}
	

	public void clicaLinkCadastreSe() {
		clicar(this.btnCadastraSe);
		
	}

	public void clicaBotaoEntreOucadastre1() {
		clicar(this.btnEntreOuCadastraSe);
		espera(20000);
		
	}
	
	
	public void alteraAba() {			
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);

		}
	}
	

	public void clicaCadastrar() {
		clicar(this.btnCadastrar);
		espera(30000);		
		
	}	
	

	public void preencheNome(String nome) {
		esperarAteElementoEstarClicavel(this.cmpNome);
		limpaEInsereTexto(nome, this.cmpNome);
		
	}

	public void preencheSobreNome(String SobreNome) {
		esperarAteElementoEstarClicavel(this.cmpSobreNome);
		limpaEInsereTexto(SobreNome, this.cmpSobreNome);
		
	}

	public void preencheEmail(String email) {
		esperarAteElementoEstarClicavel(this.cmpEmail);
		limpaEInsereTexto(email, this.cmpEmail);
		
	}

	public void preencheSenha(String senha) {
		esperarAteElementoEstarClicavel(cmpSenha);
		limpaEInsereTexto(senha, this.cmpSenha);
		
	}

	public void preencheConfirmaSenha(String ConfirmaSenha) {
		esperarAteElementoEstarClicavel(cmpConfirmaSenha);
		limpaEInsereTexto(ConfirmaSenha, this.cmpConfirmaSenha);
		
	}

	public void preencheCPF(String CPF) {
		esperarAteElementoEstarClicavel(cmpCPF);
		limpaEInsereTexto(CPF, this.cmpCPF);
		
	}

	public void selecionaSexo() {
		clicar(this.btnSelSexo);
		
	}

	public void preencheDataNascimento(String DataNascimento) {
		esperarAteElementoEstarClicavel(cmpDataNascimento);
		limpaEInsereTexto(DataNascimento, this.cmpDataNascimento);
	}

	public void preenchoTelefone(String Telefone) {
		esperarAteElementoEstarClicavel(cmpTelefone);
		limpaEInsereTexto(Telefone, this.cmpTelefone);
				
	}

	public void selecionoPais() {
		clicar(this.btnSelPais);
		
	}

	public void preencheCep(String CEP) {
		esperarAteElementoEstarClicavel(cmpCEP);
		limpaEInsereTexto(CEP, this.cmpCEP);
		
	}

	public void preencheNumero(String Numero) {
		esperarAteElementoEstarClicavel(cmpNumero);
		limpaEInsereTexto(Numero, this.cmpNumero);
		
	}

	public void preencheTelefoneContato(String TelefoneContato) {
		esperarAteElementoEstarClicavel(cmpTelContato);
		limpaEInsereTexto(TelefoneContato, this.cmpTelContato);
		
	}

	public void escolhaRecebePromocao() {
		clicar(this.btnEscolhePromocao);
		
		
	}

	public void clicaFinalizarCadastro() {
		clicar(this.btnFinalizarCadastro);
		
	}

	@SuppressWarnings("deprecation")
	public void validarPalavraChave() {
		String texto = driver.findElement(By.id("btn-sair-da-sua-conta-02")).getText();
		Assert.assertEquals("Sair", texto);
		
		
				
	}


}
