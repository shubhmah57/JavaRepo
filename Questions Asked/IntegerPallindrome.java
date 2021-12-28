public class IntegerPallindrome{


 public static void main(String[] args){
	
	int i = 1001;
	int reverse=0;
	int orignalNumber = i;
	while(i>0)
	{
		int j = i%10;
		reverse = reverse*10 + j;
		i = i/10;
	}
	System.out.println("The reverse is:" + reverse);
	if(orignalNumber == reverse){
	System.out.println("The Number is Pallindrome");
	}
	else{
	System.out.println("The number is not pallindrome");
	}
}
}