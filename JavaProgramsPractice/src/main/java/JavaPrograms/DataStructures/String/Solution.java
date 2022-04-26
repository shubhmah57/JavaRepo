package JavaPrograms.DataStructures.String;

import JavaPrograms.Java8.StreamsPractice.Stream;

public class Solution {
    public String reverseVowels(String s) {
        int i =0;
        int j = s.length()-1;
        char a[] = s.toCharArray();
        while(i<j){
            if(a[i]=='a'||a[i]=='e'|| a[i]=='i'|| a[i]=='o'||a[i]=='u'){
                if(a[j]=='a'||a[j]=='e'||a[j]=='i'||a[j]=='o'||a[j]=='u'){
                    char temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        } 
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("leetcode"));
    }
}