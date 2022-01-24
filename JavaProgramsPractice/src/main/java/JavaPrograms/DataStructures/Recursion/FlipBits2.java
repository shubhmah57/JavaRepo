package JavaPrograms.DataStructures.Recursion;

public class FlipBits2 {
    String newValue="";
    public char findKthBit(int n, int k) {
        FlipBits2 sol = new FlipBits2();
        String val =sol.findCharacter(n);
        return val.charAt(k-1);
    }

    private String findCharacter(int n){
        if(n==1){
            return "0";
        }
        System.out.println("Iterating...");
        String value= findCharacter(n-1);
        newValue="";
        for(int i =0; i<value.length();i++){
            if(value.charAt(i)=='0'){
                newValue = newValue+"1";
            }
            if(value.charAt(i)=='1'){
                newValue = newValue+"0";
            }
        }
        StringBuilder sb = new StringBuilder(newValue);

        return value+"1"+sb.reverse();
    }

    public static void main(String[] args) {
        FlipBits2 flipBits2 = new FlipBits2();
        flipBits2.findKthBit(20,1048575);
    }
}