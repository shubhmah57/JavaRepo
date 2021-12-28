class StringPallindrome {

public static void main(String []args){

	String a = "MAM";
	int length = a.length();
	String b = "";
	for(int i = length-1; i>=0; i--)
	{
	 b = b + a.charAt(i);
	}
	if(b.equals(a)){
		System.out.println("Pallindrome");
	}
	else{
		System.out.println("Not Pallindrome");
	}
}
}
	
	
	