//Package
package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

/**
 *
 * Filename: FoodItemNotFoundException.java
 * Course: ENSF 409
 * Description:
 *--- --- --- --- --- --- --- --- --- --- --- --- ---
 * @author Group 69
 * @version 1.0
 * @since 1.0
 *
 */
@SuppressWarnings("serial")
public class FoodItemNotFoundException extends Exception {
	
	public FoodItemNotFoundException() {
		super("FoodItem has invalid name / is not present in list of items.");
	}
	
}   //FoodItemNotFoundException