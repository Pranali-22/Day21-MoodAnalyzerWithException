/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class ExceptionForMoodAnalyser extends Exception{
	String result;

	public ExceptionForMoodAnalyser(String result) {
		super();
		this.result = result;
	}
}
