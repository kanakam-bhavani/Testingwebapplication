package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcomemercurytours {
	//<a href="mercurysignon.php">SIGN-ON</a>
	
	
	@FindBy(linkText= "REGISTER")
	WebElement register;
	public void register() {
		register.click();
	}
@FindBy(name= "userName")
WebElement userName;
public void userName() {
	userName.click();
}
@FindBy(name= "password")
WebElement password;
public void password() {
	userName.click();
}
@FindBy(name= "login")
WebElement SignIn;
public void logIn(String uName, String pwd) {
	userName.sendKeys(uName);
	password.sendKeys(pwd);
	SignIn.click();
}
}
