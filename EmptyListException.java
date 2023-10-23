//Package
package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

/**
 *
 * Filename: EmptyListException.java
 * Course: ENSF 409
 * Description:
 *--- --- --- --- --- --- --- --- --- --- --- --- ---
 * @author Group 69
 * @version 1.0
 * @since 1.0
 *
 */
@SuppressWarnings("serial")
public class EmptyListException extends Exception {
	
	public EmptyListException() {
		super("List cannot be empty. Please try again.");
	}
	
}   //EmptyListException