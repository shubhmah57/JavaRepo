package JavaPrograms.DataStructures.goldman;

public class Solution {



    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String d[] =s.split("\\.");
        String finalString = d[d.length-1];
        for(int i = d.length-2; i>=0;i--){
            finalString = finalString + "." +  d[i];
        }
        System.out.println(finalString);
    }
}
