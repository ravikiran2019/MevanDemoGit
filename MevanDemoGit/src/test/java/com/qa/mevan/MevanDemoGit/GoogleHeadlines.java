package com.qa.mevan.MevanDemoGit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleHeadlines {
	 WebDriver driver;
	 @BeforeTest

	 public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\\\Users\\\\JK\\\\eclipse-workspace\\\\Automation_practice\\\\drivers\\\\geckodriver.exe");
		 driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://news.google.co.in");
	    
		}

	 @Test
	 public void f() {
	  List <WebElement> headlines=driver.findElements(By.xpath("//div[@class=\"NiLAwe mi8Lec  gAl5If sMVRZe Oc0wGc R7GTQ keNKEd j7vNaf nID9nc\"][1]"));
	  for(int i=0;i<headlines.size();i++)
	  {
		System.out.println(headlines.get(i).getText());  
		  
	  }}
	  @AfterTest
		  public void head()
		  {
		  driver.close();
		  }
	  }



