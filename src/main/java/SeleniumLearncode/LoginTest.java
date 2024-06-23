package SeleniumLearncode;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Open letcode
		driver.get("https://letcode.in/");
		//Login
		driver.findElementByLinkText("Log in").click();
		//enter email
		driver.findElementByName("email").sendKeys("mahalakshminagaraj123@gmail.com");
		//enter password
		driver.findElementByName("password").sendKeys("Maha@1997");
		//click login button
		driver.findElementByXPath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button").click();
		
		
		

	}

}
