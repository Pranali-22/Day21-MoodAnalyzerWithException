/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *  Handle Exception if User Provides null Mood - display message
 */
 
public class MoodAnalyzer {
	String message;
	
	public MoodAnalyzer() {}

	public MoodAnalyzer(String message) {
		this.message = message;
	}
	

	private void validateMessage(String message) throws ExceptionForMoodAnalyser{
		if(message == null) {
			throw new ExceptionForMoodAnalyser("Please enter valid mood");
		}

	}

	//Function to check mood
	public String analyseMood() {	
		try {
			validateMessage(message);
		}
		catch(ExceptionForMoodAnalyser e){
			System.out.println(e.result);
		}
		if(this.message != null  && message.contains("SAD")){
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}

	
}
