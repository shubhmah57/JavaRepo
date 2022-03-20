package JavaPrograms.DataStructures.DynamicProgramming;

public class BookOfCricket {
    public static void main(String[] args) {
        int totalDesiredScore = 20;
        int []scoresArray={3,5,10};
        int [][] table = new int[scoresArray.length+1][totalDesiredScore+1];
        for(int i =0; i <=scoresArray.length;i++){
            table[i][0]=1;
        }
        for(int i=1;i<=scoresArray.length;i++){
            for(int j=1; j<=totalDesiredScore;j++){
                if(scoresArray[i-1]>j){
                    table[i][j]= table[i-1][j];
                }
                else {
                    table[i][j]=table[i-1][j] + table[i][j-scoresArray[i-1]];
                }
            }
        }

        for(int i=0;i<=scoresArray.length;i++){
            for(int j=0;j<=totalDesiredScore;j++){
                System.out.print(table[i][j] +  " ");
            }
            System.out.println();
        }
        System.out.println("The total NUmber of ways:" + table[scoresArray.length][totalDesiredScore]);
    }
}
