package JavaPrograms.DataStructures.SortingAlgos;

public class CountingSort {
    public static void main(String[] args) {
        int []a = {0,1,1,0,1,2,1,2,0,0,0,1};
        int count1=0,count2=0,count0=0;
        for (int k : a) {
            switch (k) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        System.out.println(count0 +  " " + count1 +  " " + count2);
        int j =0;
        while (count0>0){
            a[j]=0;
            count0--;
            j++;
        }
        while (count1>0){
            a[j]=1;
            count1--;
            j++;
        }
        while (count2>0){
            a[j]=2;
            count2--;
            j++;
        }

        for(int i : a){
            System.out.print(i+ " ");
        }
    }
}
