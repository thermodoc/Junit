package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import unit.ArraySort;

class ArraySortTest {

	ArraySort obj = new ArraySort();
	@Test
	void testArrayLargest() {
		//(new int[] {1,3,2}, obj.arraySort(new int[]{1,2,3},3));
		int [] Array1= {3,5,7,8};
		assertArrayEquals(Array1, obj.arraySort(new int[]{8,5,3,7},4));
		
	}


}
