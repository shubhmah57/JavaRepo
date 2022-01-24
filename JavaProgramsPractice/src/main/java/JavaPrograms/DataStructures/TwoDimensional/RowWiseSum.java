package JavaPrograms.DataStructures.TwoDimensional;

public class RowWiseSum {
    public static void main(String[] args) {
        int [][]a = {{4,5,6},{9,9,1},{4,5,1}};
        int sum=0;
        for(int i =0; i <a.length;i++){
            for(int j=0;j<a.length;j++){
                sum = sum + a[i][j];
            }
            System.out.println("Sum:" + sum);
            sum=0;
        }
    }
}
