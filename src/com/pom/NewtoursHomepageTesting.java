package com.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewtoursHomepageTesting {
FirefoxDriver driver;
@BeforeTest
public void setup() {
	driver= new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void homepage() {
	Welcomemercurytours wmt= PageFactory.initElements(driver, Welcomemercurytours.class);
	
	wmt.register();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	driver.navigate().back();
	wmt.logIn("tutorial", "tutorial");
}
}
