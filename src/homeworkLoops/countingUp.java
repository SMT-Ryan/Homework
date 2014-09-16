package homeworkLoops;

public class countingUp {

	//Variables used
	private int count = 1;
	private int value = 1;

	//constructor an empty constructor
	public countingUp() {
			
		}
	
	public static void main(String[] args) {
		countingUp count = new countingUp();
		
		count.countOddUp(1,10);
	}
	
	public int countOddUp(int start, int end) {
		if (start % 2 == 0) start++;
		return Count(start, end, 2);
	}
	
	public int countOddDown(int start, int end) {
		if (start % 2 == 0) start++;
		return Count(start, end, -2);
	}
	
	public int countEvenUp(int start, int end) {
		if (start % 2 == 1) start++;
		return Count(start, end, 2);
	}
	
	/**
	 * Main counter method.  Takles inputs and perfroms proper loop
	 * @param start start of the loop.  Ensure that if counting down, this value
	 * is greater than the end.  Otherwise, it should be smaller
	 * @param end End of the loop.  Should correspond relative to start based upon direction
	 * @param interval number of items to skip
	 * @return 0 if fine.  -1 if loop fails
	 */
	public int Count(int start, int end, int interval) {
	
		for(int i = start; start < end; i += interval) {
			System.out.println("the count is ... : " + i );
		}
		
		return 0;
	}
	
	//count method
	public int Count() {
		/*counting up via while loop*/
		while (count <= 10){
			
			value = count;
			count++;
			
			//output
			System.out.println("the count is ... : " + value );
			
		}
			return value;
	}
	
}
