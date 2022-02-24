package JavaPrograms.Collections.HashingBasedDS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeUnModiifiableList {
    public static  List<Integer> address = new ArrayList<>();
    int id;
    String name;
    private EmployeeUnModiifiableList(){

    }
    EmployeeUnModiifiableList(int id, String name){
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {

        try{
            address.add(1);
            address.add(2);
            address.add(1);
            address.add(2);
            address.add(1);
            address.add(2);
            address.add(1);
            address.add(2);
            address.add(1);
            address.add(2);
            /**
             * Unmodifiable List, its being used to make a Collection Immutable.
             */
            List<Integer> add = Collections.unmodifiableList(address);
            add.remove(1);

        }
        catch (Exception e){
            if(e instanceof UnsupportedOperationException){
                System.out.println("Unmodified List Can't be modified");
            }
        }
        HashMap<String, String> mapss = new HashMap<>();
        mapss.put("TV", "wwwe");
        mapss.put("TV", "www2e");

        System.out.println(mapss.get("TV"));
    }
}
