package telran.arrays;

import java.util.Arrays;

public class MyArraysInt {
	public static int [] addNumber(int[] array, int num) {
		int arrayAdd[] = Arrays.copyOf(array, array.length + 1);
		arrayAdd[arrayAdd.length-1] = num;
		//adds num at the array's end
		//returns new array with added number
		//using standard method Arrays.copyOf
		return arrayAdd;		
	}
	public static int [] removeNumber(int [] array, int index) {
		int arrayRemove[] = new int[array.length-1];
		if(index < 0 || index > array.length-1) {
			return array;
		} else {
			System.arraycopy(array, 0, arrayRemove, 0, index);
			System.arraycopy(array, index+1, arrayRemove, index, arrayRemove.length-index);
		}
		//removes element at given index for right index value [0 - array.length-1]
		//and returns new array without that element
		//returns the source array for a wrong index value (less than 0
		//or greater array.length-1)
		//using standard method System.arraycopy
		return arrayRemove;
	}
	public static int [] insertNumber(int [] array, int index, int num) {
		int arrayInsert[] = new int[array.length+1];
		if(index < 0 || index > array.length) {
			return array;			
		} else {
			System.arraycopy(array, 0, arrayInsert, 0, index);
			arrayInsert[index] = num;
			System.arraycopy(array, index, arrayInsert, index+1, array.length-index);
		}

		//inserts  a given num at a given index for right value of the index [0 - array.length]
		//and returns new array with added number
		//returns the source array for a wrong index value (less than 0, 
		//or greater than array.length)
		//using standard method System.arraycopy
		return arrayInsert;
	}

}
