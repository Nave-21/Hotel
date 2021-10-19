package com.hotel.stepdefinition;

import java.io.IOException;

import com.hotel.baseclass.BaseClass2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends BaseClass2 {
	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("Scenario name : " + name);
	}
	@After
	public void afterHooks(Scenario scenario) throws Throwable {
		Status status = scenario.getStatus();
		System.out.println("Scenario status : " + status);
		if (scenario.isFailed()) {
			takeScreenshot("C:\\Users\\User\\eclipse-workspace\\Hotel\\Screenshot\\img.png");
		}
	}

}
