public class Euler1 {
	
	public static void main(String[] args){
		int answer = 3;
		int start = 5;
		int end = 1000;
		while(start < end){
			if(start % 3 == 0 | start % 5 == 0){
				answer += start;
			} 
			start += 1;
		}
		System.out.println(answer);
	}
}