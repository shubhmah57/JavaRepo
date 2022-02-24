package JavaPrograms.DataStructures.String;

public class RandomStrings {
    public static void main(String[] args) {
        String Alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"  + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder();
        for(int i =0 ;i<5;i++){
            double rand = Math.random();
            System.out.println(rand);
            int chr = Alphanumeric.charAt(i);
            System.out.println(chr);
            int index = (int)(Alphanumeric.charAt(i)*rand);
            System.out.println(index);
            sb.append(Alphanumeric.charAt(index));
        }
        System.out.println(sb.toString());
    }
}
