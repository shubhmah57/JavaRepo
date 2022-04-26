package JavaPrograms.DataStructures.String;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] strs = {"dog","racecar","car"};
        Map<Character, Integer> valuesCount = new HashMap<>();
        for(int i = 0; i<strs.length;i++){
            String s = strs[i];
            for(int j=0; j< s.length();j++){
                if(valuesCount.containsKey(s.charAt(j))){
                    valuesCount.put(s.charAt(j),valuesCount.get(s.charAt(j))+1);
                }
                else{
                    valuesCount.put(s.charAt(j),1);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        valuesCount.forEach((x,y)->{
            if(y==strs.length){
                sb.append(x);
            }
        });
        System.out.println(sb);
    }
}
