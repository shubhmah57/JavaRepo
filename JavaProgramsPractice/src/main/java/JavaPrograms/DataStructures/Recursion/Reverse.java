package JavaPrograms.DataStructures.Recursion;



public class Reverse {
    public static void main(String[] args) {
        Reverse rev = new Reverse();
        String s = "Shubham";
        rev.performReverse(s, 0,s.length()-1 );
    }

    private void performReverse(String str, int i, int j) {
        if(i>j){
            System.out.println(str);
            return;
        }

        str = swap(str,i,j);
        i++;j--;
    }

    private String swap(String s, int i , int j) {
        char c[] = s.toCharArray();
        char temp = c[i];
        c[i]=c[j];
        c[j]=temp;
        return String.valueOf(c);
    }

}
