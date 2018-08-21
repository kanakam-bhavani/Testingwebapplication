package com.cookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identifyingnamesanddomainsofcookies_facebook {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com");
		Set<Cookie>mycookies= driver.manage().getCookies();
		System.out.println("total number of cookies are:" + mycookies.size());
		Iterator<Cookie>it= mycookies.iterator();
		while(it.hasNext()) {
			Cookie c= it.next();
			System.out.println(c.getName() + " " + c.getDomain());
		}
		

	}

}
