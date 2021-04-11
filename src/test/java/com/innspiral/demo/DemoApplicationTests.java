package com.innspiral.demo;

import com.hackerrank.test.utility.TestWatchman;
import com.innspiral.demo.requests.ClientControllerTest;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		ClientControllerTest.class
})
class DemoApplicationTests {

	@AfterClass
	public static void tearDownClass() {
		TestWatchman.watchman.createReport(DemoApplicationTests.class);
	}

}
