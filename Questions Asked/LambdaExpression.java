
interface FunctionalInterface{
	
	public void method();

}


public class LambdaExpression{


	public static void main(String[] args){
	
	FunctionalInterface object = ()->{

	System.out.println("Inside the Functional Interface Now!");

	};

	object.method();

	}
}