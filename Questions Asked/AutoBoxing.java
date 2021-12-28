public class AutoBoxing{
	
	public static void main(String[] args){
	
	Integer i =5;
	int a = i;
		
	//Unboxing
	System.out.println("Value:" + a);

	Integer x = new Integer(a);
	System.out.println("Value of x:" + x);
	}
}