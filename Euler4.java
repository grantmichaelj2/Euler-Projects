import java.util.ArrayList;


class Euler4{
	
	//Project Euler project #4
	//Largest Palindrome product
	//Find the largest palindrome made from the product of two 3-digit numbers.
	
	public static void main(String[] args){
		
		palindromicNumber runProgram = new palindromicNumber();
		runProgram.calculateAnswers();
		
	}
	
}

class palindromicNumber{
	
	//First counter that will iterate through every number between 1-999
	int counter1 = 999;
	//Second counter that is being manipulated only after counter1 reaches 0
	int counter2 = 999;
	//Our place holder value to reverse
	int answer;
	//Our largest palindromic number so far
	int largest = 0;
	//List to compare the two vaules to see if they are palindromicNumber
	int[] compare = new int[2];  
	
	public void calculateAnswers(){
		while(counter2 > 99){
			
			answer = counter1 * counter2;
			compare[0] = answer;
			compare[1] = reverseNumber(compare[0]);

			if(compare[0] == compare[1]){
				
				if(compare[0] > largest){
					largest = compare[0];
				}
				
				counter1 -= 1;
			}
			else{
				
				counter1 -= 1;	
			}	
			
			if(counter1 == 99){
				
				counter1 = 999;
				counter2 -= 1;
			}
			
		}
		System.out.println(largest);
	}
	
	public int reverseNumber(int number){
		int start = 0;
		while(number != 0){
			//Takes the rightmost digit off the original number and starts it at the first of our reversed number
			start = start * 10 + number % 10;
			//Removes the right most digit
			number = number/10;
		}
		return(start);
	}
}