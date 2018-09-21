package com.crm.qa.util;

import com.crm.qa.base.baseTest;

public class TestUtil extends baseTest{
public	static long PAGE_LOAD_TIMEOUT =20;
	public static long IMPLICIT_WAIT =10;
	
	public void switchtoFrame() {
		driver.switchTo().frame("mainpanel");
	}
	

}
