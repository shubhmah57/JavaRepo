import java.util.*;

public class MinimumDIfference {

	public static void main(String[] args){
	
	List<Integer> numbersList = new ArrayList<>();
	numbersList.add(1);
	numbersList.add(5);
	numbersList.add(30);
	numbersList.add(12);
	numbersList.add(18);
	numbersList.add(4);
	int firstNumber=0, secondNumber=0;
	int a[] = new int[numbersList.size()];
	for(int i=0;i<a.length;i++)
	{
		a[i] = numbersList.get(i);
	}
	int minValue = Integer.MAX_VALUE;
	for(int i =0 ; i < a.length; i++){
		for(int j =i+1; j < a.length; j++)
			{
			   //minValue = Math.min(minValue, Math.abs(a[j] - a[i]));
				if(minValue > Math.abs(a[j] - a[i]))
					{
						minValue = Math.abs(a[j] - a[i]);
						firstNumber = a[i];
						secondNumber = a[j];
					}
		
		}

	}
	System.out.println("The Minimum Value:"+ minValue);
	System.out.println("The Numbers are:" + firstNumber +" " + secondNumber);
	}	
}