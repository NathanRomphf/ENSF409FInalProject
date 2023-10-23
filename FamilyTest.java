package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

import org.junit.*;
import static org.junit.Assert.*;

public class FamilyTest {
	private final Client ADULT_MALE = new Client(ClientType.ADULT_MALE);
	private final Client ADULT_FEMALE = new Client(ClientType.ADULT_FEMALE);
	private final Client YOUNG_CHILD = new Client(ClientType.CHILD_UNDER_EIGHT);
	private final Client OLD_CHILD = new Client(ClientType.CHILD_OVER_EIGHT);

	@Test
	public void testFamilyConstructor() {
		int expectedSize = 4;
		Client[] clientList = {ADULT_MALE, ADULT_FEMALE, YOUNG_CHILD, OLD_CHILD};
		Family family = null;
		try {
			family = new Family(clientList);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		assertEquals("Incorrect amount of Client stored in Family array", expectedSize, family.getPeopleInFamily().length);
	}

	@Test
	public void testWholeGrainsGetter(){
		int expectedGrains = 1476;
		Client[] clientList = {ADULT_MALE, ADULT_FEMALE, YOUNG_CHILD, OLD_CHILD};
		Family family = null;
		try {
			family = new Family(clientList);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		assertEquals("Value of families total grain needs is incorrect", expectedGrains, family.getWholeGrains());
	}

	@Test
	public void testFruitsVeggiesGetter() {
		int expectedFV = 2448;
		Client[] clientList = {ADULT_MALE, ADULT_FEMALE, YOUNG_CHILD, OLD_CHILD};
		Family family = null;
		try {
			family = new Family(clientList);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		assertEquals("Value of families total fruits and veggies needs is incorrect", expectedFV, family.getFruitsVeggies());
	}

	@Test
	public void testOtherGetter() {
		int expectedOther = 1890;
		Client[] clientList = {ADULT_MALE, ADULT_FEMALE, YOUNG_CHILD, OLD_CHILD};
		Family family = null;
		try {
			family = new Family(clientList);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		assertEquals("Value of families total other nutrition needs is incorrect", expectedOther, family.getOtherContent());
	}

	@Test
	public void testProteinGetter() {
		int expectedProtein = 2286;
		Client[] clientList = {ADULT_MALE, ADULT_FEMALE, YOUNG_CHILD, OLD_CHILD};
		Family family = null;
		try {
			family = new Family(clientList);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		assertEquals("Value of families total protein needs is incorrect", expectedProtein, family.getProtein());
	}

	@Test
	public void testCalorieGetter() {
		int expectedCalories = 8100;
		Client[] clientList = {ADULT_MALE, ADULT_FEMALE, YOUNG_CHILD, OLD_CHILD};
		Family family = null;
		try {
			family = new Family(clientList);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		assertEquals("Value of families total calorie needs is incorrect", expectedCalories, family.getCalories());
	}

	@Test
	public void testEmptyArray() {
		boolean exceptionCaught = false;
		try {
			Family family = new Family(null);
		} catch (EmptyListException e) {
			exceptionCaught = true;
		}
		assertTrue("Should have thrown an exception for empty array", exceptionCaught);
	}

}
