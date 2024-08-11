package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class blazeregister {
	protected WebDriver driver;
	By name=By.xpath("//*[@id=\"name\"]");
	By company=By.xpath("//*[@id=\"company\"]");
	By email=By.xpath("//*[@id=\"email\"]");
	By pass=By.xpath("//*[@id=\"password\"]");
	By cofpass=By.xpath("//*[@id=\"password-confirm\"]");
	By reg=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public blazeregister(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String nme,String compny,String mail,String pas,String copass)
	{
		
		driver.findElement(name).sendKeys(nme);
		driver.findElement(company).sendKeys(compny);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(pass).sendKeys(pas);
		
		driver.findElement(cofpass).sendKeys(copass);
	}
	
	public void register()
	{
		driver.findElement(reg).click();
	}


}
