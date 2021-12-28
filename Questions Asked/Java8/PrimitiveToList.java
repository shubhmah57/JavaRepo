import java.util.*;
import java.util.stream.*;

public class PrimitiveToList{

 public static void main(String[] args){

	int [] values = {1, 6,7,7,8,3,2,2};
	List<Integer> integerList = Arrays.stream(values).boxed().collect(Collectors.toList());
	System.out.println("Using the Streams:");
	for(int h: integerList){
	System.out.println(h);
	}
	
	System.out.println("Using Arrays:");
	Character [] chars = {'r', 'p', 'm', 'k', 'o'};
	List<Character> valuesList = Arrays.asList(chars);
	for(int j: valuesList){
	System.out.println(j);
	}
	for(char c : valuesList){
		System.out.println(c);	
		}
}
}

	
	
	
