package JavaPrograms.Java8.StreamsPractice;

import java.util.Arrays;

public class StringStreams {
    public static void main(String[] args) {
        String str = "abcdfdf";
        System.out.println(str.chars().sum());

        /**
         * Printing distinct characters of a string
         */
        str.chars().distinct().mapToObj(e->(char)e).forEach(t-> System.out.println(t));
        /**
         * Finding sum of ASCII Values
         */
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(str1.chars().sum());


    }
}
