package JavaPrograms.DataStructures.IFBlock;

public class Programm2 {
    public static void main(String[] args) {
        int a[] = {9,21,2123,32,44};
        System.out.println(checkSomething(a));
    }

    private static String checkSomething(int[] a) {
        for(int i=0; i<a.length;i++){
            if(a[i]==21){
                return "YES";
            }
            else {
                return "NO";
            }
        }
        System.out.println("Hello");
        return "DO";
    }
}
