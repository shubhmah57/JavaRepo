import java.util.*;
import java.util.stream.*;

public class MostKOccurences{
	public static void main(String[] args){
	
	 MostOccurences most = new MostOccurences();
         Integer a[] = {2,3,5,2,4,5,6};
	 List<Integer> list = Arrays.asList(a);
	 most.mostKOccurrences(list, 4);
	}
	
	public void mostKOccurrences(List<Integer> list, int k){
	
	Map<Integer, Integer> integerMap = new HashMap<>();
	for(int i: list){
	 
	integerMap .put(i,integerMap.getOrDefault(i,0)+1);
	}
	

	
}
}