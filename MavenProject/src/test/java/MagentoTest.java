
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	
	@Test
	public void magento(){
		String url="http://www.magento.com";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		HomePage h = new HomePage(driver);
		h.clickOnMyAcc();
		
		LoginPage l1 = new LoginPage(driver);
		l1.typeEmail("nitinmanjunath1991@gmail.com");
		l1.typePassword("Welcome123");
		l1.clickOnLogin();
		
		LogoutPage l2 = new LogoutPage(driver);
		l2.clickOnLogout();
		
		driver.quit();
		
		
	}

}
