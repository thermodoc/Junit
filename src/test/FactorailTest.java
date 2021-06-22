package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import unit.Factorial;

class FactorailTest {

	Factorial obj = new Factorial();
	@Test
	void test() {
		assertEquals(120,obj.factorial(5));
		assertNotEquals(180,obj.factorial(2));
	}

}
