package assignment3;

import java.util.Arrays;

public class Assignment3 {
	public static void main(String[] args) {
		
		//
		//Java weeks 3-4 coding assignment
		//
		
		//     1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int ages[] = {3,9,23,64,2,8,28,93};
		
        //			a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] 
		//				in your code). Print the result to the console.  
		System.out.println(ages[ages.length-1]-ages[0]);
		
        //			b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		ages[7] = 39;
		System.out.println(ages[ages.length-1]-ages[0]);
		
        //			c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		float sum1 = 0;
		for (int i =0;i<ages.length;i++) {
			sum1 += ages[i];
		}
		System.out.println("average = " +sum1/ages.length);
		
		
        
		//		2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//			a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		float sum2 = 0;
		for (int i = 0; i<names.length;i++) {
			sum2 += names[i].length();
		}
		System.out.println("average name length: " +sum2/names.length);
		
		//			b. Use a loop to iterate through the array again and concatenate all the names together,
		//				separated by spaces, and print the result to the console.
		String concNames = "";
		for (int i = 0; i<names.length; i++) {
			concNames += names[i]+ " ";
		}
		System.out.println(concNames);
		
		
        
		//3. How do you access the last element of any array?
			//		arrayName[array.length – 1]  ← this accesses the last element in an array.
		
		
		//4. How do you access the first element of any array?
			//		arrayName[0] ← this accesses the first element in an array.
		
		
	     
	    //5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created
		//		names array and add the length of each name to the nameLengths array.
		int nameLengths[];
		nameLengths = new int [names.length];
		for (int i = 0;i<names.length;i++) {
			nameLengths[i] = names[i].length();
		}
		
	    //6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sum6 = 0;
		for (int i = 0; i<nameLengths.length;i++) {
			sum6 += nameLengths[i];
		}
		System.out.println("Sum for problem 6 is: "+sum6);
		
	    //7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
		//		(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		String word = "Hello";
		int n = 5;
		System.out.println(repeatWord(word,n));
		
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		String firstName = "Brenda";
		String lastName = "Sanchez";
		System.out.println(fullName(firstName,lastName));
		
		
	    //9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		int num9[] = {23,2,14,18,7,35};
		System.out.println(moreThan100(num9));
		
		
	    //10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double num10[] = {23.5,45.2,30,38.6,1};
		System.out.println(average(num10));
		
		
	    //11. Write a method that takes two arrays of double and returns true if the average of the elements
		//     in the first array is greater than the average of the elements in the second array.
		double num11[] = {35.4,68.2,50,3,2,1};
		System.out.println(avg11GreaterThan10(num11,num10));
		
		
	    //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
		//     and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 20.00;
		System.out.println(amIRichAndWarm(isHotOutside,moneyInPocket));
		
		
	    //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		String day = "Today";
		String day2 = "Yesterday";
		String day3 = "Tomorrow";
		System.out.println(whatDay(day));
		System.out.println(whatDay(day2));
		System.out.println(whatDay(day3));
		// this method takes a day and changes the string in it to a longer statement saying what day it is.
		// I made this to try sending different parameters to the same method.
		
		
		
		
	}
	
	// method 7
	static String repeatWord(String word, int n) {
		String repeated = "";
		for (int i = 0; i<n;i++) {
			repeated += word;
		}
		return repeated;
	}
	
	// method 8
	static String fullName(String firstName,String lastName) {
		String fullName = firstName +" "+ lastName;
		return fullName;
	}
	
	// method 9
	static boolean moreThan100(int num[]) {
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		//System.out.println(sum);
		if (sum>100)
			return true;
		else
			return false;
	}
	
	// method 10
	static double average(double num[]) {
		double sum = 0;
		for (double i : num) {
			sum += i;
		}
		return sum/num.length;
	}
	
	// method 11
	static boolean avg11GreaterThan10(double num1[],double num2[]) {
		System.out.println(average(num1));
		//System.out.println(average(num2));
		if (average(num1)>average(num2))
			return true;
		else
			return false;
	}
	
	// method 12
	static boolean amIRichAndWarm(boolean hot,double cash) {
		if (hot && cash > 10.50)
			return true;
		else
			return false;
	}
	// method 13
	static String whatDay(String day) {
		day = "It is "+day+".";
		return day;
	}
	

}
