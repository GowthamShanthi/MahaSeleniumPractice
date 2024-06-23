package SeleniumLearncode;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationButtons {

	private static String String;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		String url=driver.getCurrentUrl();
		System.out.println("button page url"+ url);
		Thread.sleep(3000);
		driver.findElementById("home").click();
		String homeurl=driver.getCurrentUrl();
		System.out.println(" home page url"+homeurl);
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("returns to button page"+driver.getCurrentUrl());
		driver.navigate().refresh();
		
	
	

	}

}
