package JavaPrograms.DataStructures;


public class MaxVowelsEff {

    public static void main(String[] args) {
        String s = "AAAEEWQQSSFFGGAEIOUAEIOU";
        int result = -404;
        int count = 0;
        char ch[] = s.toCharArray();
        for(int i = 0  ; i < ch.length; i++){
            if(isVowel(ch[i])){
                count++;
            }
            else{
                result = Math.max(result, count);
                count =0;
            }
        }
        System.out.println("Maximum Length:" + result);
    }

    static boolean isVowel(char c){
        return (c== 'A' || c =='E' || c == 'I' || c=='O' || c=='U');
    }
}
