package JavaPrograms.DataStructures;/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class FindingMaximum {
	public static void main (String[] args) {
        String str = "babacbd";
        HashMap<Character, Integer> map = new HashMap<>();
        char abc[]= str.toCharArray();
        for(char ch: abc){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        int max = Integer.MAX_VALUE;
        Integer in = Collections.max(map.values());
        System.out.println(in);
        System.out.println(map);
	}
}