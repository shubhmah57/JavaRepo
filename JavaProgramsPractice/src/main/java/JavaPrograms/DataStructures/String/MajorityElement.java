package JavaPrograms.DataStructures.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String str = bufferedReader.readLine();
        String[] strr = str.trim().split(" ");
        int[] a = new int[strr.length];
        for (int i = 0; i < strr.length; i++) {
            a[i] = Integer.parseInt(strr[i]);
        }
        if (count(a, strr.length) >0)
            System.out.println(count(a, strr.length));
    }

    public static int count(int[] q, int n) {
        HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for (int i : q) {
            if (maps.containsKey(i)) {
                if (n / 2 > maps.get(i))
                    maps.put(i, maps.get(i) + 1);
                else {
                    return i;
                }
            } else {
                maps.put(i, 1);
            }
        }
        return -1;
    }
}

