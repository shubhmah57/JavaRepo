package JavaPrograms.Java8.StreamsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        String s1 = "Abcaaaabghjngaaabv";
        Stream.of(s1).distinct().forEach(System.out::println);
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i < s1.length(); i++){

            if(!map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),1);
            }
        }
        String s2 = null;
        int j =0;
        char []a = s1.toCharArray();
        Arrays.sort(a);
        for(int i = 1; i < a.length; i++){
            if(a[i] != a[j]){
                j++;
                a[j] = a[i];
            }
        }
        for(int i = 0; i < j; i++){
            System.out.println(a[i]);
        }

        String s21= "AbcaaaaTechMbghjngaaabv";
        String se = s21.replace("TechM","");
        System.out.println(se);



    }
}
