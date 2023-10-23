//Package
package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

/**
 *
 * Filename: Client.java
 * Course: ENSF 409
 * Description:
 * Client class retrieves a person's nutritional needs 
 * and data from a database for use when creating a family
 * and a hamper associated with that family.
 *--- --- --- --- --- --- --- --- --- --- --- --- ---
 * @author Group 69
 * @version 1.4
 * @since 1.0
 *
 */

// Imports:

// --- enum ---
enum ClientType {
	ADULT_MALE {
		@Override
		public String toString() {
			return "Adult Male";
		}
	}, ADULT_FEMALE {
		@Override
		public String toString() {
			return "Adult Female";
		}
	}, CHILD_OVER_EIGHT {
		@Override
		public String toString() {
			return "Child over 8";
		}
	}, CHILD_UNDER_EIGHT {
		@Override
		public String toString() {
			return "Child under 8";
		}
	};
	public abstract String toString();
}	//ClientType

// --- Class Implementation ---
public class Client{
	// -- Member Variables --
	private final int CLIENT_ID;
	private final ClientType CLIENT_TYPE;
	private final int WHOLE_GRAINS;
	private final int FRUITS_VEGGIES;
	private final int PROTEIN;
	private final int OTHER_CONTENT;
	private final int CALORIES;
	
	// -- Constructor --
	public Client(ClientType type){
		//Set cases

		CLIENT_TYPE = type;

		//checks the client type and initializes calories for further nutrient calculation.
		//just an idea, may need to be changed if table values for calories differ between our numbers and the numbers they'll use to test the program.
		switch(CLIENT_TYPE.toString()) {
		case "Adult Male":
			CLIENT_ID = 1;
			CALORIES = 2500;
			WHOLE_GRAINS = (int)(CALORIES * 0.16);
			FRUITS_VEGGIES = (int)(CALORIES * 0.28);
			PROTEIN = (int)(CALORIES * 0.26);
			OTHER_CONTENT = (int)(CALORIES * 0.30);
			break;
		case "Adult Female":
			CLIENT_ID = 2;
			CALORIES = 2000;
			WHOLE_GRAINS = (int)(CALORIES * 0.16);
			FRUITS_VEGGIES = (int)(CALORIES * 0.28);
			PROTEIN = (int)(CALORIES * 0.26);
			OTHER_CONTENT = (int)(CALORIES * 0.30);
			break;
		case "Child over 8":
			CLIENT_ID = 3;
			CALORIES = 2200;
			WHOLE_GRAINS = (int)(CALORIES * 0.21);
			FRUITS_VEGGIES = (int)(CALORIES * 0.33);
			PROTEIN = (int)(CALORIES * 0.31);
			OTHER_CONTENT = (int)(CALORIES * 0.15);
			break;
		case "Child under 8":
			CLIENT_ID = 4;
			CALORIES = 1400;
			WHOLE_GRAINS = (int)(CALORIES * 0.21);
			FRUITS_VEGGIES = (int)(CALORIES * 0.33);
			PROTEIN = (int)(CALORIES * 0.31);
			OTHER_CONTENT = (int)(CALORIES * 0.15);
			break;
		default:
			CLIENT_ID = 0;
			CALORIES = 0;
			WHOLE_GRAINS = 0;
			FRUITS_VEGGIES = 0;
			PROTEIN = 0;
			OTHER_CONTENT = 0;
		}
	}

	/**
	 * Getter for CLIENT_ID.
	 * @return The client's ID number.
	 */
	public int getClientID() {
		return CLIENT_ID;
	}

	/**
	 * Getter for CLIENT_TYPE.
	 * @return The type of client.
	 */
	public ClientType getClientType() {
		return CLIENT_TYPE;
	}

	/**
	 * Getter for WHOLE_GRAINS.
	 * @return The number of calories of whole grains this client needs.
	 */
	public int getWholeGrains() {
		return WHOLE_GRAINS;
	}

	/**
	 * Getter for FRUITS_VEGGIES.
	 * @return The number of calories of fruits and vegetables this client needs.
	 */
	public int getFruitsVeggies() {
		return FRUITS_VEGGIES;
	}

	/**
	 * Getter for PROTEIN.
	 * @return The number of calories of protein this client needs.
	 */
	public int getProtein() {
		return PROTEIN;
	}

	/**
	 * Getter for OTHER_CONTENT.
	 * @return The number of calories of other types of food this client needs.
	 */
	public int getOtherContent() {
		return OTHER_CONTENT;
	}

	/**
	 * Getter for CALORIES.
	 * @return The number of total calories this client needs.
	 */
	public int getCalories() {
		return CALORIES;
	}
}	//Client