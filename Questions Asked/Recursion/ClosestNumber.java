public class ClosestNumber{

  	public static void main(String[] args){
	  	int a[] = {2,10,6,7,8,8,26};
	    int targetNumber = 44;
	    int min = Integer.MAX_VALUE;
	    int difference = 0;
	    int closestNumber =0;
	    for (int i = 0 ; i <a.length; i++){
		  difference = Math.abs(Math.abs(a[i]) - targetNumber);
		  if(difference < min){
			min = difference;
			closestNumber = a[i];
		  }
		}
	  System.out.println(closestNumber);

	}

}
