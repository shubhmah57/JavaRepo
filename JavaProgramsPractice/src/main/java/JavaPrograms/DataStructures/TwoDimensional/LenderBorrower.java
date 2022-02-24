package JavaPrograms.DataStructures.TwoDimensional;

import java.util.*;

public class LenderBorrower {
    public static void main(String[] args) {
        List<String> s1 = Arrays.asList("Alex", "Blake","2");
        List<String> s2 = Arrays.asList("Blake", "Alex","5");
        List<String> s3 = Arrays.asList("Casy", "Blake","7");
        List<String> s4 = Arrays.asList("Alex", "Casy","5");


        List<List<String>> debts = new ArrayList<>();
        debts.add(s1);
        debts.add(s2);
        debts.add(s3);
        debts.add(s4);
        Map<String, List<Integer>> map = new HashMap<>();
        for(List<String> debt: debts){
            String borrowerName = debt.get(0);
            String lenderName = debt.get(1);
            Integer amount = Integer.valueOf(debt.get(2));
            if(map.containsKey(borrowerName)){
                List<Integer> ledger = map.get(borrowerName);
                ledger.add(-amount);
                map.put(borrowerName, ledger);
            }
            else {
                List<Integer> ledger = new ArrayList<>();
                ledger.add(-amount);
                map.put(borrowerName,ledger);
            }

            if(map.containsKey(lenderName)){
                List<Integer> ledger = map.get(lenderName);
                ledger.add(amount);
                map.put(lenderName, ledger);
            }
            else {
                List<Integer> ledger = new ArrayList<>();
                ledger.add(amount);
                map.put(lenderName,ledger);
            }
        }

        System.out.println(map);
        int max = Integer.MIN_VALUE;

        for(Map.Entry<String, List<Integer>> stringListMap: map.entrySet()){
            int value = stringListMap.
                            getValue()
                            .stream()
                            .reduce(0,(a,b)->a+b);
            System.out.println(value);
        }
    }
}

