package Automationgit;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Playsong_on_youtube {

	public static void main(String[] args)
	{
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.co.in/");
      Scanner sc = new Scanner(System.in);
      System.out.println("enter an address you want to search on google");
      String address=sc.nextLine();
      driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(address);
	}

	public void add()
	{
		System.out.println("Akash is a chef in making noodles");
		int c;
	}

	public void dog()
	{
		System.out.println("bhobho bho bho bhooo hooooooo");
	}
	public void cat()
	{
		System.out.println("meuoo meuooo meoooo");
	}
	public void thy()
	{
		System.out.println("test completed");
	}
	public void sanj()
	{
		System.out.println("hhhr");
	}

}
