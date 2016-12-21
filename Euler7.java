class Euler7{
	
	//Project Euler #7
	//What is the 10 001st prime number?
	
	public static void main(String[] args){
		
		findPrime runProgram = new findPrime();
		System.out.println(runProgram.primeSequence());
		
	}
}

class findPrime{
	
	//Variable to count what Prime number we are at
	int primeNumberCount = 1;
	
	//Variable to track the current number we are on
	int currentNumber = 3;
	
	//Variable to do all the division
	int divisor;
	
	//What prime number we want to find
	int primeNumberDesired = 10001;
	
	public int primeSequence(){
		
		while(primeNumberCount < primeNumberDesired){
			
			//Eliminate redundant numbers
			divisor = currentNumber/2;
			
			while(divisor > 0){
				
				if(currentNumber % divisor == 0 & divisor != 1){
					currentNumber += 2;
					break;
					
				}
				
				else if(currentNumber % divisor == 0 & divisor == 1){
					primeNumberCount += 1;
					if(primeNumberCount == primeNumberDesired){
						break;
					}
					else{
						currentNumber += 2;
						break;
					}
				}

				divisor -= 1;

			}
		}
		
		return(currentNumber);
		
	}
}