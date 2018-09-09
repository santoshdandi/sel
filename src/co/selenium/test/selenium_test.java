package co.selenium.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Selinium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		String at=driver.getTitle();
		String et="gmail";
		driver.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("test is successful");
		}
		else {
			System.out.println("test failed");
		}
		
	}

}
