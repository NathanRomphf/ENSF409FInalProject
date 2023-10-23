package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

// class used to represent each individual food item that could be added
// to a hamper. Every variable is final so no need for setters
public class FoodItem{
	private final String NAME;
	private final int ITEM_ID;
	private final int GRAIN_CONTENT;
	private final int FV_CONTENT;
	private final int PRO_CONTENT;
	private final int OTHER_CONTENT;
	private final int CALORIES;

	// constructor
	// constructed from data in sql database
	public FoodItem(String foodName) {
		//big stubs. these are useless right now gonna have to use database.
		this.NAME = foodName;
		this.ITEM_ID = 0;
		this.GRAIN_CONTENT = 0;
		this.FV_CONTENT = 0;
		this.PRO_CONTENT = 0;
		this.OTHER_CONTENT = 0;
		this.CALORIES = 0;
	}

	// getters
	public String getName() {
		return this.NAME;
	}
	
	public int getItemID() {
		return this.ITEM_ID;
	}
	
	public int getGrainContent() {
		return this.GRAIN_CONTENT;
	}
	
	public int getFVContent() {
		return this.FV_CONTENT;
	}
	
	public int getProContent() {
		return this.PRO_CONTENT;
	}
	
	public int getOtherContent() {
		return this.OTHER_CONTENT;
	}
	
	public int getCalories() {
		return this.CALORIES;
	}
}
