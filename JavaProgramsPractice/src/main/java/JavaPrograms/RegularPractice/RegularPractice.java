package JavaPrograms.RegularPractice;

import org.joda.time.DateTime;

import javax.management.RuntimeErrorException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class RegularPractice {

    public static void main(String[] args) {
        String s = null;
        Optional<String> s1;
        s1=Optional.ofNullable(s);
        s1.ifPresent( p-> System.out.println(p));

        Optional.ofNullable(s).ifPresent(sa-> System.out.println("dfAd"+ sa));

        Optional.ofNullable(s).filter(a->!a.isEmpty()).ifPresent(sa-> System.out.println("dfd"+ sa));

        switch (4){
            case 1:
            case 2:
            case 3:
                System.out.println("KKKKKK");
        }
        List<String> a = new ArrayList<>();
        a.add("bb");
        checkSomething(a);
        System.out.println(a);
        int x= 10;
        x= 5;

        System.out.println(print(1));
        for ( int i =0 ; i < 10; i++){
            ;
            System.out.println("h");
        }
        System.out.println("apple".compareTo("banana"));
        if("abcd" instanceof String){

        }

        Boolean boolw = Boolean.TRUE;
        if(Boolean.TRUE.equals(boolw)){
            System.out.println("True");
        }
        else {
            System.out.println("FALSe");
        }

        //Joda Practice
        Date billDate =new Date(2020, 3, 20);
        DateTime dateTime = new DateTime(billDate);
        DateTime dateTime1 =dateTime.minusMonths(6);
        System.out.println("MOnth usnig joda" + dateTime1.getMonthOfYear());

        String s12 = "abcd";
        String s13 = "abcc";
        System.out.println(s12.substring(0,1).toUpperCase() + s12.substring(1,s12.length()));
        if(s12.compareTo(s13)>0){

        }

    }

    public  static void checkSomething(List<String> a){
        a.add("rr");
    }

    static Exception print(int i){
        if(i > 0){
            return new Exception();
        }
        else {
            return new RuntimeErrorException(new Error());
        }
    }


}


