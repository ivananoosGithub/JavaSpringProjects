package udemy_java_eclipse_exercises.UdemyCodingPractice;

import java.util.Scanner;

public class SortedArray {
	
	
	public static int [] getIntegers (int size) {
		Scanner user_input = new Scanner(System.in);
		int [] array = new int [size];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Enter integer [" +(i+1)+ "]: ");
			array [i] = user_input.nextInt();
		}
		
		user_input.close();
		
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Element "+i+" contents "+array[i]);
		}
	}
	
	public static int [] sortIntegers (int[] array) {
		int [] sorted_array = new int [array.length];
		
		for (int i = 0; i < array.length; i++) {
			sorted_array[i] = array[i];
		}
		
		boolean flag = true;
		int temp;
		
		while(flag) {
			flag = false;
			for(int i = 0; i < sorted_array.length-1; i++) {
				if(sorted_array[i] < sorted_array[i+1]) {
					temp = sorted_array[i];
					sorted_array[i] = sorted_array[i+1];
					sorted_array[i+1] = temp;
					flag = true;
				}
			}
		}
		return sorted_array;
	}

}
