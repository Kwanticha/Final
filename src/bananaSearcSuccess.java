import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class bananaSearcSuccess {
 
	@Test
	void testBananaSerch() {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.oppo.com/th/");
		
		driver.manage().window().maximize();
		    
		driver.findElement(By.xpath("//*[@id=\"header-v2\"]/div[1]/div[2]/div[1]/div/input")).sendKeys("OPPO Reno8 5G");
		driver.findElement(By.xpath("//*[@id=\"header-v2\"]/div[1]/div[2]/div[1]/div/input")).sendKeys(Keys.ENTER);
		
		//Assert
		
		assertTrue(driver.getPageSource().contains("OPPO Reno8 "));
	    

	
        driver.quit();

		

	}

	

	@Disabled

	void testSearchProductFail(){

		fail("Not yet implemented");

	}



}