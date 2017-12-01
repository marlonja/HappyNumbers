package com.marlon.happynumbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void testNumberToBeHappy() {
		
		HappyNumberHelper helper = new HappyNumberHelper();
		int numberThatShouldSucceed = 7;
		boolean actualResult = helper.checkIfNumberIsHappy(numberThatShouldSucceed);
		assertEquals(true, actualResult);
		
	}
	
	@Test
	public void testNumberToNotBeHappy() {
		
		HappyNumberHelper helper = new HappyNumberHelper();
		int numberThatShouldNotSucceed = 5;
		boolean actualResult = helper.checkIfNumberIsHappy(numberThatShouldNotSucceed);
		assertNotEquals(true, actualResult);
		
	}
	
	

}
