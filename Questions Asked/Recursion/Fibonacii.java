public class Fibonacii{
	public static void main(String[] args){
	Fibonacii object = new Fibonacii();
	System.out.println(object.fibonacii(9));
	int n =9;
	for(int i = 0 ; i <=n;i++)
	 System.out.print(object.fibonacii(i) + " ");
	}
	public static int fibonacii(int n){
	
	if(n<=1){
	return n;
	}
	return fibonacii(n-1)+fibonacii(n-2);
	}
}
	