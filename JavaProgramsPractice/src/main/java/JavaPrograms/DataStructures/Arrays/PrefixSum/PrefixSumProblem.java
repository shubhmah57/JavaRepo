package JavaPrograms.DataStructures.Arrays.PrefixSum;

/**
 * The sum by leaving the element
 * means for every index sum the elements leaving
 * its own index element.
 */
public class PrefixSumProblem {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] left = new int[a.length];
        int [] right = new int[a.length];
        left[0]=1;
        right[right.length-1]=a[a.length-1];
        for(int i =1; i< a.length;i++){
            left[i]= left[i-1]+a[i];
        }
        for(int i = right.length-2; i>=0;i--){
            right[i]= right[i+1]+a[i];
        }
        for(int g: left){
            System.out.print(g +  " ");
        }
        System.out.println();
        for (int h: right){
            System.out.print(h+ " ");
        }
    }

}
