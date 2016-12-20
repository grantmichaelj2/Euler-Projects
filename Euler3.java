import java.util.ArrayList;
import java.util.Collections;
import java.math.*;

public class Euler3{
	
	//Project #3 for Project Euler3
	//Find the largest prime factor of the number 600851475143
	
	
	public static void main(String[] args){

		theWorks runProgram = new theWorks();
		runProgram.findFactors();
		runProgram.findPrimes();
	}
	
}

class theWorks {
	
	ArrayList<BigInteger> factorList = new ArrayList<>();
	ArrayList<BigInteger> notPrimeList = new ArrayList<>();
	
	public void findFactors(){
		
		BigInteger numberOfInterest = new BigInteger("600851475143");
		BigInteger counter = new BigInteger("1");
		
		while(counter.compareTo(numberOfInterest) == -1){
			
			if((numberOfInterest.remainder(counter)).equals(BigInteger.ZERO)){
				
				if(factorList.contains(numberOfInterest.divide(counter))){
					
					break;
					
				}
				else{
					
				factorList.add(numberOfInterest.divide(counter));
				factorList.add(counter);
				counter = counter.add(BigInteger.ONE);
				
				}
			}
			else{
				
				counter = counter.add(BigInteger.ONE);
				
			}
		}
		Collections.sort(factorList);
		System.out.println(factorList);
	}
	
	public void findPrimes(){
		
		BigInteger iter = new BigInteger("2");
		
		for(int i = 0; i < factorList.size()-1; i++){
			
			BigInteger counter = new BigInteger("3");
			
			while(counter.compareTo(factorList.get(i).divide(iter)) == - 1){
				
				if((factorList.get(i).remainder(counter)).equals(BigInteger.ZERO)){
					
					//If the number is not prime, add it to the list
					notPrimeList.add(factorList.get(i));
					break;
	
				}
				
				else{
					
					counter = counter.add(iter); 
					
				}
			}
		}
		System.out.println(notPrimeList);
	}
}