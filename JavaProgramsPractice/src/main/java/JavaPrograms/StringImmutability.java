package JavaPrograms;

public class StringImmutability {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.hashCode());
        str = str.replace('e','f');
        String str1 = "hello";
        System.out.println(str1.hashCode());
        System.out.println(str);
    }
}
