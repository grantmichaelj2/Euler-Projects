import java.util.ArrayList;

//Project Euler # 2
//Add all the even numbers in a fibnocci sequence no greater than 4 million


public class Euler2{
	
	public static void main(String[] args){
		theWorks runProgram = new theWorks();
		runProgram.setMax(4000000);
		runProgram.Operate();
	}
}

class theWorks {

	
	//Variables that will execute the fibonacci sequence
	public int firstInt = 1;
	public int secondInt = 2;
	public int totalOfAll = 0;
	public int evenTotal = 0;
	
	//Set our max number to do operations on to whatever number we want
	public int maxNumber;
	
	public void setMax(int number){
		maxNumber = number;
	}
	
	public void Operate(){
		
		//Create a list to hold our values
		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		
		while(secondInt < maxNumber){
			totalOfAll = firstInt + secondInt;
			firstInt = secondInt;
			secondInt = totalOfAll;
			if(secondInt < 4000000){
			numberList.add(secondInt);
			}
		}
		for(int count=0; count < numberList.size(); count+=1){
			if(numberList.get(count) % 2 == 0){
				evenTotal += numberList.get(count);
			}
			else{
				System.out.println("The number " + numberList.get(count) + " is not even");
			}
		}
		System.out.println(evenTotal);
	}	
}