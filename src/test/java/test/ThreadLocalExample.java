package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ThreadLocalExample 
{
	ThreadLocal<WebDriver> tlocal = null;
	
  @Test
  public void f() 
  {
		ThreadLocal<WebDriver> local = null;
	  System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\resources\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  local  = createThreadLocal(driver);
	  local.set(driver);
  }
  
  public ThreadLocal<WebDriver> createThreadLocal(WebDriver driver)
  {	  
	  tlocal = new ThreadLocal<WebDriver>();	  
	  return tlocal;
  }
  
  public void setLocal(WebDriver driver)
  {
	  tlocal.set(driver);
  }
  
  public WebDriver getLocal()
  {
	 return tlocal.get();
  }
}
