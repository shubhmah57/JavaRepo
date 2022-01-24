package JavaPrograms.DataStructures.TwoDimensional;

public class LinearSearch {
    public static void main(String[] args) {
        int[][]a = {{1,2,3}, {4,5,6}};
        int element =6;
        for(int i =0; i<2;i++){
            for(int j =0; j<3;j++){
                if(a[i][j]==element){
                    System.out.println("Found!");
                    return;
                }
            }
        }

    }
}
