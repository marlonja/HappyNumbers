package com.marlon.happynumbers;


public class HappyNumbers {

	public static void main(String[] args) {
		
		HappyNumberHelper helper = new HappyNumberHelper();
	
		for(int i = 1; i <= 1000; i++) {
			
			boolean isNumberHappy = helper.checkIfNumberIsHappy(i);
			
			if (isNumberHappy) {				
				System.out.println(i);				
			}
		}		
	}
}
