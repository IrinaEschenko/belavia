
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;


public class simpleQuizAutorization {
			 
				private static final String CHROME = "webdriver.chrome.driver";
				private static final String CHROME_PATH = "d:\\driver\\chromedriver_win32\\chromedriver.exe";
				private WebDriver driver;
				
				@Before
				public void initDriver() {
					System.setProperty(CHROME, CHROME_PATH);
					driver = new ChromeDriver();
					
				}
				
				@Test
				public void testAutorization() {
					driver.get("https://belavia.by/");

					WebElement originField = driver.findElement(By.id("OriginLocation_Combobox"));
					originField.sendKeys("Минск");		

					WebElement destField = driver.findElement(By.id("DestinationLocation_Combobox"));
					destField.sendKeys("Рига");	
					WebElement depData = driver.findElement(By.id("DepartureDate_Datepicker"));
					//originField.sendKeys("Минск");	
					
					
				/*	
					WebElement passField = driver.findElement(By.name("registrationForm.password"));
				
					passField.sendKeys("irinaEch32");
									
					WebElement repassField = driver.findElement(By.name("registrationForm.repassword"));
				
					repassField.sendKeys("irinaEch32");
					
					WebElement emailField = driver.findElement(By.name("registrationForm.email"));
					emailField.sendKeys("artyr.lala@gmail.com");
					WebElement isCorporateField = driver.findElement(By.name("registrationForm.corporate"));
					if ( !driver.findElement(By.name("registrationForm.corporate")).isSelected() )
					{
						WebDriverWait wait3 = new WebDriverWait(driver, 100000);
					     driver.findElement(By.name("registrationForm.corporate")).click();
					} 
					WebDriverWait wait = new WebDriverWait(driver, 100000);
					WebElement friendField = driver.findElement(By.name("registrationForm.friend"));
				
					WebElement submitField = driver.findElement(By.name("ok"));
					WebDriverWait wait2 = new WebDriverWait(driver, 10000);
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					submitField.click();
					*/
					
					System.out.println(" ok");
					
					//driver.close();
				}
						
		
		
	}

