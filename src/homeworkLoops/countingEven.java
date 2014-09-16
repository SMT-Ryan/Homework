package homeworkLoops;

public class countingEven   {

	private int count;
	private int value;
	
	//empty constructor
	public countingEven() {
		
	}

	public int Count(){
	
	while (count <= 20) {
		value = count;
		if(value % 2 == 0) {
			System.out.println(count + ": is an even number between 0 and 20.");
		}
		
	count++;
	} 
	return value;
	}
	
}
