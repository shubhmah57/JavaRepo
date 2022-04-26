package JavaPrograms.DataStructures.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
//        int []a = {0,1,2,2,3,0,4,2};
        int []a = {3,2,2,3};
//        int a[] = {2};
        int val = 3;
        removeElement.start(a,val);
    }

    public void start(int []nums, int val) {

        int pointer = 0;
        for(int i =0;i <=nums.length-1;i++){
            if(nums[i]!=val){
                int temp = nums[pointer];
                nums[pointer]=nums[i];
                nums[i]=temp;
                pointer++;
            }
        }

        for(int i =0; i<pointer;i++){
            System.out.print(nums[i] + " ");
        }
    }

}
