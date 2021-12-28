public class MaximumDifference{

	public static void main(String[] args){
		
	String s = "11000000010000000000001";
	int max = Integer.MIN_VALUE;
	for(int i = 0; i <s.length(); i++)
	{
	if(s.charAt(i)=='1'){
		int j =i+1, count=0;
		while(j < s.length()-1 && s.charAt(j)!='1'){
		count++;
		j++;
		}
		max= Math.max(max, count);
	}
}
System.out.println("The maximum count is:"+ max);
}
}