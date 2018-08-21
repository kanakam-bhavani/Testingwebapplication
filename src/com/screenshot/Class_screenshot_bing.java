package com.screenshot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Class_screenshot_bing {

	public static void main(String[] args)throws IOException 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.bing.com/");
		
		Sleeper.sleepTightInSeconds(10);
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\kanak\\Desktop\\selenium\\webapplicationtesting\\screenshot\\bing.png"));
				}

}
