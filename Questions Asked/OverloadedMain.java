public class OverloadedMain{

	public static void main(String[] args){
	
	System.out.println("Hello");
	OverloadedMain overloaded = new OverloadedMain();
	overloaded.main();
	}

	public void main(){
		System.out.println("Another Main Method");
	}
}

