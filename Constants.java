package com.config;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.utility.ExcelOperations;
import com.utility.ScreenShots;

public class Constants {
	
	public RemoteWebDriver driver;

	public static Logger Log = Logger.getLogger(Constants.class.getName());

		public static ScreenShots sc=new ScreenShots();
		
		public static ExcelOperations EO=new ExcelOperations();
		

		
		public String excelpath=System.getProperty("user.dir")+"\\src\\com\\excel\\TestData.xlsx";
		
		public static String dataEngine=System.getProperty("user.dir")+"\\src\\com\\excel\\DataEngine.xlsx";

		public String logPath=System.getProperty("user.dir")+"\\src\\com\\config\\log4j.properties";
		
		public String DriverPath=System.getProperty("user.dir")+"\\Binary\\chromedriver.exe";
		
		public String ScreensPath=System.getProperty("user.dir")+"\\Binary\\Screens\\";
		
		//Editing this file from Github
		
		
		public void openBrowser() {
			
			PropertyConfigurator.configure(logPath);		
			System.setProperty("webdriver.chrome.driver",DriverPath);
			ChromeDriver driver = new ChromeDriver();
			String url = "http://www.demo.guru99.com/V4/index.php";
			driver.get(url);
			driver.manage().window().maximize();		
		
		}
		
		//Method Overloading - Method has same name but different parameters
		public void openBrowser(String url) {
			PropertyConfigurator.configure(logPath);		
			System.setProperty("webdriver.chrome.driver",DriverPath);
			ChromeDriver driver = new ChromeDriver();
			//String url = "http://www.demo.guru99.com/V4/index.php";
			driver.get(url);
			driver.manage().window().maximize();
			
		}	

}
