/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *  Given a Message, ability to analyse and respond Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message
 */
 
public class MoodAnalyzer {
	String message;
	
	public MoodAnalyzer() {}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	//Function to check mood
	public String analyseMood() {		
		if(this.message.contains("SAD")){
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
	
}
