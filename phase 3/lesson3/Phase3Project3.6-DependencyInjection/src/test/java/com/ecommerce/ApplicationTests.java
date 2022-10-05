package com.ecommerce;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;


@DisplayName("JUnit 5 Dependency Injection Example")
@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	public void DependencyInjectionDemo(TestInfo info) {
		System.out.println(info.getDisplayName());
	}
	
	@Test
	@DisplayName("My Method")
	public void myTest(TestInfo info) {

		assertEquals("My Method", info.getDisplayName());
	}

	@Test
	@DisplayName("My Method")
	@Tag("mytag")
	public void myTest1(TestInfo info) {
		
		assertEquals("My Method", info.getDisplayName());
		assertTrue(info.getTags().contains("mytag"));
		System.out.println(info.getTags());
		System.out.println(info.getDisplayName());
	}
}