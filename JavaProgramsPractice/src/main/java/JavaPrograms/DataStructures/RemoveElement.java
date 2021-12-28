package JavaPrograms.DataStructures;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        /*int a[] = {0,1,2,2,3,0,4,2};*/
        /*int a[] = {3,2,2,3};*/
        int a[] = {5, 0, 3, 0, 1, 2, 0, 0, 6};
        int val = 0;
        removeElement.start(a,val);
    }

    public void start(int []nums, int val) {

        int begin = 0;
        for ( int i = 0; i< nums.length; i++){
            if(nums[i]!=val){
                nums[begin++] = nums[i];
            }
        }

        for (int i : nums){
            System.out.println(i);
        }
    }

}
