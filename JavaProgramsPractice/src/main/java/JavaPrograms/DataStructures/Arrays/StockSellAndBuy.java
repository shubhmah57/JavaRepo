package JavaPrograms.DataStructures.Arrays;

public class StockSellAndBuy {
    public static void main(String[] args) {
        int []a = {7,1,5,3,6,4};
        int min = a[0];
        int res = 0;
        for(int i =1; i <a.length;i++){
            int difference = a[i] -min;
            res = Math.max(difference,res);
            min = Math.min(min, a[i]);
        }

        System.out.println(res);
    }

    public static class SecondSmallest {
        public static void main(String[] args) {
            int ar[] = {6,7,1,3,4,8};
            int smallest = Integer.MAX_VALUE;
            for(int i = 0; i < ar.length; i++){
                if(ar[i] < smallest){
                    smallest = ar[i];
                }
            }
            System.out.println(smallest);
            int smallest1= Integer.MAX_VALUE;
            for(int i = 0 ; i <ar.length; i++){
                if(ar[i] != smallest){
                    if(ar[i] < smallest1){
                        smallest1 = ar[i];
                    }
                }
            }
            System.out.println(smallest1);
        }
    }
}
