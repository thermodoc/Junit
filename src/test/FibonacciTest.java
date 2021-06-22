package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import unit.Fibonacci;

class FibonacciTest {
Fibonacci obj=new Fibonacci();
	@Test
	void fibonacciTest() {
		assertArrayEquals(new int[] {1}, Fibonacci.fibonacci(1));
		assertArrayEquals(new int[] {0,1,1,2,3}, Fibonacci.fibonacci(5));
	}

}
