package com.sqa.wc;

import org.testng.annotations.*;

import com.sqa.wc.core.*;

public class PropertiesTest extends Core {

	public PropertiesTest() {
		super(null, "sample-site.com");
	}

	@Override
	public String getPropsLocation() {
		return "src/main/resources/config.properties";
	}

	@Test(enabled = false)
	public void testReadProperties() {
		System.out.println("username is " + read("username") + ".");
		System.out.println("password is " + read("password") + ".");
		System.out.println("server ip address is " + read("server_ip") + ".");
		System.out.println("test url is " + read("test_url") + ".");
	}

	@Test(enabled = true)
	public void testWriteProperties() {
		System.out.println("writing username... " + write("username", "newjf"));
		System.out.println("writing password... " + write("password", "123jf"));
		System.out.println("writing server ip... " + write("server_ip", "231.0.0.10"));
		System.out.println("writing test url... " + write("test_url", "google.com"));
	}
}
