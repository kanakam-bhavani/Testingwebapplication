package com.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_JqueryUI {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		//<div id="draggable">
		WebElement drag= driver.findElement(By.id("draggable"));
		//<div id="droppable">
		
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();

	}

}
