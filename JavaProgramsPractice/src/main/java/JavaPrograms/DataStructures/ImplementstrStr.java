package JavaPrograms.DataStructures;

public class ImplementstrStr {
    public static void main(String[] args) {

        ImplementstrStr implementstrStr = new ImplementstrStr();
        System.out.println(implementstrStr.strStr("heelo", "el"));
    }

    public int strStr(String hayStack, String needle){
        if(hayStack.length() >= 0 && needle.length() >= 1){
            int i =0;
            int j = needle.length();
            while (j<=hayStack.length()){
                if(hayStack.substring(i,j).equals(needle)){
                    return i;
                }
                else {
                    i++;j++;
                }
            }
            return -1;
        }
        else{
            return 0;
        }

    }
}
