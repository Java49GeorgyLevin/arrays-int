package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static telran.arrays.MyArraysInt.*;

class MyArraysIntTests {

	@Test
	void testAddNumber() {
		int array[] = {1, 2, 3};
		int expected1[] = {1, 2, 3, 4};
		int expected2[] = {1, 2, 3, 0};
		assertArrayEquals(expected1, addNumber(array, 4));
		assertArrayEquals(expected2, addNumber(array, 0));
	}

	@Test
	void testRemoveNumber() {
		int array[] = {1, 2, 3, 4};
		int expected1[] = {1, 2, 3, 4};
		int expected2[] = {1, 3, 4};
		int expected3[] = {2, 3, 4};
		assertArrayEquals(expected1, removeNumber(array, 4));
		assertArrayEquals(expected1, removeNumber(array, -1));
		assertArrayEquals(expected2, removeNumber(array, 1));
		assertArrayEquals(expected3, removeNumber(array, 0));
	}

	@Test
	void testInsertNumber() {
		int array[] = {1, 2, 3};
		int expected1[] = {1, 2, 3};
		int expected2[] = {1, 2, 3, 4};
		int expected3[] = {4, 1, 2, 3};
		assertArrayEquals(expected1, insertNumber(array, -1, 4));
		assertArrayEquals(expected2, insertNumber(array, 3, 4));
		assertArrayEquals(expected3, insertNumber(array, 0, 4));
	}
	
	@Test
	void testCopyOf() {
		int array[] = {1, 2, 3};
		int expected1[] = {1, 2, 3};
		int expected2[] = {1};
		int expected3[] = {1, 2, 3, 0, 0, 0};
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}
	
	@Test
	void testArraycopy() {
		int array[] = {1, 2, 3};
		int expected[] = {5, 10, 1, 2, 20};
		int arrayDest[] = new int[5];
		int array1[] = {1, 5, 10};
		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);
		arrayDest[4] = 20;
		assertArrayEquals(expected, arrayDest);
	}
	@Test
	void testBinarySearchInt() {
		int array1[] = {1, 2, 3, 4};
		int array2[] = {3, 5, 10, 1, 2, 20};
		Arrays.sort(array2);
		int array3[] = {5, 10, 1, 2, 20};
		Arrays.sort(array3);
		assertEquals(-5, Arrays.binarySearch(array1, 10));
		assertEquals(4, Arrays.binarySearch(array2, 10));
		assertEquals(3, Arrays.binarySearch(array3, 10));
		//Write tests for method binarySearch of the class Arrays taking array of int
		//and int number
	}
}