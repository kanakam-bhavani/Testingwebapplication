package com.keyboarddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginkeywords {
FirefoxDriver driver;
String url = "http://newtours.demoaut.com";
public void LaunchBrowser() {
	driver= new FirefoxDriver();
}
public void navigate() {
	driver.get(url);
}
public void enterUserName() {
	driver.findElement(By.name("userName")).sendKeys("tutorial");
}
public void enterPassword() {
	driver.findElement(By.name("password")).sendKeys("tutorial");
}
public void clickLogIn() {
	driver.findElement(By.name("login")).click();
}
}
