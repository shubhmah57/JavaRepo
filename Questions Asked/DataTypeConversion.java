import java.util.*;

public class DataTypeConversion{
    public static void main(String[] args){
      List<Integer> arr = new ArrayList<>();
      arr.add(1);
      arr.add(2);
      arr.add(1);
      arr.add(2);
      arr.add(1);
      arr.add(3);
      arr.add(2);
      Integer [] a = new Integer[arr.size()];
      a = arr.toArray(a);
      for (int i : a){
        System.out.println(i);
      }

      for(int i : arr){
        System.out.println(i);
      }
    }
}
