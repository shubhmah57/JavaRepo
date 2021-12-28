import java.util.*;

public class PrimitiveToNonPrimitive{
	
	public static void main(String[] args){
	
	int [] arrays = {4, 6, 7,8, 9,10,11};
	Integer [] nonprimitive=Arrays.stream(arrays).boxed().toArray(Integer[]::new);
	for(int i = 0 ; i< nonprimitive.length;i++){
	System.out.println(nonprimitive[i]);
	}
	
	Arrays.asList(nonprimitive);

}
}
