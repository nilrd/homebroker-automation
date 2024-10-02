package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;

public class Executa extends Drivers {
	
	  
	  public static void iniciarTeste() {
		  ChromeOptions options = new ChromeOptions(); // É uma class do selenium
		  options.addArguments("--start-maximized");
		    driver = new ChromeDriver(options);
		    driver.get("file:///C:/Users/Pichau/Documents/hb/hb.html");
		  
	  }
	  
	  public static void finalizarTeste() {
		  driver.quit();
	  }

}
