package com.cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identifyingcookies_facebook {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com");
		Set<Cookie>mycookies= driver.manage().getCookies();
		System.out.println("total number of cookies are:" + mycookies.size());
		

	}

}
