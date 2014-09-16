package homeworkLoops;

public class countingDown {

	//Variables used
	private int count = 10;
	private int value = 10;
	
	//empty constructor
	public countingDown() {
		
	}

	public int Count() {
		
		/*counting down via for loop*/
		for(count = 10; count >= 0; count--) {
			
			value = count;
			
			//output
			System.out.println("The count is  ... : " + value);
			
		}
			return value;
	}
	
}
