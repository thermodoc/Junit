package test;

import static org.junit.jupiter.api.Assertions.*;
import unit.ArrayLargest;

import org.junit.jupiter.api.Test;

class ArrayLargestTest {
ArrayLargest obj = new ArrayLargest();
	@Test
	void testArrayLargest() {
		assertEquals(3, obj.maxArray(new int[]{1,2,3},3));
		assertEquals(8, obj.maxArray(new int[]{8,5,3,7},4));
		
	}

}
 