package JavaPrograms.DataStructures.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] p = {8,7,5,2,3,4,87};
        int i=0;
        int j = p.length-1;
        while(i<j){
            int temp = p[i];
            p[i]=p[j];
            p[j]=temp;
            j--;
            i++;
        }
        for(int i1:p){
            System.out.println(i1);
        }
    }
}
