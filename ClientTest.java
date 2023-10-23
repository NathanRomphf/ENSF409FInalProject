//Package
package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

/**
 *
 * Filename: ClientTest.java
 * Course: ENSF 409
 * Description:
 * Testing different cases for Client.java
 *--- --- --- --- --- --- --- --- --- --- --- --- ---
 * @author Group 69
 * @version 1.2
 * @since 1.0
 *
 */

// Imports:
import org.junit.Test;
import static org.junit.Assert.*;

// --- Test implementation ---
public class ClientTest {
	// -- Values to Test --
	int expectedClientID = 0;
	ClientType expectedClientType;
	int expectedWholeGrains;
	int expectedFruitsVeggies;
	int expectedProtein;
	int expectedOtherContent;
	int expectedCalories;
	
	/**
	 * Send Client an Adult Male
	 * Check all getters to ensure values have been correctly set
	 */
	@Test
	public void testAdultMale() {
		//Create object
		Client testClient = new Client(ClientType.ADULT_MALE);

		//Expected values to test
		expectedClientID = 1;
		expectedClientType = ClientType.ADULT_MALE;
		expectedCalories = 2500;
		expectedWholeGrains = (int)(expectedCalories * 0.16);
		expectedFruitsVeggies = (int)(expectedCalories * 0.28);
		expectedProtein = (int)(expectedCalories * 0.26);
		expectedOtherContent = (int)(expectedCalories * 0.30);

		//Actual values
		int actualClientID = testClient.getClientID();
		ClientType actualClientType = testClient.getClientType();
		int actualCalories = testClient.getCalories();
		int actualWholeGrains = testClient.getWholeGrains();
		int actualFruitsVeggies = testClient.getFruitsVeggies();
		int actualProtein = testClient.getProtein();
		int actualOtherContent = testClient.getOtherContent();

		//Assert actual values against expected values
		assertEquals("Value of CLIENT_ID did not match what was expected: ", expectedClientID, actualClientID);
		assertEquals("Value of CLIENT_TYPE did not match what was expected: ", expectedClientType, actualClientType);
		assertEquals("Value of CALORIES did not match what was expected: ", expectedCalories, actualCalories);
		assertEquals("Value of WHOLE_GRAINS did not match what was expected: ", expectedWholeGrains, actualWholeGrains);
		assertEquals("Value of FRUITS_VEGGIES did not match what was expected: ", expectedFruitsVeggies, actualFruitsVeggies);
		assertEquals("Value of PROTEIN did not match what was expected: ", expectedProtein, actualProtein);
		assertEquals("Value of OTHER_CONTENT did not match what was expected: ", expectedOtherContent, actualOtherContent);
	}	//testAdultMale

	/**
	 * Send Client an Adult Female
	 * Check all getters to ensure values have been correctly set
	 */
	@Test
	public void testAdultFemale() {
		//Create object
		Client testClient = new Client(ClientType.ADULT_FEMALE);

		//Expected values to test
		expectedClientID = 2;
		expectedClientType = ClientType.ADULT_FEMALE;
		expectedCalories = 2000;
		expectedWholeGrains = (int)(expectedCalories * 0.16);
		expectedFruitsVeggies = (int)(expectedCalories * 0.28);
		expectedProtein = (int)(expectedCalories * 0.26);
		expectedOtherContent = (int)(expectedCalories * 0.30);

		//Actual values
		int actualClientID = testClient.getClientID();
		ClientType actualClientType = testClient.getClientType();
		int actualCalories = testClient.getCalories();
		int actualWholeGrains = testClient.getWholeGrains();
		int actualFruitsVeggies = testClient.getFruitsVeggies();
		int actualProtein = testClient.getProtein();
		int actualOtherContent = testClient.getOtherContent();

		//Assert actual values against expected values
		assertEquals("Value of CLIENT_ID did not match what was expected: ", expectedClientID, actualClientID);
		assertEquals("Value of CLIENT_TYPE did not match what was expected: ", expectedClientType, actualClientType);
		assertEquals("Value of CALORIES did not match what was expected: ", expectedCalories, actualCalories);
		assertEquals("Value of WHOLE_GRAINS did not match what was expected: ", expectedWholeGrains, actualWholeGrains);
		assertEquals("Value of FRUITS_VEGGIES did not match what was expected: ", expectedFruitsVeggies, actualFruitsVeggies);
		assertEquals("Value of PROTEIN did not match what was expected: ", expectedProtein, actualProtein);
		assertEquals("Value of OTHER_CONTENT did not match what was expected: ", expectedOtherContent, actualOtherContent);
	}	//testAdultFemale

	/**
  	 * Sent Client a Child over 8
	 * Check all getters to ensure values have been correctly set
	 */
	@Test
	public void testChildOver8() {
		//Create object
		Client testClient = new Client(ClientType.CHILD_OVER_EIGHT);

		//Expected values to test
		expectedClientID = 3;
		expectedClientType = ClientType.CHILD_OVER_EIGHT;
		expectedCalories = 2200;
		expectedWholeGrains = (int)(expectedCalories * 0.21);
		expectedFruitsVeggies = (int)(expectedCalories * 0.33);
		expectedProtein = (int)(expectedCalories * 0.31);
		expectedOtherContent = (int)(expectedCalories * 0.15);

		//Actual values
		int actualClientID = testClient.getClientID();
		ClientType actualClientType = testClient.getClientType();
		int actualCalories = testClient.getCalories();
		int actualWholeGrains = testClient.getWholeGrains();
		int actualFruitsVeggies = testClient.getFruitsVeggies();
		int actualProtein = testClient.getProtein();
		int actualOtherContent = testClient.getOtherContent();

		//Assert actual values against expected values
		assertEquals("Value of CLIENT_ID did not match what was expected: ", expectedClientID, actualClientID);
		assertEquals("Value of CLIENT_TYPE did not match what was expected: ", expectedClientType, actualClientType);
		assertEquals("Value of CALORIES did not match what was expected: ", expectedCalories, actualCalories);
		assertEquals("Value of WHOLE_GRAINS did not match what was expected: ", expectedWholeGrains, actualWholeGrains);
		assertEquals("Value of FRUITS_VEGGIES did not match what was expected: ", expectedFruitsVeggies, actualFruitsVeggies);
		assertEquals("Value of PROTEIN did not match what was expected: ", expectedProtein, actualProtein);
		assertEquals("Value of OTHER_CONTENT did not match what was expected: ", expectedOtherContent, actualOtherContent);
	}	//testChildOver8

	/**
	 * Send Client a child Under 8
	 * Check all getters to ensure values have been correctly set
	 */
	@Test
	public void testChildUnder8() {
		//Create object
		Client testClient = new Client(ClientType.CHILD_UNDER_EIGHT);

		//Expected values to test
		expectedClientID = 4;
		expectedClientType = ClientType.CHILD_UNDER_EIGHT;
		expectedCalories = 1400;
		expectedWholeGrains = (int)(expectedCalories * 0.21);
		expectedFruitsVeggies = (int)(expectedCalories * 0.33);
		expectedProtein = (int)(expectedCalories * 0.31);
		expectedOtherContent = (int)(expectedCalories * 0.15);

		//Actual values
		int actualClientID = testClient.getClientID();
		ClientType actualClientType = testClient.getClientType();
		int actualCalories = testClient.getCalories();
		int actualWholeGrains = testClient.getWholeGrains();
		int actualFruitsVeggies = testClient.getFruitsVeggies();
		int actualProtein = testClient.getProtein();
		int actualOtherContent = testClient.getOtherContent();

		//Assert actual values against expected values
		assertEquals("Value of CLIENT_ID did not match what was expected: ", expectedClientID, actualClientID);
		assertEquals("Value of CLIENT_TYPE did not match what was expected: ", expectedClientType, actualClientType);
		assertEquals("Value of CALORIES did not match what was expected: ", expectedCalories, actualCalories);
		assertEquals("Value of WHOLE_GRAINS did not match what was expected: ", expectedWholeGrains, actualWholeGrains);
		assertEquals("Value of FRUITS_VEGGIES did not match what was expected: ", expectedFruitsVeggies, actualFruitsVeggies);
		assertEquals("Value of PROTEIN did not match what was expected: ", expectedProtein, actualProtein);
		assertEquals("Value of OTHER_CONTENT did not match what was expected: ", expectedOtherContent, actualOtherContent);
	}	//testChildUnder8
}	//ClientTest
