import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTutEx1 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("just an example");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ustjavasdetb413\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//url of web page 
		driver.get("https://www.facebook.com/signup");
		//maximize facebook page
		driver.manage().window().maximize();
		
		WebElement day1=driver.findElement(By.id("day"));
		Select osselect = new Select(day1);
		Thread.sleep(3000);
		osselect.selectByValue("30");
		
		
		WebElement month1=driver.findElement(By.id("month"));
		Select months=new  Select(month1);
		months.selectByVisibleText("feb");
	}

}
