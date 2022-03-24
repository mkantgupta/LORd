package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Seleni {
	static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("selenium automation learning");
		driver.findElement(By.name("q")).submit();

	}


	private static void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
