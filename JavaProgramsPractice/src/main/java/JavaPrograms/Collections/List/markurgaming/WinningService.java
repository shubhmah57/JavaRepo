package JavaPrograms.Collections.List.markurgaming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WinningService {

    public static void main(String[] args) {
        Winning winning = new Winning();
        winning.setId(1);
        winning.setScore(10);
        Winning winning1 = new Winning();
        winning1.setId(1);
        winning1.setScore(30);
        Winning winning2 = new Winning();
        winning2.setId(1);
        winning2.setScore(70);
        Winning winning3 = new Winning();
        winning3.setId(2);
        winning3.setScore(90);
        Winning winning4 = new Winning();
        winning4.setId(2);
        winning4.setScore(50);
        Winning winning5 = new Winning();
        winning5.setId(3);
        winning5.setScore(20);
        Winning winning6 = new Winning();
        winning6.setId(3);
        winning6.setScore(80);
        Winning winning7 = new Winning();
        winning7.setId(3);
        winning7.setScore(120);
        Winning winning8 = new Winning();
        winning8.setId(7);
        winning8.setScore(20);
        List<Winning> winningList = new ArrayList<>();
        winningList.add(winning1);
        winningList.add(winning2);
        winningList.add(winning3);
        winningList.add(winning4);
        winningList.add(winning5);
        winningList.add(winning6);
        winningList.add(winning7);
        winningList.add(winning8);
        winningList.stream().forEach(s-> System.out.println(s.getId() + ":" + s.getScore()));
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        for(Winning winnings: winningList){
            if(integerHashMap.get(winnings.getId())==null || winnings.getScore() >integerHashMap.get(winnings.getId())){
                integerHashMap.put(winnings.getId(), winnings.getScore());
            }
        }
        System.out.println("--------------------");
        integerHashMap.forEach((a,b)-> System.out.println(a + ":" + b));

    }
}
