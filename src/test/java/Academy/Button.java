package Academy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.BaseElement;
import resources.BaseForm;


public class Button extends BaseForm{	
	static String baseurl="https://userinyerface.com/";
	
	@Test
	public void Helpform() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
	     Assert.assertTrue(true, "Main page is open");
	     BaseElement ac=new BaseElement(driver);
	     ac.Here().click();
	    Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"User Inyerface - A worst-practice UI experiment");
       ac.Help().click();
		Thread.sleep(3000);
		
	}
	@Test
	public void Timer() throws InterruptedException {
		Thread.sleep(3000);
		driver.get(baseurl);
		driver.manage().window().maximize();
		 BaseElement ac=new BaseElement(driver);
		 ac.Here().click();
	     Thread.sleep(3000);
	}
	}
