import java.util.*;
public class Frequency{
	public static void main(String[] args){
	
	int []a = {44, 55, 11, 99, 44, 11 ,44 ,22, 55, 11, 88};
	Map<Integer, Integer> frequencyMap = new HashMap<>();
	
	for (int i = 0; i < a.length;i++)
		{
		if(frequencyMap.containsKey(a[i]))
			{
			frequencyMap.put(a[i], frequencyMap.get(a[i])+1);
			}
		else	{
			frequencyMap.put(a[i], 1);
			}
		}
		System.out.println(frequencyMap);	
		frequencyMap.entrySet().stream().forEach(x->System.out.println(x.getKey() + x.getValue()));
	}

}