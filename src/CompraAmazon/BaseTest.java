package CompraAmazon;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public WebDriver driver;

	@Before
	public void setup() {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://www.amazon.com.mx");

	}

	@After
	public void close() {
		driver.quit();

	}
}
