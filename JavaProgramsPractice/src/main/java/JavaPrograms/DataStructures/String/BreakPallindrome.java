package JavaPrograms.DataStructures.String;

public class BreakPallindrome {
    public static void main(String[] args) {
        String palindrome = "abccba";
        char [] chars = palindrome.toCharArray();
        for(int i=0; i<chars.length;i++){
            if(chars[i]>'a'){
                chars[i]='a';
                break;
            }
        }
        System.out.println(String.valueOf(chars));
    }

}
