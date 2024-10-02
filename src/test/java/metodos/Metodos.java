package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {
	
	/**
	 * escrever em um elemento Web usando a class By
	 * @param elemento
	 * @param texto
	 * @author nilson brites
	 * @category testes de ui
	 */
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	/**
	 * clicar em um elemento Web usando a class By
	 * @param elemento
	 * @author nilson.brites
	 * @category testes de ui
	 */
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}

	/**
	 * Validando o texto capturado do elemento
	 * @param elemento
	 * @param textoEsperado
	 * @author nilson.brites
	 * @category testes de ui
	 */
	
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
				assertEquals(textoEsperado, textoCapturado);
		
	}
	
	
	/**
	 * Validando o texto capturado de um alert
	 * @param elemento
	 * @param textoEsperado
	 * @author nilson.brites
	 * @category testes de ui
	 */
	public void validarAlertTexto( String textoEsperado) {
		String textoCapturado = driver.switchTo().alert().getText();
		assertEquals(textoEsperado, textoCapturado);
}
	
}