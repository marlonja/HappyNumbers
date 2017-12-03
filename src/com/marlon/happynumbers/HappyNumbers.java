package com.marlon.happynumbers;


public class HappyNumbers {

	public static void main(String[] args) {
		
		HappyNumberHelper helper = new HappyNumberHelper();
		int counter = 0;
	
		//Loop som går igenom talen 1-1000
		for(int i = 1; i <= 1000; i++) {
			
			boolean isNumberHappy = helper.checkIfNumberIsHappy(i);
			
			if (isNumberHappy) {				
				System.out.println(i);	
				counter++;
			}
		}
		
		System.out.println("Total number of happy numbers : " + counter);
	}
}
