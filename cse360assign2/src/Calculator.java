package cse360assign3;

 /** Calculator Program
 * @author Nabeel Asif
 * @version February 16, 2019
 */

public class Calculator {
	
	private int total;
	private String output = "0";
	
	/**
	 * Create a Calculator object and set to total value to 0
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * When you call this function the total will be returned.
	 * Right now it will just return 0.
	 * @return
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * add will simply add the value that is inputed in the method signature
	 * @param value - the value to be added
	 */
	public void add (int value) {
		total = total + value;
		output = output + " + " + value;
	}
	
	/**
	 * subtract will simply subtract the value that is inputed in the method signature
	 * @param value - the value to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
		output = output + " - " + value;
	}
	
	/**
	 * multiply will simply multiply the value that is inputed in the method signature.
	 * @param value - the value to be multiplied
	 */
	public void multiply (int value) {
		total = total * value;

		output = output + " x " + value;
         }
	
	/**
	 * divide will simply divide the value that is inputed in the method signature.
	 * @param value - the value to be divided
	 */
	public void divide (int value) {
		if (value != 0) {
			total = (int) Math.floor(total / value);
		}
		else {
			total = 0;
		}
		output = output + " / " + value;
	}
	
	/**
	 * getHistory will return the calculation history that was done previously.
	 * @return will return the calculation history.
	 */
	public String getHistory () {
		return output;
	}

}