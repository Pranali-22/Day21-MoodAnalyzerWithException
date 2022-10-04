/**
 * 
 */
package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author Dell
 * Handle Exception if User Provides null Mood - display message
 * 
 */
class MoodAnalyzerTest {

	/**
	 * Test method for {@link com.bridgelabz.MoodAnalyzer#analyzeMood(java.lang.String)}.
	 */
	
	//analyseMood method should just return SAD
	@Test
	void check_if_analyzeMood_returns_sad() {
		String message="I am in SAD mood";
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(message);		
		Assert.assertEquals("SAD",moodAnalyzer.analyseMood());
	}

	//analyseMood method should just return HAPPY
	@Test
	void check_if_analyzeMood_returns_happy() {
		String message = null;
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(message);
		Assert.assertEquals("HAPPY",moodAnalyzer.analyseMood());
	}

}
