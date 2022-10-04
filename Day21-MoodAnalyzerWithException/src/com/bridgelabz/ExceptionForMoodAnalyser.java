/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *  Handle Exception if User Provides null Mood - display message
 */
public class ExceptionForMoodAnalyser extends Exception{
	String result;

	public ExceptionForMoodAnalyser(String result) {
		super();
		this.result = result;
	}
}
