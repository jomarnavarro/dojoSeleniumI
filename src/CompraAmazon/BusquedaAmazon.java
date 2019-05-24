package CompraAmazon;

import javax.xml.ws.WebEndpoint;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusquedaAmazon extends BaseTest {

	@Test
	public void buscarArticulo() {

		String titulo = driver.getTitle();
		if (titulo.equals("Amazon.com.mx: Precios bajos - Envío rápido - Millones de productos")) {
			System.out.println("Titulo existente");
		}

	}

}
