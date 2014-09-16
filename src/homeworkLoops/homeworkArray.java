package homeworkLoops;

import java.util.Random;

public class homeworkArray {
	private int[] secondArray = new int[9];
	private int count = 0;
	
	//empty constructor
	public homeworkArray() {
		
	}
	
	public void dispArray(){
		
		do { 
			
			//this is the one line solution from the homework, i assume +1 was to remove the zero 
			//option.  abs returns only absolute values so no negative values.
			int randVal = Math.abs(new Random().nextInt()) + 1;
			secondArray[count] = randVal;
			System.out.println("the " + count + " element of the homework array is : " + secondArray[count] );

			count++;
		} while ( count < secondArray.length );
		
	}

}
