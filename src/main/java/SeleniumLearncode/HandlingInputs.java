package SeleniumLearncode;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		//enter full name
		driver.findElementById("fullName").sendKeys("Mahalakshmi");
		//append a text and press keyboard tab
		driver.findElementById("join").sendKeys(" person",Keys.TAB);
		//what is inside the box
		String myValue=driver.findElementById("getMe").getAttribute("value");
		System.out.println(myValue);
		//clear the text
		driver.findElementById("clearMe").clear();
		//confirm edit field is disabled
		boolean editfield=driver.findElementById("noEdit").isEnabled();
		System.out.println(editfield);
		//confirm text is read only
		driver.findElementById("dontwrite").getAttribute("readonly");
		//quit browser
		driver.quit();
		
		
		

	}

}
