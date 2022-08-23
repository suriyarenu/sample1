package java.utill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.login.main;

public class scanner { 
	public static <WebElement> void main(String[]args) { 
		System.setProperty("Webdriver.Chrome.Driver",
				"C:\\Users\\surya\\eclipse-workspace\\selenium\\driver\\chromedriver.exe"); 
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		
        WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("9941176687");
		
		WebElement email1 = driver.findElement(By.id("email"));
		String attribute = email.getAttribute("type");
		System.out.println(attribute);
		
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("suriya92");
		
		WebElement pass1 = driver.findElement(By.id("pass"));
		String attribute2 = pass.getAttribute("type");
		System.out.println(attribute);
		
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		
	
	
	
	}
	} 
	

