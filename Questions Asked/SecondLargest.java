public class SecondLargest{
	
	public static void main(String[] args){
	
	int a[] = {9,6,7,8,3,2,4};
	int largest =  Integer.MIN_VALUE;
	int second = Integer.MIN_VALUE;
	for(int i =0; i < a.length; i++){
		
	 largest = Math.max(largest, a[i]);
	}
	
	for (int i = 0 ; i<a.length; i++){
	
		if(a[i]!=largest){
		second = Math.max(second, a[i]);
		}
	}
	System.out.println(second);
	
	}
	
}
