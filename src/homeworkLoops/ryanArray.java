package homeworkLoops;

import java.util.Random;

public class ryanArray {
	private int[] startingArray = new int[9];
	private int count = 0;
	private int value = 0;
	
	//empty constructor
	public ryanArray() {
		
	}

	public void dispArray(){
		
do { 
			
			//this is the way i came up with to produce random numbers
			Random randomNumber = new Random();
			value = randomNumber.nextInt(10);
			startingArray[count] = value * -1;
			System.out.println("the number in slot " + count + " of the Ryan array is : " + startingArray[count] );
			
			
			count++;
		} while ( count < startingArray.length ); 
		
	}
	
}
