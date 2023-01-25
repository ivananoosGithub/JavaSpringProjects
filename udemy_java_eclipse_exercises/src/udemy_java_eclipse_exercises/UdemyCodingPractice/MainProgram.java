package udemy_java_eclipse_exercises.UdemyCodingPractice;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
//		SortedArray sortArray = new SortedArray();
//		int [] array = sortArray.getIntegers(5);
//		int [] sort_array = sortArray.sortIntegers(array);
//		sortArray.printArray(sort_array);
		
//		int [] size = new int [5];
//		
//		for(int i = 0; i < size.length; i++) {
//			System.out.println("HelloWorld");
//		}
		
		

		System.out.println(getLargestPrime(21));
		isPrime(21);
//		inputThenPrintSumAndAverage();
//		System.out.println(getBucketCount(3.4, 2.1, 1.5));
		
		

		
}
	

	  private static int getLargestPrime (int number){
	        if(number <= 0 || number <= 1)
	            return -1;
	        
	        else{
	        	int largestPrime = 2;
	        	while(largestPrime < number) {
	        		if(number % largestPrime != 0) {
	        			largestPrime++;
	        		}else {
	        			number = number / largestPrime;
	        		}
	        	}
	            return number;
	        }
	    }
	  
	  private static void isPrime(int number) {
		  
		  int[] array = new int [number];
		  int primeStart = 2;
		  
		  boolean flag = false;
		  for(int i = 2; i <= number; i++) {
			  
			  if(number % i != 0) {
				  flag = true;
			  }
			  else
				  flag = false;
				  array[i-2] = i;
				  
		  }
		  System.out.print("Array: ");
		  for (int i = 0; i < array.length; i++) {
			  System.out.print(" "+array[i]);
		  }

	  }
	  
	    private static void inputThenPrintSumAndAverage (){
	        
	        Scanner user_input = new Scanner (System.in);
	        
	        int sum = 0;
	        int counter = 0;
	        double avg = 0;
	        
	        
	        
	        while(true){
	        	
	        	boolean user_input_int = user_input.hasNextInt();
	        	
	            if (user_input_int) {
	            	int input = user_input.nextInt();
		            sum = sum + input;
		            counter++;
	            }
	            else
	            {
	            	
	            	avg = (double) sum / counter;
	     	        System.out.print("SUM = "+sum+ " AVG = "+Math.round(avg));
	     	        break;
	            }
	        }
	        user_input.close();
	    }
	  
//	  public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
//		  
//		  if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
//			  return -1;
//		  else {
//			  
//			  double area =    Math.ceil(width * height / areaPerBucket);
//			  int results = (int) Math.ceil(area) - extraBuckets;
//
//			  return results;
//		  }
//	  }
//	  
//	  public static int getBucketCount (double width, double height, double areaPerBucket) {
//		  
//		  if(width <= 0 || height <= 0 || areaPerBucket <= 0)
//			  return -1;
//		  else {
//			  
//			  double area =    Math.ceil(width * height / areaPerBucket);
//			  int results = (int) Math.ceil(area);
//
//			  return results;
//		  }
//	  }
//	  
//
//	  public static int getBucketCount (double area , double areaPerBucket) {
//		  
//		  if(area <= 0 || areaPerBucket <= 0)
//			  return -1;
//		  else {
//			  
//			  double area_results = Math.ceil(area / areaPerBucket );
//			  int results = (int) Math.ceil(area_results);
//
//			  return results;
//		  }
//	  }

}



