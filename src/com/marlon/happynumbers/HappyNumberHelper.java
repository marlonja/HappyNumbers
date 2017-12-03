package com.marlon.happynumbers;

import java.util.ArrayList;

public class HappyNumberHelper {
	
	public boolean checkIfNumberIsHappy(int number) {
		
		ArrayList<Integer> numbersChecked = new ArrayList<>();
		
		// Om ett nummer som redan existerar i listan kommer in visar det på att det är en loop => unhappy number
		while(!numbersChecked.contains(number)){
			
			numbersChecked.add(number);			
			number = calculateSum(number);			
			
			if (number == 1) {				
				return true;				
			}			
		}		
		return false;		
	}
	
	private int calculateSum(int number) {
		
		/* Plocka ut varje enskilt tal i number: 
		 * Första talet går att få ut genom enkel division då int helt enkelt tar bort resterande decimaler. 
		 * Sista numret är alltid number % 10
		 * De mellersta talen tas ut genom att ta bort de siffror så att talet man är ute efter nu ska vara sista talet. => % 10 
		 */
		
		int length = String.valueOf(number).length();
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		int sum = 0;
		
		if (length == 1) {
			sum = number * number;
			return sum;
		}
		if (length == 2) {
			firstNumber = number / 10;
			secondNumber = number % 10;
			sum = firstNumber * firstNumber;
			sum += secondNumber * secondNumber;			
			return sum;			
		}
		if (length == 3) {
			firstNumber = number / 100;
			secondNumber = number / 10;
			secondNumber %= 10;
			thirdNumber = number % 10; 			
			sum = firstNumber * firstNumber;
			sum += secondNumber * secondNumber;	
			sum += thirdNumber * thirdNumber;					
			return sum;	
		}
		if (length == 4) {
			firstNumber = number / 1000;
			secondNumber = number / 100;
			secondNumber %= 10;
			thirdNumber = number / 10;
			thirdNumber %= 10; 
			fourthNumber = number % 10;			
			sum = firstNumber * firstNumber;
			sum += secondNumber * secondNumber;	
			sum += thirdNumber * thirdNumber;
			sum += fourthNumber * fourthNumber;					
			return sum;	
		}
		return 0;
	}	

}
