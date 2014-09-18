package homeworkEnvironment;




import homeworkLoops.Counter;
import homeworkLoops.homeworkArray;
import homeworkLoops.ryanArray;

/*******************************************************************************
 * <b>Title</B>: LoopCounter.java Description: The location of code that uses
 * several types of loops to count. part of the programming 1 class assignments.
 * Copyright: Copyright (c) 2014 Company: Silicon Mountain Technologies
 *
 * @author: Ryan Riker
 * @version 1.0
 * @since 09/10/2014 last update: never
 ******************************************************************************/

public class LoopCounter {
	public static void main(String[] args) {
		
		LoopCounter lc = new LoopCounter();
		lc.process();
		
	}
	
	/**
	 * The process method calls the counter class and counts up and down by 
	 * even or odd numbers. displays the out put.
	 */
	
	public void process() {

		int value = 0;
		int target = 0;
		int increment = 0;
		
		messages.englishAllAgesMessages message = new messages.englishAllAgesMessages();

		message.messageSelection("m1");

		/**
		 * using the counter object to count up
		 */
		Counter counterLoop = new Counter();
		
		value = 0;
		target = 12;
		increment = 1;
		counterLoop.count(value, target, increment);

		message.messageSelection("m2");

		
		/**
		 * using same loop to count down
		 *
		 */
		value = 0;
		target = -15;
		increment = -1;
		counterLoop.count(value, target, increment);
		
		message.messageSelection("m3");
		
		/**
		 * using the same object to count even numbers
		 */
		
		value = 0;
		target = 36;
		increment = 2;
		counterLoop.count(value, target, increment);

		message.messageSelection("m4");

		/**
		 * using the same object to count odd numbers
		 */
		value = 1;
		target = 35;
		increment = 2;
		counterLoop.count(value, target, increment);

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

	}

}
