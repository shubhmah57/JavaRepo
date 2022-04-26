package JavaPrograms.DataStructures.Matrix;

public class MaxConsecutiveOne {
    static int C =4;
    static int R =4;
    public static void main(String[] args) {
        int [] [] mat = { {0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

        System.out.print("Index of row with maximum 1s is " + rowMax1s(mat));
    }

    private static int rowMax1s(int[][] mat) {
        int max = Integer.MIN_VALUE;
        int maxIndex =0;
        for(int i=0; i <R; i++){
             int index= count1s(mat[i], 0, C-1);
             if(index!=-1){
                 int length = C-index;
                 if(length>max){
                     max = length;
                     maxIndex = i;
                 }
             }
        }
        return  maxIndex;
    }

    private static int count1s(int[] ints, int low, int high) {
            if(low<=high){
                int mid = low + (high-low)/2;
                if(ints[mid]==0){
                    return count1s(ints,mid+1,high);
                }
                else if((mid ==0|| ints[mid-1]==0) && ints[mid]==1){
                    return mid;
                }
                else{
                    return count1s(ints, low, mid-1);
                }
            }
            return -1;
    }
}
