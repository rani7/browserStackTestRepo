package bs.grid.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import bs.grid.pages.BSBaseTest;
import org.testng.annotations.Test;

public class BSTest extends BSBaseTest {

	@Test
	public void googleTest() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium tutorial");
		List <WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(WebElement item:list)
		{
			System.out.println(item.getText());
			if(item.getText().equals("selenium tutorial java"))
			{
				item.click();
				System.out.println("Found");
				break;
			}						
		}
		Thread.sleep(10);
	}
}
