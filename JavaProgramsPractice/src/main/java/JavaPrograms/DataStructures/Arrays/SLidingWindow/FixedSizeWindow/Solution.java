package JavaPrograms.DataStructures.Arrays.SLidingWindow.FixedSizeWindow;

import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i=0, j =0;
        int k = p.length();
        Map<Character, Integer> map1 = new HashMap<>();
        List<Integer> values = new ArrayList<>();
        char [] a1 = s.toCharArray();
        for(char a: p.toCharArray()){
            map1.put(a, map1.getOrDefault(a,0)+1);
        }
        int counter =map1.size();
        while(j<s.length()){
            if(map1.containsKey(a1[j])){
                map1.put(a1[j], map1.get(a1[j])-1);
                if(map1.get(a1[j])==0){
                    counter--;
                }
            }
            if(j-i+1==k){
                if(counter==0){
                    values.add(i);
                }
                if(map1.containsKey(a1[i])){
                    map1.put(a1[i],map1.get(a1[i])+1);
                    if(map1.get(a1[i])>=0){
                        counter++;
                    }
                }
                i++;
            }
            j++;
        }
        return values;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findAnagrams("cbaebabacd" ,
                "abc");
    }
}