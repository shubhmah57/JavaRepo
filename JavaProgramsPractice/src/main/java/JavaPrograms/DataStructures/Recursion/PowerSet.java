package JavaPrograms.DataStructures.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    int totalSets =0;
    public static void main(String[] args) {
        int []a = {1,2,3};
        PowerSet powerSet = new PowerSet();
        List<String> powerSetList = new ArrayList<>();
        powerSet.printPowerSet(a,0,"");
        System.out.println(powerSet.totalSets);
    }

    private void printPowerSet(int[] a, int i, String s) {
        if(i==a.length){
            totalSets++;
            System.out.println(s);
            return;
        }

        printPowerSet(a,i+1,s+a[i]);
        printPowerSet(a,i+1, s);
    }

}
