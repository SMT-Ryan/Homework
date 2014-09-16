package homeworkEnvironment;

import homeworkLoops.countingDown;
import homeworkLoops.countingEven;
import homeworkLoops.countingOdd;
import homeworkLoops.countingUp;
import homeworkLoops.homeworkArray;
import homeworkLoops.ryanArray;

/********************************************************************************
 * <b>Title</B>: LoopCounter.java Description: The location of code that uses
 * several types of loops to count. part of the programming 1 class assignments.
 * Copyright: Copyright (c) 2014 Company: Silicon Mountain Technologies
 *
 * @author: Ryan Riker
 * @version 1.0
 * @since 09/10/2014 last update: never
 ********************************************************************************/
public class LoopCounter {
	public static void main(String[] args) {
		
		LoopCounter lc = new LoopCounter();
		lc.process();
		
	}
	
	public void process() {

		messages.englishAllAgesMessages message = new messages.englishAllAgesMessages();

		message.messageSelection("m1");

		// old code left in to show changes
		/*
		 * int count = 1; int value = 1;
		 */

		// open a new countingUp instance
		countingUp testCountingUp = new countingUp();

		// call count method
		testCountingUp.Count();

		message.messageSelection("m2");

		// open a new countingDown instance

		countingDown testCountingDown = new countingDown();

		// call count method
		testCountingDown.Count();

		// below is the old code, i left in as an example of what i replaced.

		/*
		 * error checking if(count != 10) { count = 10; }else{
		 * System.out.println("error: if statement failure."); }
		 * 
		 * /*counting down via for loop for(count = 10; count >= 0; count--) {
		 * System.out.println("The count is " + count); }
		 */

		message.messageSelection("m3");

		// open a new countingEven instance
		countingEven testCountingEven = new countingEven();

		// call count method
		testCountingEven.Count();

		message.messageSelection("m4");

		// open a new countingEven instance
		countingOdd testCountingOdd = new countingOdd();

		// call count method
		testCountingOdd.Count();

		/*
		 * error checking if(count != 1) { count = 1; }else{
		 * System.out.println("error: if statement falure."); }
		 * 
		 * /*using the % operator to sort out even numbers while (count <= 20) {
		 * value = count; if(value % 2 == 0) { System.out.println(count +
		 * " is an even number between 0 and 20."); }
		 * 
		 * count++; }
		 */

		message.messageSelection("m5");

		// open a new countingEven instance
		ryanArray testArray = new ryanArray();

		// call count method
		testArray.dispArray();

		message.messageSelection("m6");

		// open a new countingEven instance
		homeworkArray secondTestArray = new homeworkArray();

		// call count method
		secondTestArray.dispArray();

		/*
		 * //if statement resetting the counter if (count != 0) {
		 * System.out.println("count reset to 0"); count = 0; }else {
		 * System.out.println("count already at 0"); }
		 * 
		 * //if statement resetting the value if (value != 0) {
		 * System.out.println("value reset to 0"); value = 0; }else {
		 * System.out.println("value already at 0"); }
		 * 
		 * int[] startingArray = new int[9]; int[] secondArray = new int[9];
		 * 
		 * do {
		 * 
		 * //this is the way i came up with to produce random numbers Random
		 * randomNumber = new Random(); value = randomNumber.nextInt(10);
		 * startingArray[count] = value * -1;
		 * 
		 * //this is the one line solution from the homework, i assume +1 was to
		 * remove the zero //option. abs returns only absolute values so no
		 * negative values. int randVal = Math.abs(new Random().nextInt()) + 1;
		 * secondArray[count] = randVal;
		 * System.out.println("the other way of doing random numbers is " +
		 * secondArray[count] ); System.out.println("the number in slot " +
		 * count + " of the array is : " + startingArray[count] );
		 * 
		 * count++; } while ( count < startingArray.length );
		 */

	}

}
