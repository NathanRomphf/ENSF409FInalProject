package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

// all amounts are given in calories not percentages
public class Family {
	private Client[] peopleInFamily;
	private Hamper hamper;
	private int wholeGrains = 0;
	private int fruitsVeggies = 0;
	private int protein = 0;
	private int otherContent = 0;
	private int calories = 0;
	private int size = 0;

	// constructor
	public Family(Client[] family) throws EmptyListException {
		if (family != null) {
			this.peopleInFamily = family;
			this.size = peopleInFamily.length;
			setNutritionNeeds();
		} else {
			throw new EmptyListException();
		}
	}

	private void setNutritionNeeds() {
		for (int i = 0; i < size; i++){
			wholeGrains += peopleInFamily[i].getWholeGrains();
			fruitsVeggies += peopleInFamily[i].getFruitsVeggies();
			protein += peopleInFamily[i].getProtein();
			otherContent += peopleInFamily[i].getOtherContent();
			calories += peopleInFamily[i].getCalories();
		}
	}
	
	public void giveHamper() {
		
	}

	// getters
	public Hamper getHamper() {
		return hamper;
	}
	
	public int getWholeGrains() {
		return this.wholeGrains;
	}
	
	public int getFruitsVeggies() {
		return this.fruitsVeggies;
	}
	
	public int getProtein() {
		return this.protein;
	}
	
	public int getOtherContent() {
		return this.otherContent;
	}
	
	public int getCalories() {
		return this.calories;
	}
	
	public Client[] getPeopleInFamily() {
		return this.peopleInFamily;
	}
}
