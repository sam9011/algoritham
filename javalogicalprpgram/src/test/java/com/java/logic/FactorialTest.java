package com.java.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.java.logic.basic.Factorial;

@SpringBootTest
public class FactorialTest {
	
	@Autowired
	private Factorial factorial;

	@Test
	public void factorial() {
		var num = factorial.factorialNumWithJava8(4);
		assertEquals(24, num);
	}
}
