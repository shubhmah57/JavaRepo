package JavaPrograms.DataStructures.Arrays.SLidingWindow.VariableSizeWindow;


import java.util.*;

public class LongestSubstringWIthKChars {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        Map<Character, Integer> valuesMap = new HashMap<>();
        for(Character value: valuesMap.keySet()){

        }
        int i=0, j=0, max=0;
        while(j<s.length()){
            char a = s.charAt(j);
            if(valuesMap.containsKey(a)){
                valuesMap.put(a, valuesMap.get(a)+1);
            }
            else{
                valuesMap.put(a,1);
            }
            if(valuesMap.size()==k){
                max = Math.max(max, j-i+1);
                j++;
            }
            else if (valuesMap.size()>k){
                while(valuesMap.size()>k){
                    a = s.charAt(i);
                    valuesMap.put(a,valuesMap.get(a)-1);
                    if(valuesMap.get(a)==0){
                        valuesMap.remove(a);
                    }
                    i++;
                }
                j++;
            }
            else if(valuesMap.size()<k){
                j++;
            }
        }
        if(max ==0 ){
            return -1;
        }
        return max;
    }
}