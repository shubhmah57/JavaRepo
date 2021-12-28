public class PrimeNumber{

	public static void main(String[] args){
	
	int number = 7;
	int n =2;
	boolean prime = true;
	while(n < number){
	 if(number%n ==0){
		prime = false;
		break;
	}
	n++;
	}
	if(prime){
	System.out.println("The number is prime");
	}
	else{
	System.out.println("The number is not prime");
	}
}
}

	
