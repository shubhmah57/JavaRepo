package JavaPrograms.DataStructures.Recursion;

public class ArrayCheck {
    public static void main(String[] args) {
        int [] a= {1,2,5,7,9};
        ArrayCheck check = new ArrayCheck();
        System.out.println(check.isSorted(a,0,1));
    }

    private boolean isSorted(int[] a, int i, int j) {
        if(i==a.length-1){
            return true;
        }

        else if(a[i]<a[j]){
            i++;
            j++;
          return isSorted(a,i,j);
        }
        else{
            return false;
        }
    }
}
