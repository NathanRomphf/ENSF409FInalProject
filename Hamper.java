// --Package --
package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

/**
 *
 * Filename: Hamper.java
 * Course: ENSF 409
 * Description:
 * "Insert basic description here"
 *--- --- --- --- --- --- --- --- --- --- --- --- ---
 * @author Group 69
 * @version 1.0
 * @since 1.0
 *
 */


// -- Imports --
import java.util.*;

// -- Class --
public class Hamper {

	// -- Member Variables --
	private ArrayList<FoodItem> foodList;
	private int totalGrain;
	private int totalFruitsVeggies;
	private int totalProtein;
	private int totalOther;
	private int totalCalories;

    // -- Constructor --
	public Hamper(Family family) {
		this.foodList = new ArrayList<FoodItem>();
		this.totalGrain = 0;
		this.totalFruitsVeggies = 0;
		this.totalProtein = 0;
		this.totalOther = 0;
		this.totalCalories = 0;
	}	//Constructor

	// getter
	public ArrayList<FoodItem> getFoodList() {
		return this.foodList;
	}	//getFoodList

	// adds an item to foodList along with nutritional information to hamper
	public void addToList(FoodItem item) {
		foodList.add(item);
		totalGrain = getTotalGrain() + item.getGrainContent()/100 * item.getCalories();
		totalFruitsVeggies = getTotalFruitsVeggies() + item.getFVContent()/100 * item.getCalories();
		totalProtein = getTotalProtein() + item.getProContent()/100 * item.getCalories();
		totalOther = getTotalOther() + item.getOtherContent()/100 * item.getCalories();
		totalCalories = getTotalCalories() + item.getCalories();
	}	//addToList

	// removes an item from the foodList and returns that item
	// removes most recently added item might need to be changed
	// depending on how we implememnt the foodCalculator in HamperMenu
	public FoodItem removeFromList() throws EmptyListException {
		try {
			FoodItem item = foodList.get(foodList.size() - 1);
			foodList.remove(foodList.size() - 1);
			totalGrain = getTotalGrain() - item.getGrainContent()/100 * item.getCalories();
			totalFruitsVeggies = getTotalFruitsVeggies() - item.getFVContent()/100 * item.getCalories();
			totalProtein = getTotalProtein() - item.getProContent()/100 * item.getCalories();
			totalOther = getTotalOther() - item.getOtherContent()/100 * item.getCalories();
			totalCalories = getTotalCalories() - item.getCalories();
			return item;
		} catch (IndexOutOfBoundsException e) {
			throw new EmptyListException();
		}
	}	//removeFromList

	// removes all items from the foodList
	public void clearList() {
		foodList.clear();
	}	//clearList

	// returns true if foodList is empty
	public boolean isEmpty() {
		return foodList.size() == 0;
	}	//isEmpty

	public int getTotalGrain() {
		return totalGrain;
	}

	public int getTotalFruitsVeggies() {
		return totalFruitsVeggies;
	}

	public int getTotalProtein() {
		return totalProtein;
	}

	public int getTotalOther() {
		return totalOther;
	}

	public int getTotalCalories() {
		return totalCalories;
	}
}	//Hamper
