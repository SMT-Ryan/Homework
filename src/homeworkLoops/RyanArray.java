package homeworkLoops;

import java.util.Random;

/**
 * <b>Title</B>: RyanArray.java Description: An object that fills an array 
 * with large positive random numbers.  
 * 
 * Copyright: Copyright (c) 2014 Company: Silicon Mountain Technologies
 * @author: Ryan Riker
 * @version 1.0
 * @since 09/10/2014 
 * last update: 09/18/2014
 */

public class RyanArray {
	private int[] startingArray = new int[9];
	private int count = 0;
	private int value = 0;
	
	/**
	 * empty constructor
	 */
	public RyanArray() {
		
	}

	public void dispArray(){
		
do { 
			
			/**
			 * This is the way I came up with to produce random numbers
			 */
			Random randomNumber = new Random();
			value = randomNumber.nextInt(10);
			startingArray[count] = value * -1;
			System.out.println("The number in element " + count + " of the "
					+ "current array is : " + startingArray[count] );
			
			
			count++;
		} while ( count < startingArray.length ); 
		
	}
	
}
