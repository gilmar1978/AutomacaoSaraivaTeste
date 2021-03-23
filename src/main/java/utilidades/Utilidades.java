package utilidades;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import servicos.Driver;


public class Utilidades extends Driver {

	

	static java.util.Random randomico = new java.util.Random();
	static String caracteres = "abcdefghijklmnopqrstuvwxyz";
	static String stringRandomica = "";

	
	public static void clicar(By elemento) {
		acharElemento(elemento).click();
	}
	
	public void esperarAteElementoEstarClicavel(By elemento) {
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}

	public void esperarAteAPresencaDoElementoDesejado(By elemento) {
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}
	
	public static WebElement acharElemento(By elemento) {
		return driver.findElement(elemento);
	}


	public static void espera(int iTimeInMillis) {
		try {
			Thread.sleep(iTimeInMillis);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void limpaEInsereTexto(String texto, By campo) {
		if (acharElemento(campo).isDisplayed()) {
			acharElemento(campo).clear();
			acharElemento(campo).sendKeys(texto);
		}
	}

	
	public static void selecionarComboPorTextoVisivel(By by, String visibleText) {
		WebElement element = acharElemento(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(visibleText);
	}
	
	public static void selecionarComboPorIndex(By by, int index) {
		WebElement element = acharElemento(by);
		Select combo = new Select(element);
		combo.selectByIndex(index);
	}

	public static String geraStringRandomica(int quantidadeCaracteres) {
		char[] text = new char[quantidadeCaracteres];

		for (int i = 0; i < quantidadeCaracteres; i++) {
			text[i] = caracteres.charAt(randomico.nextInt(caracteres.length()));
		}
		for (int i = 0; i < text.length; i++) {
			stringRandomica += text[i];
		}
		return stringRandomica;
	}

	
	public static void scroll(By elemento) {
		JavascriptExecutor jse = (JavascriptExecutor) Driver.getInstance();
		jse.executeScript("arguments[0].scrollIntoView();", Driver.getInstance().findElement(elemento));
	}


	public void screenshot(String status, String nomeTeste) {
		try {
			TakesScreenshot fonte = (TakesScreenshot) servicos.Driver.getInstance();
			File fnt = fonte.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fnt,
					new File("Evidencias" + File.separator + status + File.separator + nomeTeste + ".jpg"));
		} catch (Exception e) {
			System.out.println("Erro na Escrita de arquivo.");
		}
	}
}
