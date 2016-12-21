class Euler6{
	
	//Project Euler #6
	//Find the difference between the sum of the squares of the first 100 natural numbers and the square of the sum.
	
	
	public static void main(String[] args){
		
		differenceEquation runProgram = new differenceEquation();
		runProgram.populateList();
		System.out.println(runProgram.finalAnswer());
		
	}
	
}

class differenceEquation{
	
	//Set up our list to conatin our 100 numbers
	int[] numberList = new int[100];
	
	//populate list with the numbers 1-100
	public void populateList(){
		for(int i = 0; i <= 99; i++){
			numberList[i] = i + 1;
		}
	}
	
	//Find the sum of the squares for the first 100 natural numbers
	public int sumOfSquares(){
		//place holder for answer
		int sumOfSquaresAnswer = 0;
		for(int i = 0; i<=99; i++){
			//get the square of each value in the list and add it to the place holder
			sumOfSquaresAnswer += numberList[i]*numberList[i];
		}
		return(sumOfSquaresAnswer);
	}
	
	//Find the square of the sum of the first 100 natural numbers
	public int squareOfTheSums(){
		//place holder for answer
		int squareOfSumsAnswer = 0;
		for(int i = 0; i<= 99; i++){
			//Add all the numbers in the list together
			squareOfSumsAnswer += numberList[i];
		}
		//square the answer
		squareOfSumsAnswer = squareOfSumsAnswer*squareOfSumsAnswer;
		return(squareOfSumsAnswer);
	}
	
	//Find the difference between the 2 numbers returned
	public int finalAnswer(){
		return(squareOfTheSums() - sumOfSquares());
	}
}