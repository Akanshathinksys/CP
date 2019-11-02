

	

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class dd  {
		

		public static void main(String[] args) {
			
		 System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");  
		 WebDriver driver= new ChromeDriver();
		    	
		 driver.get("https://www.match.com/");
		 
		Select GGSdrpdn = new Select (driver.findElement(By.name("ggs")));
		GGSdrpdn.selectByIndex(2);
		driver.findElement(By.xpath("//button [@class = 'button button-primary']")).click(); 
		//List<WebElement> element =  driver.findElements(By.xpath("//button [@class = 'button button-primary']"));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("emailField")).sendKeys("tecfstakku@dffd.com");
		driver.findElement(By.id("passwordField")).sendKeys("autotest");
		
		Select Monthdrpdn = new Select (driver.findElement(By.name("birthMonth")));
		Monthdrpdn.selectByIndex(6);
		
		Select Yeardrpdn = new Select (driver.findElement(By.name("birthYear")));
		Yeardrpdn.selectByIndex(6);
		
		Select Daydrpdn = new Select (driver.findElement(By.id("birthDay")));
		Daydrpdn.selectByIndex(6);
		
		//List<WebElement> element =  driver.findElements(By.xpath("//button [@class = 'button button-primary']"));
		//System.out.println(element);
		
		//WebDriverWait wait = new WebDriverWait(driver, 120);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button [@class = 'button button-primary']")));
		
		driver.findElement(By.className("action")).click();
		
		//.click();
		
		driver.findElement(By.id("handleField")).sendKeys("testakkuone");
		
		List<WebElement> element =  driver.findElements(By.xpath("//button [@class = 'ui-submit button button-primary btnRegister']"));
		
		element.get(1).click();
		
		
		
		System.out.println(element.size());
		//driver.findElements(By.className("action register")).click();

		

		
		
		    
		   
		 
		
	}
	}

