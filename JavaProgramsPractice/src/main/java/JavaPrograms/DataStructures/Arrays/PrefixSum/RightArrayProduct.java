package JavaPrograms.DataStructures.Arrays.PrefixSum;

public class RightArrayProduct {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int right =1;
        int [] res = new int[a.length];
        for(int i= a.length-1;i>=0;i--){
                if(i<a.length-1){
                    right = right * a[i+1];
                }
                res[i]=right;
        }
        for (int h: res){
            System.out.print(h + " ");
        }
    }
}
