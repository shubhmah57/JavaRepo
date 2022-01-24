package JavaPrograms.DataStructures.MaximisingProfit;

import java.util.Arrays;

public class MaximumProfitSeatBook {
    public static void main(String[] args) {
        int[] seats = {2,3,4,5,1};
        int cost =0;
        int N =6;

        for(int i = 0 ; i <N;i++){
            Arrays.sort(seats);
            cost= cost + seats[seats.length-1];
            seats[seats.length-1]= seats[seats.length-1]-1;
        }
        System.out.println(cost);
    }
}
