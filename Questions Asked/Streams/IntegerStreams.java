import java.util.stream.*;
import java.util.*;

public class IntegerStreams{
	public static void main(String [] args){
		
		int [] array  = {3,4,5,7,8,9};
		Arrays.stream(array).map(x->x*3).forEach(System.out::println);
	}
}