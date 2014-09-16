package messages;

public class englishAllAgesMessages {
	
	private final String ENG_MESSAGE1 = "now counting up with a while loop.";
	private final String ENG_MESSAGE2 = "now counting down with a for loop.";
	private final String ENG_MESSAGE3 = "now displaying even numbers between 1-20.";
	private final String ENG_MESSAGE4 = "now displaying odd numbers between 1-20.";
	private final String ENG_MESSAGE5_1 = "now displaying two array classes, one filled with ";
	private final String ENG_MESSAGE5_2 = "random numbers they way i came up with, and one";
	private final String ENG_MESSAGE5_3 = "directly from the assignment";
	private final String ENG_MESSAGE5_4 = "the ryan array is filled with negitive numbers between-10 and 0";
	private final String ENG_MESSAGE6 = "the homework array is filled with positive non zero numbers";
	
	

	//empty constructor
	public englishAllAgesMessages() {
		
	}

	public String messageSelection (String selectString) {
		
		
		switch (selectString.toLowerCase()) {
		case "m1" : 
			System.out.println(ENG_MESSAGE1);
			break;
		case "m2" : 
			System.out.println(ENG_MESSAGE2);
			break;
		case "m3" : 
			System.out.println(ENG_MESSAGE3);
			break;
		case "m4" : 
			System.out.println(ENG_MESSAGE4);
			break;
		case "m5" : 
			System.out.println(ENG_MESSAGE5_1);
			System.out.println(ENG_MESSAGE5_2);
			System.out.println(ENG_MESSAGE5_3);
			System.out.println();
			System.out.println(ENG_MESSAGE5_4);
			break;
		case "m6" :
			System.out.println(ENG_MESSAGE6);
		}
		
		
		return selectString;
	}
}
