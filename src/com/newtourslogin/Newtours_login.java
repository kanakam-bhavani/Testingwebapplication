package com.newtourslogin;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours_login {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		/*<a href="mercuryregister.php">REGISTER</a>
		driver.findElementByLinkText("REGISTER").click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		<a href="mercuryunderconst.php?osCsid=94dcd832cd1fdfc23ba0c284f6966ecf">SUPPORT</a>
		driver.findElementByLinkText("SUPPORT").click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());*/
		//<a href="mercurysignon.php">SIGN-ON</a>
		driver.findElementByLinkText("SIGN-ON").click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		}

}