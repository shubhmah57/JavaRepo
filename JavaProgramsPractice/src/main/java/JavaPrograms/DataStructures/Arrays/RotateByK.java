package JavaPrograms.DataStructures.Arrays;

class Rotate {
    int [] nums;
    int k;
    int length;
    public void rotate(int[] nums, int k) {
        this.nums=nums;
        this.k=k;
        this.length=nums.length;
        rotateArray();
    }
    
    public void rotateArray(){
        reverseArray(0,k);
        int nums[] =reverseArray(k+1,length-1);
        for(int i: nums){
            System.out.print(i+ " ");
        }
    }
    
    public int[] reverseArray(int startPoint, int endPoint){
        while(startPoint<endPoint){
            int temp = nums[startPoint];
            nums[startPoint]=nums[endPoint];
            nums[endPoint]=temp;
            startPoint++;
            endPoint--;
        }
        return nums;
    }
}

public class RotateByK {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7};
        int k =3;
        Rotate rotate = new Rotate();
        rotate.rotate(nums,k);

    }
}