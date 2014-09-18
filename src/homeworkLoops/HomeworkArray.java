package homeworkLoops;

/**
 * <b>Title</B>: HomeworkArray.java Description: An object that fills an array 
 * with large positive random numbers.  
 * 
 * Copyright: Copyright (c) 2014 Company: Silicon Mountain Technologies
 * @author: Ryan Riker
 * @version 1.0
 * @since 09/10/2014 
 * last update: 09/18/2014
 */

import java.util.Random;

public class HomeworkArray {
	private int[] secondArray = new int[9];
	private int count = 0;
	
	/**
	 * Empty constructor
	 */
	public HomeworkArray() {
		
	}
	
	public void dispArray(){
		
		do { 
			
			/**
			 * This is the one line function copied from the homework, I assume 
			 * +1 was to remove the zero option.  abs returns only absolute 
			 * values so no negative values.
			 */
			int randVal = Math.abs(new Random().nextInt()) + 1;
			secondArray[count] = randVal;
			System.out.println("The number in element " + count + " of the "
					+ "current array is : " + secondArray[count] );

			count++;
		} while ( count < secondArray.length );
		
	}

}
