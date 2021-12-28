package JavaPrograms.DataStructures;

import java.util.*;

public class MostKOccurneces {

    public static void main(String[] args){

        MostKOccurneces most = new MostKOccurneces();
        Integer a[] = {1,1,1,2,2,3};
        List<Integer> list = Arrays.asList(a);
        most.mostKOccurrences(list, 2);
    }

    public void mostKOccurrences(List<Integer> list, int k){

        HashMap<Integer, Integer> integerMap = new HashMap<>();
        for(int i: list){

            integerMap.put(i,integerMap.getOrDefault(i,0)+1);
        }


        List<Map.Entry<Integer, Integer>> mapsEntries = new LinkedList<>(integerMap.entrySet());

        Comparator<Map.Entry<Integer,Integer>> c = (Map.Entry<Integer, Integer> map1,
                                                    Map.Entry<Integer, Integer> map2)->{
          if(map1.getValue() > map2.getValue()){
              return  -1;
          }
          else if(map1.getValue() < map2.getValue()){
              return  1;
          }
          else {
              return  0;
          }
        };


        Collections.sort(mapsEntries, c);
//        mapsEntries.forEach(x-> System.out.println(x.getKey() + " " + x.getValue()));

        for(int i =0 ; i <k ;i ++){
            System.out.println(mapsEntries.get(i).getKey());
        }

    }
}
