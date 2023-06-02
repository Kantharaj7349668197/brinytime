package sample;

import org.testng.annotations.Test;

public class TestNG1test {
     @Test(invocationCount = 1)
	public void qspideradmission()
	{
		System.out.println("admission agbeku");
	}
    @Test(priority = 2)
	public void sqlclass() 
	{
		System.out.println("sql class complete agbeku");
	}
	@Test()
	public void mannualclass()
	{
		System.out.println("mannual class complete agbeku");
	}
	@Test(priority = 1)
	public void javaclass()
	{
		System.out.println("java class complete agbeku");
	}
	
	@Test
	public void seleniumclass()
	{
		System.out.println("selenium class complete agbeku");
	}
}
