package com.marlon.happynumbers;

import java.util.ArrayList;

public class HappyNumberHelper {
	
	public boolean checkIfNumberIsHappy(int number) {
		
		ArrayList<Integer> numbersChecked = new ArrayList<>();
		
		while(!numbersChecked.contains(number)){
			
			numbersChecked.add(number);			
			int sum = calculateSum(number);			
			number = sum;
			
			if (number == 1) {				
				return true;				
			}			
		}		
		return false;		
	}

	private int calculateSum(int number) {
		
		int sum = 0;
		
		while(number > 0) {			
			sum += (number % 10) * (number % 10);
			number = number / 10;
		}		
		return sum;
	}
}
