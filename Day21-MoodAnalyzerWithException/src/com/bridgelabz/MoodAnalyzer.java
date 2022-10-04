/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *  Handle Exception if User Provides null Mood
 */
 
public class MoodAnalyzer {
	String message;
	
	public MoodAnalyzer() {}

	public MoodAnalyzer(String message) {
		this.message = message;
	}
	

	private void validateMessage(String message) throws ExceptionForMoodAnalyser{
		if(message == null) {
			throw new ExceptionForMoodAnalyser("HAPPY");			
		}
	}

	//Function to check mood
	public String analyseMood() {	
		try {
			validateMessage(message);
		}
		catch(ExceptionForMoodAnalyser e){
			System.out.println(e.result+" "+e);
		}
		if(this.message != null  && message.contains("SAD")){
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}

	
}
