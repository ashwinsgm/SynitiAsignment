import com.syniti.util.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private static WebDriver driver;
	@Before
	public void initializeDriver() {
		/*System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();*/

	}
	@After
	public void exitDriver() {

		driver.close();
		driver.quit();
	}

}
