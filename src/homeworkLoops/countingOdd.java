package homeworkLoops;

public class countingOdd {

	private int count;
	private int value;
	
	//empty constructor
	public countingOdd() {
		
	}

	public int Count(){
	
	while (count <= 20) {
		value = count;
		if(value % 2 != 0) {
			System.out.println(count + ": is an odd number between 0 and 20.");
		}
		
	count++;
	} 
	return value;
	}

}
