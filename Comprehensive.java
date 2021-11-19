package Assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Comprehensive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\star\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.eazydiner.com/");
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"city-name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_city_content\"]/div[1]/ul/li[1]/div/a/div[2]/div[1]")).click();
		driver.findElement(By.id("help")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/section[3]/div/div/div[1]/div[1]/a/div[2]/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"slotForm\"]/div/div/button")).click();
		driver.findElement(By.id("guest_name")).sendKeys("Priyesh");
		driver.findElement(By.xpath("//*[@id=\"guest-form\"]/div/div[2]/div/div/input")).sendKeys("8328991932");
		driver.findElement(By.xpath("//*[@id=\"guest_email\"]")).sendKeys("gudu446@gmail.com");
		driver.findElement(By.id("checkout-button")).click();
		
		
		
		}
		

		

	}


