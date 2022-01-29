package com.petstore.ui.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

		public static WebDriver driver;
		public static Properties prop;

		public Baseclass() {
		try {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/petstore"
		+ "/ui/config/config.properties");
		prop.load(fis);
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
		}

		public static void initialization() {
			String browserName = prop.getProperty("browser");
			System.out.println(prop.getProperty("browser"));
			if (browserName.equals("chrome")) {
			// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			} else if (browserName.equals("FirefoxDriver")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("URL"));

			long pageLoadTime = Long.parseLong(prop.getProperty("pageLoadTime"));
			long implicitlywait = Long.parseLong(prop.getProperty("implicitlywait"));

			driver.manage().timeouts().pageLoadTimeout(pageLoadTime, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(implicitlywait, TimeUnit.SECONDS);

	}

}
