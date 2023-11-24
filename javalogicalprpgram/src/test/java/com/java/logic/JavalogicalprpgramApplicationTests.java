package com.java.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.java.logic.basic.PrimeNumber;

@SpringBootTest
class JavalogicalprpgramApplicationTests {
	

	@Test
	void isPrimeNum() {
		int ans = PrimeNumber.isPrimeNum(10);
		assertEquals(0, ans);
	}
	
	@Test
	void isPrimeWithJava8() {
		assertEquals(false,PrimeNumber.isPrimeNumJava8(11));
	}

}
