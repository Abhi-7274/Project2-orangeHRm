package Project2.OrangeHRM;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.Propereties;
public class TC04 extends Propereties{

	public static void main(String[] args) throws InterruptedException, IOException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		    driver.findElement(By.name("username"));
			driver.findElement(By.name("password")).sendKeys(password());
			driver.findElement(By.xpath(xpath())).click();
			
		}
  }

