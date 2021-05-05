package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] str = {"hea","heb","hec","hed","hee"};
		//2. print the third element in the array
		System.out.println(str[2]);
		//3. set the third element to a different value
		str[2] = "blah blah blah";
		//4. print the third element again
		System.out.println(str[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		//6. make an array of 50 integers
		int[] arr = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(200);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int currentSmallest = 201;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < currentSmallest) {
				currentSmallest = arr[j];
			}
		}
			
		
		System.out.println(currentSmallest);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//10. print the largest number in the array.
		int currentBiggest = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > currentBiggest) {
				currentBiggest = arr[j];
			}
		}
			System.out.println(currentBiggest);
		}
	}

