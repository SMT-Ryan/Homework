package homeworkLoops;
/**
 * <b>Title</B>: Counter.java Description: A counter object set to count based
 * incoming variables.
 * 
 * Copyright: Copyright (c) 2014 Company: Silicon Mountain Technologies
 * @author: Ryan Riker
 * @version 1.0
 * @since 09/10/2014 
 * last update: 09/18/2014
 */
public class Counter {
private int count = 0;
	
	public Counter() {
		
	}

	public void count( int startingValue, int target, int increment) {
		
		if(increment > 0 ){
		
			for(count = startingValue; count <= target; count = count + increment) {
			
				/**
				 * outputs the value of the count to the display.
				 */
				System.out.println("The count is  ... : " + count);
			
			}
				
		}else if (increment == 0 ) {
			System.out.println("A loop incremented by zero will loop infinity");
		}
			
		while (count > target){
			
			for(count = startingValue; count >= target; count = count + increment) {
				
				/**
				 * outputs the value of the count to the display.
				 */
				System.out.println("The count is  ... : " + count);
			


	
			}
		
			
			
		}
			
			
			
	}
}

