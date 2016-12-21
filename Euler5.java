class Euler5{
	
	//Euler Project #5
	//What is the smallest positive number that is evenly divisible by all the numbers from 1-20

	public static void main(String[] args){
		
		smallestMultiple runProgram = new smallestMultiple();
		runProgram.iterateNumbers();
	}
}


class smallestMultiple {
	
	//We will count each step by 20
	int counter = 20;
	
	//We will start at 20
	int start = 20;
	
	//List of numbers to divide
	int[] numberList = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	
	//boolean to test if we have a possible answer
	boolean run = true;
	
	//place holder for quotient
	int possibleAnswer;
	
	//Then test to see if it is divisible by 1-19
	public void iterateNumbers(){
		while(run == true){
			checkForRemainder();
		}
	}
	
	public void checkForRemainder(){
		for(int i = 18; i >= 0; i -= 1){
			possibleAnswer = start % numberList[i];
			if(possibleAnswer != 0){
				start += counter;
				break;
			}
			else if(possibleAnswer == 0 & i == 0){
				System.out.println(start);
				run = false;
			}
		}
	}
}