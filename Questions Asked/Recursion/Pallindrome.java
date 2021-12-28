public class Pallindrome{

 public static void main(String[] args){

	String s = "A";
	Pallindrome pallin = new Pallindrome();
	int left = 0;
	int right = s.length()-1;
	System.out.println("The string is pallindrome? :" + pallin.checkPallin(s, left, right));
}

private static boolean checkPallin(String s, int left, int right){
  System.out.println("Left:" + left + " Right:" + right);

	if(left >= right){
		return true;
	}
	if(s.charAt(left)!= s.charAt(right)){
		return false;
	}
	return checkPallin(s,++left,--right);
}

}
