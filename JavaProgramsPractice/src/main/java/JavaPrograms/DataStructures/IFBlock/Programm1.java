package JavaPrograms.DataStructures.IFBlock;

public class Programm1 {
    public static void main(String[] args) {
        String str = "123";
        checkEqual(str);

    }

    private static String checkEqual(String str) {
        if(str.equals("1234")){
            return "YES";
        }
        else if(str.equals("12345")){
            return "NO";
        }
        else {
            return "NO";
        }
    }
}
