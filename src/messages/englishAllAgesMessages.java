package messages;

/**
 * <b>Title</B>: EnglishAllAgesMessages.java Description: An Object that stores
 * all the non-method messages.
 * 
 * Copyright: Copyright (c) 2014 Company: Silicon Mountain Technologies
 * @author: Ryan Riker
 * @version 1.0
 * @since 09/10/2014 
 * last update: 09/18/2014
 */

public class englishAllAgesMessages {
	
	private final String ENG_MESSAGE1 = "The program is now counting up.";
	private final String ENG_MESSAGE2 = "The program is now counting down.";
	private final String ENG_MESSAGE3 = "The program is now displaying even "
			+ "	numbers.";
	private final String ENG_MESSAGE4 = "The program is now displaying odd "
			+ "numbers.";
	private final String ENG_MESSAGE5_1 = "The program is now displaying two "
			+ "array classes. ";
	private final String ENG_MESSAGE5_2 = "The two arrays are filled with "
			+ "random numbers.";
	private final String ENG_MESSAGE5_3 = "The first one will show negitive "
			+ "numbers, and the second positive.";
	private final String ENG_MESSAGE5_4 = "the ryan array is filled with "
			+ "negitive numbers.";
	private final String ENG_MESSAGE6 = "the homework array is filled with "
			+ "positive non zero numbers";
	
	

	/**
	 * empty constructor
	 */
	public englishAllAgesMessages() {
		
	}

	public String messageSelection (String selectString) {
		
		
		switch (selectString.toLowerCase()) {
		case "m1" :
			System.out.println();
			System.out.println(ENG_MESSAGE1);
			System.out.println();
			break;
		case "m2" : 
			System.out.println();
			System.out.println(ENG_MESSAGE2);
			System.out.println();
			break;
		case "m3" : 
			System.out.println();
			System.out.println(ENG_MESSAGE3);
			System.out.println();
			break;
		case "m4" : 
			System.out.println();
			System.out.println(ENG_MESSAGE4);
			System.out.println();
			break;
		case "m5" : 
			System.out.println();
			System.out.println(ENG_MESSAGE5_1);
			System.out.println(ENG_MESSAGE5_2);
			System.out.println(ENG_MESSAGE5_3);
			System.out.println();
			System.out.println(ENG_MESSAGE5_4);
			System.out.println();
			break;
		case "m6" :
			System.out.println();
			System.out.println(ENG_MESSAGE6);
			System.out.println();
		}
		
		
		return selectString;
	}
}
