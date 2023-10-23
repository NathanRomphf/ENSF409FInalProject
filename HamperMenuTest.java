package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

import org.junit.*;
import static org.junit.Assert.*;


public class HamperMenuTest {
	
	@Test
	public void testHamperListCreation() {
		Client testClient[] = {new Client(ClientType.CHILD_OVER_EIGHT)};
		Hamper testHamper = null;
		int expectedSize = 1;
		try {
			testHamper = new Hamper(new Family(testClient));
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		
		HamperMenu testMenu = new HamperMenu();
		testMenu.hamperList.add(testHamper);
		
		assertEquals("HamperList was not initialzed properly", testMenu.hamperList.size(), expectedSize);
	}
	
}
