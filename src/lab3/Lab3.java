//
//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject: Arrays & Methods
//Java Week 03 Lab
//
package lab3;

import java.util.Arrays;

public class Lab3 {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int arr[] = {1,5,2,8,13,6};

		
		// 2. Print out the first element in the array
		System.out.println("First element: "+arr[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println("Last element: "+arr[arr.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(arr[6]);
										// *******throws an exception -- position 6 is out of bounds
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(arr[-1]);
			                            // *******also throws an exception for the same reason
		
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i =0; i<arr.length;i++) {
			System.out.println("Traditional loop: "+arr[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int i : arr) {
			System.out.println("Enhanced loop: "+i);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum =0;
		for (int i =0; i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("Sum: "+sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
		float sumF = sum;
		float average = sumF/arr.length;
		System.out.println("Average: "+average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int i : arr) {
			if (i%2==1)
			System.out.println("Enhanced odd: "+i);
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String names[] = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		int sumLetters = 0;
		for (int i=0; i < names.length; i++) {
			sumLetters += names[i].length();
		}
		System.out.println("Number of letters: "+sumLetters);		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greetingTest();
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		String greeting = null;
		greeting = greetingGet(greeting);
		System.out.println(greeting);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		String longWord = "invariably";
		int smallNum = 90;
		System.out.println("The word \""+longWord+"\" is longer than the number \""+smallNum+"\"? "+wordIsLonger(longWord,smallNum));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		String buddy = "buddy";
		String arrB[]= {"sandy","buddy","loch","sweeny"};
		System.out.println("The array contains the word, \"buddy\". "+containsBuddy(buddy,arrB));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int numbers17[] = {1234,432,534,34,234,45,2345};
		System.out.println("The smallest number is "+returnSmallest(numbers17)+".");
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double dubArr[] = {12.65,35.456,12,34.1,12345.3,100};
		System.out.println("The average of these doubles is "+returnAverage(dubArr)+".");

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		String arr19[] = {"bread","soup","nuts","oranges","sausages","butterscotch ice cream pops"};
		System.out.println("The length of the words for prob 19 are as follows:");
		int int19[]=stringToInt(arr19);
		for (int i : int19) {
			System.out.println(i);
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		String arr20[] = {"l;kasjdf","asdfpoi","Dsjdjfnfngnen","sd","sdfjd","a"};
		System.out.println("Even string items had more letters total? "+evensAreGreater(arr20));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		String pal1 = "racecar";
		String pal2 = "sandy cheeks";
		String pal3 = "palindrome emordnilap";
		System.out.println(pal1+" is a palindrome? " +isPalindrome(pal1));
		System.out.println(pal2+" is a palindrome? " +isPalindrome(pal2));
		System.out.println(pal3+" is a palindrome? " +isPalindrome(pal3));
		
		
	}
	

	
	// Method 13:
	static void greetingTest() {
		System.out.println("Greetings.");
	}

	// Method 14:
	static String greetingGet(String greeting) {
		greeting = "Greetings, friend.";
		return greeting;
	}
	
	// Method 15:
	static boolean wordIsLonger(String longWord,int smallNum) {
		if (longWord.length()> smallNum) {
			return true;
		}
		else {
		return false;
		}
	}
	
	// Method 16:
	static boolean containsBuddy(String buddy,String arrB[]) {
		for (int i = 0;i < arrB.length;i++) {
			if (arrB[i] == buddy) {
				return true;
			}
		}
		return false;
	}
	
	// Method 17:
	static int returnSmallest(int numbers17[]) {
		Arrays.sort(numbers17);
		return numbers17[0];
	}
	
	// Method 18:
	static double returnAverage(double dubArr[]) {
		double average = 0.0;
		double sum = 0.0;
		double length = dubArr.length;
		for (double i : dubArr) {
			sum += i;
		}
		average = sum/length;
		return average;
	}
	
	// Method 19:
	static int[] stringToInt(String arr19[]) {
		int length[] = new int[arr19.length];
		for (int i = 0;i<arr19.length;i++) {
			length[i] = arr19[i].length();
		}
		return length;
	}
	
	// Method 20:
	static boolean evensAreGreater(String arr20[]) {
		int evens = 0;
		int odds = 0;
		for (int i = 0; i <arr20.length;i++) {
			if (arr20[i].length()%2 == 0) {
				evens += arr20[i].length();
			}
			else {
				odds += arr20[i].length(); 
			}
		}
		System.out.println("evens total: "+evens);
		System.out.println("odds total: "+odds);
		if (evens>odds) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Method 21:
	static boolean isPalindrome(String pal) {
		int length = pal.length();
		for (int i = 0; i < length/2;i++) {
			if (pal.charAt(i)!=pal.charAt(length-1-i)){
				return false;	
			}
		}
		return true;
	}

}


















