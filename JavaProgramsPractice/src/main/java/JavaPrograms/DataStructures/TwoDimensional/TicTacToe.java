package JavaPrograms.DataStructures.TwoDimensional;

public class TicTacToe {
    public static void main(String[] args) {
        int [][] a = {{1,1,1},{4,5,6},{1,8,9}};
        System.out.println("----------");
        for(int i[]:a){
            for(int j: i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("----------");
        int flag =0;
        for(int p=0; p<3;p++){
            for(int j=0; j<3;j++){
                    if(a[p][j]==1){
                        flag=1;
                    }
                    else {
                        flag=0;
                    }
            }
        }


    }
}
