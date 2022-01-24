import java.util.*;

class Inversions{
    
    public static void main (String[] args) {
        
      List<Integer> arr = new ArrayList<>();
    //   arr.add(8);
    //   arr.add(4);
    //   arr.add(2);
    //   arr.add(1);
      arr.add(3);
      arr.add(1);
      arr.add(2);
      int count =0;
      for(int i=0;i<arr.size()-1;i++){
          int j = i+1;
          while(j<arr.size()){
              if(arr.get(i)>arr.get(j)){
                  count++;
              }
		j++;
          }
      }
      System.out.println("Inversions:" + count);
    }
}