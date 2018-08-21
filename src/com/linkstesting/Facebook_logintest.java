package com.linkstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_logintest {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
//Browser minimize
		driver.manage().window().maximize();
		//id="email"
		driver.findElement(By.id("email")).sendKeys("hello");
		Actions act= new Actions(driver);
		//perform tab operation on the keyboard
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("hii").build().perform();
		//perform enter key operation on the keyboard
		act.sendKeys(Keys.ENTER).build().perform();
	}

}
