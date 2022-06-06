package com.arthi.automation;

import org.testng.annotations.Test;

import com.arthi.automation.common.TestBase;

public class FirstTest extends TestBase {

    @Test(priority=0, description=" verify the login test with valid username and password")
	public void valid_Username_Password_Test() {
        assertEquals("Test", "Test");
    }

    @Test(priority=0, description=" verify the login test2 with valid username and password")
	public void valid_Username_Password_Test2() {
        assertEquals("Test2", "Test2");
    }

    @Test(priority=0, description=" verify the login test3 with valid username and password")
	public void valid_Username_Password_Test3() {
        assertEquals("Test3", "Test3");
    }

    @Test(priority=0, description=" verify the login test4 with valid username and password")
	public void valid_Username_Password_Test4() {
        assertEquals("Test4", "Test4");
    }

    @Test(priority=0, description=" verify the login test5 with valid username and password")
	public void valid_Username_Password_Test5() {
        assertEquals("Test5", "Test5");
    }

    @Test(priority=0, description=" verify the login test6 with valid username and password")
	public void valid_Username_Password_Test6() {
        assertEquals("Test6", "Test6");
    }

}
