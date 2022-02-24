package JavaPrograms.DataStructures.Arrays;

public class RotationByLargest {
    public static void main(String[] args) {
        int [] p = {99998,997,5,2,87,30000000,4};
        int max = Integer.MIN_VALUE;
        int rotationIndex=0;
        for(int i =0; i<p.length;i++){
            if(max<p[i]){
                max = p[i];
                rotationIndex =i;
            }
        }
        reverseArray(p, rotationIndex, p.length-1);
        reverseArray(p,0,p.length-1);
        for(int h: p){
            System.out.print(h + " ");
        }
    }

    private static void reverseArray(int[] p, int i, int j) {
        while (i < j){
            int temp = p[i];
            p[i]= p[j];
            p[j]=temp;
            i++;
            j--;
        }
    }
}
