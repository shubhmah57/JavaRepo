public class Factorial{

	public static void main(String[] args){
	
	Factorial object = new Factorial();
	System.out.println(object.factorial(2));
	}

	public static int factorial(int n){
		
	if(n==1){
		return 1;	
	}
	
	 return n*factorial(n-1);
	}
}