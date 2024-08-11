package test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page.blazeregister;
import base.Blazebase;


public class Blazetestreg  extends blazeregister{


	

	public Blazetestreg(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void test()
	{
		blazeregister ob=new blazeregister(driver);
		ob.setvalues("manhamina", "luminar","abc@gfg.com", "asder4", "asder4");
		ob.register();

}
}
