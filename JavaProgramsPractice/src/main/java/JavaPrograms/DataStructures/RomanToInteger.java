package JavaPrograms.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    
    char inputArray[];
    int sum, pointer, length;
    Map<Character, Integer> maps;
    public int romanToInt(String s) {
        initializeMap();
        inputArray = s.toCharArray();
        length = inputArray.length;
        while(pointer < length-1){
                pointer = calculateSum(maps.get(inputArray[pointer]),maps.get(inputArray[pointer + 1]), pointer);
        }
        if(pointer >= length){
            return  sum;
        }
        else {
            return sum + maps.get(inputArray[pointer]);
        }
    }
    protected void initializeMap(){
        maps = new HashMap<Character, Integer>();
        maps.put('I', 1);
        maps.put('V', 5);
        maps.put('X', 10);
        maps.put('L', 50);
        maps.put('C', 100);
        maps.put('D', 500);
        maps.put('M', 1000);
    }
    public int calculateSum(int a, int b, int pointer){
        if(a >= b){
            sum = sum + a;       
            pointer++;
        }
        else{
            sum = sum + (b-a);
            pointer = pointer + 2;
        }
        return pointer;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }
}