package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reqCall {
	public static void main(String[] args) {
		// Filling out the details of the Request call back section fields in MAB website
		
		System.setProperty("webdriver.chrome.driver", "C:////work////chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://www.mortgageadvicebureau.com/contact-us");
		driver.findElement(By.xpath("//button[@class='cookies__button js-cookies-trigger']")).click();
		//driver.findElement(By.id("callbackModalBtn")).click();
		driver.findElement(By.id("FirstName")).sendKeys("First");
		driver.findElement(By.id("LastName")).sendKeys("User");
		driver.findElement(By.id("EmailAddress")).sendKeys("firstuser@gmail.com");
		driver.findElement(By.id("PhoneNumber")).sendKeys("00000000");
		driver.findElement(By.id("BestTimeToCallYou")).sendKeys("10 am");
		//Static dropdown selection
		Select sl= new Select(driver.findElement(By.id("ReasonForEnquiry")));
		sl.selectByValue("Home Mover");
                /*Explicit wait for finding the check box element but the below cant be proceeded due to recaptcha interruption
		WebDriverWait w= new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("OptInEmail")));
		//WebElement ch= driver.findElement(By.id("OptInEmail"));
		//Checking and unchecking the check box
		driver.findElement(By.id("OptInEmail")).click();
		driver.findElement(By.id("OptInEmail")).click();*/
		driver.close();
		
      
	}

}
