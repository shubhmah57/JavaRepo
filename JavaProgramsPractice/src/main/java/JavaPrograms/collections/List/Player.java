package JavaPrograms.collections.List;

import java.util.*;

public class Player {

    private int ranking;
    private  String name;

    Player(int ranking, String name){
        this.ranking = ranking;
        this.name = name;
    }
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "Abhishek");
        Player player2 = new Player(67, "XYZ");
        Player player3 = new Player(45, "ZYX");
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);
        Comparator<Player> playerRankComparator = (pl, p2)-> (pl.ranking >p2.getRanking())?-1:(pl.getRanking() <p2.getRanking())?1:0;
        Comparator<Player> playerNameComparator = (p1, p2) -> {
          if(p1.getName().compareTo(p2.getName()) >0){
              return -1;
          }
          if(p1.getName().compareTo(p2.getName())<0){
              return 1;
          }
          return 0;
        };

        Collections.sort(footballTeam, playerRankComparator);
        System.out.println("---------------------------------------");
        System.out.println("Sorted on Basis of Rank");
        for(Player player: footballTeam){
            System.out.println(player.getRanking() + " " + player.getName());
        }
        System.out.println("---------------------------------------");
        System.out.println("Sorted on Basis of Names");
        Collections.sort(footballTeam, playerNameComparator);
        /*for(Player player: footballTeam){
            System.out.println(player.getRanking() + " " + player.getName());
        }*/
        /**
         * Only One way to Compare the Objects..
         * using comparable by implementing comparable interface with that class.
         * The approach used below will not allow us to COllections.sort() method with comparable.
         */
        player1.comparisonUsingComparable();

        System.out.println("ComparableOnName-----------");
        for(Player player: footballTeam){
            System.out.println(player.getRanking() + " " + player.getName());
        }
        player2.comparisonUsingCompatableOnRank();
        System.out.println("Comparable-----------");
        for(Player player: footballTeam){
            System.out.println(player.getRanking() + " " + player.getName());
        }
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public  String  getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void comparisonUsingComparable(){
        Comparable<Player> comparable = (p1)->this.getName().compareTo(p1.getName());
    }

    public void  comparisonUsingCompatableOnRank(){
        Comparable<Player> comparable = (x)->{
            if(this.getRanking()> x.getRanking()){
                return 1;
            }
            if(this.getRanking()< x.getRanking()){
                return -1;
            }
            return 0;
        };
    }

}


