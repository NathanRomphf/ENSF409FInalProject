package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;


import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class FoodItemTest{
	String aBeans = "Adzuki bean, medium package";
	int aBeansGrain = 75;
	int aBeansFV = 0;
	int aBeansProtien = 24;
	int aBeansOther = 1;
	int totalCalories = 3240;
	
	@Test
	public void testFoodItemConstructor(){
		//tests to see if when provided a food item name can the constructor
		//instantiate a FoodItem object
		boolean exceptionCaught = false;
		try{
			FoodItem adzukiBean = new FoodItem(aBeans);
		}catch(Exception e){
			exceptionCaught = true;
		}
		assertFalse("Exception was thrown while creating a FoodItem object", exceptionCaught);
	}
	
	@Test
	public void testNameGetter(){
		//tests to see if the getName method returns the expected
		//name of the food item
		FoodItem adzukiBean = null;
		boolean exceptionCaught = false;
		try{
			adzukiBean = new FoodItem(aBeans);
		}catch(Exception e){
			exceptionCaught = true;
		}
		assertFalse("Exception was thrown while creating a FoodItem object", exceptionCaught);
		assertEquals("Percentage of daily calories returned from getGrainContent was incorrect", aBeans, adzukiBean.getName());
	}
	
	@Test
	public void testGrainGetter(){
		//tests to see if the getGrainContent method returns the expected
		//percentage of calories that are in the grains food group
		FoodItem adzukiBean = null;
		boolean exceptionCaught = false;
		try{
			adzukiBean = new FoodItem(aBeans);
		}catch(Exception e){
			exceptionCaught = true;
		}
		assertFalse("Exception was thrown while creating a FoodItem object", exceptionCaught);
		assertEquals("Percentage of daily calories returned from getGrainContent was incorrect", aBeansGrain, adzukiBean.getGrainContent());
	}
	
	@Test
	public void testFVGetter(){
		//tests to see if the getFVContent method returns the expected
		//percentage of calories that are in the fruits and veggies food group
		FoodItem adzukiBean = null;
		boolean exceptionCaught = false;
		try{
			adzukiBean = new FoodItem(aBeans);
		}catch(Exception e){
			exceptionCaught = true;
		}
		assertFalse("Exception was thrown while creating a FoodItem object", exceptionCaught);
		assertEquals("Percentage of calories returned from getGrainContent was incorrect", aBeansFV, adzukiBean.getFVContent());
	}
	
	@Test
	public void testProteinGetter(){

		//tests to see if the getProContent method returns the expected
		//percentage of calories that are in the protien food group
		FoodItem adzukiBean = null;
		boolean exceptionCaught = false;
		try{
			adzukiBean = new FoodItem(aBeans);
		}catch(Exception e){
			exceptionCaught = true;
		}
		assertFalse("Exception was thrown while creating a FoodItem object", exceptionCaught);
		assertEquals("Percentage of calories returned from getGrainContent was incorrect", aBeansProtien, adzukiBean.getProContent());
	}
	
	@Test
	public void testOtherGetter(){

		//tests to see if the getOther method returns the expected
		//percentage of calories that are in the others food group
		FoodItem adzukiBean = null;
		boolean exceptionCaught = false;
		try{
			adzukiBean = new FoodItem(aBeans);
		}catch(Exception e){
			exceptionCaught = true;
		}
		assertFalse("Exception was thrown while creating a FoodItem object", exceptionCaught);
		assertEquals("Percentage of calories returned from getOther was incorrect", aBeansFV, adzukiBean.getOtherContent());
	}
	
	@Test
	public void testFoodItemNotFoundException(){
		//tests to see if the FoodItemNotFoundException is thrown thrown
		//when a bad food item name is provided to the constructor
		FoodItem adzukiBean = null;
		boolean exceptionCaught = false;
		try{
			adzukiBean = new FoodItem(aBeans);
		}catch(Exception e){
			exceptionCaught = true;
		}
		assertTrue("Exception was not thrown while creating a FoodItem object with a item name that does not exist", exceptionCaught);
	}
}