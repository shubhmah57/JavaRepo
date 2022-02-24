package JavaPrograms.DataStructures.String;

public class LongestSubstring {

    public static void main(String[] args) {
        String str = "bbbbb";
         int i =0;
        int j=1;
        String updatedString = "";

        while (j!=str.length()-1){
            updatedString = str.substring(i,j+1);
            System.out.println(updatedString.length());
            if(updatedString.contains(String.valueOf(str.charAt(j+1)))){
                i++;
                updatedString="";
            }

            j++;
        }
        System.out.println(updatedString);

    }
}
