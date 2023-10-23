package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class HamperTest {

	private final Client[] CLIENT_LIST = {new Client(ClientType.ADULT_MALE), new Client(ClientType.CHILD_OVER_EIGHT)};
	private Family TEST_FAMILY;
	
	public HamperTest() {
		try {
			TEST_FAMILY = new Family(CLIENT_LIST);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}
	
	// Test the hamper constructor, in order to test that the constructor properly
	// initializes the family getters must also be used
	@Test
	public void testHamperConstructor() {
		Hamper testHamper = new Hamper(TEST_FAMILY);
		assertEquals("Hamper is initialized with proper family.", testHamper.getFamily(), TEST_FAMILY);
	}

	@Test
	public void testAddToList() {
		Hamper testHamper = new Hamper(TEST_FAMILY);
		String expectedNameOne = "Adzuki bean, medium package";
		String expectedNameTwo = "Kidney beans, dozen cans";
		
		testHamper.addToList(new FoodItem("Adzuki bean, medium package"));
		testHamper.addToList(new FoodItem("Kidney beans, dozen cans"));
		ArrayList<FoodItem> testFoodList = testHamper.getFoodList();

		assertTrue("FoodItem was not properly inserted.", testFoodList.get(0).getName().equals(expectedNameOne));
		assertTrue("FoodItem was not properly inserted.", testFoodList.get(1).getName().equals(expectedNameTwo));
		
	}

	@Test
	public void testRemoveFromListRemovesItemHighestIndex() {
		Hamper testHamper = new Hamper(TEST_FAMILY);
		FoodItem testItem = new FoodItem("Adzuki bean, medium package");
		FoodItem testItemTwo = new FoodItem("Kidney beans, dozen cans");
		testHamper.addToList(testItem);
		testHamper.addToList(testItemTwo);
		
		try {
			testHamper.removeFromList();
		} catch (EmptyListException e1) {
			e1.printStackTrace();
		}
		ArrayList<FoodItem> testFoodList = testHamper.getFoodList();
		boolean itemIsRemoved = false;
		
		try {
			testFoodList.get(1);
		} catch (IndexOutOfBoundsException e) {
			itemIsRemoved = true;
		}
		
		assertTrue("Item did not get removed.", itemIsRemoved);
	}
	
	@Test
	public void testRemoveFromListRemovesCorrectItem() {
		Hamper testHamper = new Hamper(TEST_FAMILY);
		
		FoodItem testItem = new FoodItem("Adzuki bean, medium package");
		FoodItem testItemTwo = new FoodItem("Kidney beans, dozen cans");
		testHamper.addToList(testItem);
		testHamper.addToList(testItemTwo);
		
		FoodItem retreivedItem = null;
		try {
			retreivedItem = testHamper.removeFromList();
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		
		assertEquals("The wrong item was removed.", retreivedItem, testItemTwo);
	}
	
	@Test
	public void testClearList() {
		Hamper testHamper = new Hamper(TEST_FAMILY);
		
		FoodItem testItem = new FoodItem("Adzuki bean, medium package");
		FoodItem testItemTwo = new FoodItem("Kidney beans, dozen cans");
		testHamper.addToList(testItem);
		testHamper.addToList(testItemTwo);
		
		testHamper.clearList();
		
		assertTrue("Hamper was not cleared.", testHamper.isEmpty());
	}

	@Test
	public void testIsEmpty() {
		Hamper testHamper = new Hamper(TEST_FAMILY);
		assertTrue("isEmpty() did not return true when Hamper was empty.", testHamper.isEmpty());
	}

	@Test
	public void testRemoveFromEmptyListThrowsEmptyListException() {
		Hamper testHamper = new Hamper(TEST_FAMILY);
		boolean exceptionThrown = false;
		try {
			testHamper.removeFromList();
		} catch (EmptyListException e) {
			exceptionThrown = true;
		}
		assertTrue("EmptyListException was not thrown when removing from empty list", exceptionThrown);
	}
}





