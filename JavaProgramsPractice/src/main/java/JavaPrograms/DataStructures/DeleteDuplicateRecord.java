package JavaPrograms.DataStructures;

import java.util.TreeMap;

public class DeleteDuplicateRecord {
    public static void main(String[] args) {
        int a [] = {12, 34, 12, 534, 123, 12, 33,};
        int j = 0;
        TreeMap<Integer, Integer>  maps = new TreeMap<>();
        for(int i :a){
            if(!maps.containsKey(i)){
                maps.put(i, i);
            }
        }

        maps.entrySet().stream().forEach(e-> System.out.println(e.getKey()));
        Integer [] arr = new Integer[maps.size()];
        maps.entrySet().toArray(arr);
        System.out.println("---------------------");
        for(Integer k : arr){
            System.out.println(k);
        }



    }
}
