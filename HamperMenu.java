package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

import java.util.*;

public class HamperMenu {
	
	private ArrayList<Family> familyList;
	
	public HamperMenu() {
		this.familyList = new ArrayList<Family>();
	}
	
	public void createAndAddFamily(Client[] clientList) throws EmptyListException {
		Family newFamily = new Family(clientList);
		familyList.add(newFamily);
	}
	
	public void createHampers() {
		for (Family family : familyList) {
			family.giveHamper();
		}
	}
	
	
}

