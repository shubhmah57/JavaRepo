public class Factorial{

	public static void main(String[] args){
	
	int number = 10;
	int output = 1;
	while(number >= 1){
		
	output = output * number;
	number = number-1;
	}
	System.out.println("The factorial is:" + output);
	}
}
	