package JavaPrograms.DataStructures.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] p = {0,0,1,1,1,2,2,3,3,4};
        int pointer =0;
        for(int i=0; i<p.length;i++){
            if(p[i]!=p[pointer]){
                pointer++;
                p[pointer]=p[i];
            }
        }
        System.out.println(pointer+1);
        System.out.println("--------");
        for (int i =0; i<=pointer;i++){
            System.out.println(p[i]);
        }
    }
}
