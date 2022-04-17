package JavaPrograms.DataStructures.Arrays.PrefixSum;

public class LeftArrayProduct {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] res = new int[a.length];
        int left=1;
        for(int i= 0; i <a.length;i++){
                if(i>0){
                    left = left*a[i-1];
                }
                res[i]=left;
        }
        int right =1;
        for(int i=res.length-1;i>=0;i--) {
            res[i]=res[i]*right;
            right=right*a[i];
        }
        for(int i: res){
            System.out.print(i+ " ");
        }
    }
}
