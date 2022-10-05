package com.ecommerce.tests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@DisplayName("JUnit 5 Conditional Tests Example")
@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@EnabledOnOs({ OS.WINDOWS })
	public void runOnWindows() {
		System.out.println("This runs on Windows");
	}
	
	@Test
	@DisabledOnOs({ OS.WINDOWS })
	public void notrunOnWindows() {
		System.out.println("This runs on Windows");
	}

	@Test
	@EnabledOnOs({ OS.LINUX })
	public void runOnLinux() {
		System.out.println("This runs on Linux");
	}

	@Test
	@DisabledIf("Math.random() < 0.314159")
	void mightNotBeExecuted() {
		System.out.println("This may or not execute ");
	}
}
