import java.util.*;
public class SortedMinimumDifference{
	public static void main(String[] args){
	 
	int a[] = {1,5,30,12,18,9};
	Arrays.sort(a);
	
	int difference=0;
	int minimumValue = Integer.MAX_VALUE;
	for(int i = 1;i < a.length;i++)	{
		difference = Math.abs(a[i-1] - a[i]);
		minimumValue = Math.min(minimumValue, difference);
	}
	System.out.println("The minimum difference: " + minimumValue);
}
}