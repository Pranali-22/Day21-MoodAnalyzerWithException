/**
 * 
 */
package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author Dell
 * Given a Message, ability to analyse and respond Happy or Sad Mood - Create MoodAnalyser Object - Call analyseMood function with message
 */
class MoodAnalyzerTest {

	/**
	 * Test method for {@link com.bridgelabz.MoodAnalyzer#analyzeMood(java.lang.String)}.
	 */
	
	//analyseMood method should just return SAD
	@Test
	void check_if_analyzeMood_returns_sad() {
		String message = "I am in SAD mood";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(message);		
		Assert.assertEquals("SAD",moodAnalyzer.analyseMood());
	}

	//analyseMood method should just return HAPPY
	@Test
	void check_if_analyzeMood_returns_happy() {
		String message = "I am in ANY mood";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(message);
		Assert.assertEquals("HAPPY",moodAnalyzer.analyseMood());
	}

}
