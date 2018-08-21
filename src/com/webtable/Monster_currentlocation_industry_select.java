package com.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_currentlocation_industry_select {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://my.monsterindia.com/sponsered_popup.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//<select class="border_grey1">
		WebElement Currentlocation= driver.findElement(By.className("border_grey1"));
		Select selection= new Select(Currentlocation);
		//selection.selectByIndex(2);
	selection.selectByValue("4");
	//<select id="id_industry">
	WebElement industry= driver.findElement(By.id("id_industry"));
	List<WebElement>industrynames=driver.findElements(By.tagName("option"));
	for(int i=0;i<industrynames.size();i++) {
		String name=industrynames.get(i).getText();
		System.out.println(name);
		
	}

	}

}
