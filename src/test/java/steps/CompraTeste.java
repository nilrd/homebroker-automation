package steps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class CompraTeste  {

 Metodos metodo = new Metodos();
 Elementos el = new Elementos();
  
  
  @BeforeEach
  public void setUp() {
	   Executa.iniciarTeste();

  }
  
  @AfterEach
  public void tearDown() {
	  Executa.finalizarTeste();
  }

  @Test
  public void comprarAtivo() {
	metodo.escrever(el.asset, "AAPL");
    metodo.escrever(el.price, "25.00");
    metodo.escrever(el.quantity, "10");
    metodo.clicar(el.buy_button);
    metodo.validarTexto(el.balance, "R$9750.00");
    metodo.validarTexto(el.portfolio, "AAPL: 10");
    
   
    
  }

  @Test
  public void comprarPrecoErrado() {
	  metodo.escrever(el.asset, "AAPL");
	    metodo.escrever(el.price, "35.00");
	    metodo.escrever(el.quantity, "10");
	    metodo.clicar(el.buy_button);
	    metodo.validarAlertTexto("Dados inválidos.");
	  
  }
	  
	    
	  
	  
	  
    
  
 
}