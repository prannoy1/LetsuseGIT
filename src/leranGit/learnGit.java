package leranGit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class learnGit {
	
	@Test
	public void git(){
		System.out.println("start");
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		System.out.println("stop");
	}

}
