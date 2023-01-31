package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties configProp;
	
	public TestBase() {
		try {
			configProp = new Properties();
			FileInputStream readConfigLoc = new FileInputStream("E:\\Eclipse\\Session18012023\\Session18012023\\src\\com\\config\\config");
			configProp.load(readConfigLoc);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//Initializing web browser
	public static void initialization() {
		String browserName = configProp.getProperty("browser");
		//String URL = configProp.getProperty("URL");
		String URL1=configProp.getProperty("URL1");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		driver.get(URL1);
		
	}
	

}

