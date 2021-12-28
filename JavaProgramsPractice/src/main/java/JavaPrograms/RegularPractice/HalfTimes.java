package JavaPrograms.RegularPractice;/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class HalfTimes {

    public static void main (String[] args) {
        int array[]= {1,8,8,5,6,6,7,7,8,8,8,8,8,8,8};

        List<Integer> numbersList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            numbersList.add(array[i]);
        }

        /*numbersList.stream().forEach(x->System.out.println(x + " Hello"));*/
        int size = array.length;

        Map<Integer, Integer> integersMap = new HashMap<>();
        int count = 0, finalVariable=0;

        for(int i = 0; i < array.length; i++){
            if(count >=size/2){
                finalVariable = array[i];
                break;
            }
            else if(integersMap.containsKey(array[i])){
                count = integersMap.get(array[i]);
                integersMap.put(array[i], count+1);
            }
            else{
                integersMap.put(array[i], 1);
            }
        }
        /*System.out.println(integersMap);*/
        System.out.println("The variable is :"+ finalVariable );
    }



}