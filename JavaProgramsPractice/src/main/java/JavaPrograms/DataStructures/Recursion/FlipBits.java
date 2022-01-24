package JavaPrograms.DataStructures.Recursion;

public class FlipBits {
    String newValue="";
    public static void main(String[] args) {
        FlipBits flipBits = new FlipBits();
        int i =2, k =3;
        String value = flipBits.calculateResult(i);
        System.out.println(value);
        System.out.println(value.charAt(k));
    }

    private String  calculateResult(int i) {
        if(i==0){
            return "0";
        }
        String value = calculateResult(i-1);
        newValue = "";
        for(int k =0; k < value.length(); k++){
            if(value.charAt(k)=='0'){
                newValue = newValue+"1";
            }
            if(value.charAt(k)=='1'){
                newValue = newValue+"0";
            }
        }

        return newValue+"0"+value;
    }


}
