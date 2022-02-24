package JavaPrograms.DataStructures.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] a = {0,1,0,1,1,1,0,1,1,0,1};
//        int pointer =0;
//        for(int i =0; i <a.length;i++){
//            if(a[i]!=0){
//                a[pointer++]=a[i];
//            }
//        }
//        while (pointer!=a.length){
//            a[pointer++]=0;
//        }
//        for(int p: a){
//            System.out.println(p);
//        }
        int size=0;
        for(int i =0; i <a.length;i++){
            if(a[i]==1){
                size++;
                continue;
            }
            int temp = a[i-size];
            a[i-size] = a[i];
            a[i]=temp;
        }
        for (int i =0; i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
