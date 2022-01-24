package JavaPrograms.DataStructures.TwoDimensional;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i <3;i++){
            for (int j=0;j<3;j++){
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("The output row wise:");
        for (int row=0;row<3;row++){
            for(int column =0; column<3;column++){
                System.out.print(a[row][column]+ "\t");
            }
            System.out.println();
        }

        System.out.println("THe output: column wise");
        for(int column =0; column <3;column++){
            for (int row=0;row<3;row++){
                System.out.print(a[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
