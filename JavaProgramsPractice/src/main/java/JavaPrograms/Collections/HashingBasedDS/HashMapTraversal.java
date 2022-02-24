package JavaPrograms.Collections.HashingBasedDS;



import JavaPrograms.Collections.HashingBasedDS.POJOs.Car;
import JavaPrograms.Collections.HashingBasedDS.POJOs.Truck;

import java.util.HashMap;
import java.util.Map;

public class HashMapTraversal {


    public static void main(String[] args) {
        HashMap<Car, Truck> vehiclesMap = initializeAndPopulateMap();
        traverseMap(vehiclesMap);
    }

    private static void traverseMap(HashMap<Car, Truck> vehiclesMap) {
        /**
         * Traditional Way
         */
        for (Map.Entry<Car,Truck> maps: vehiclesMap.entrySet()){
            System.out.println("The Values are:" + maps.getKey().getName()   + " "
                                      + maps.getValue().getName());
        }
        System.out.println("---------------------------------------Using Streams--------------------");
        /**
         * Using Streams
         */
        vehiclesMap.entrySet().stream().forEach(s->System.out.println(s.getKey().getName() + " " +s.getValue().getName()));
    }

    private static HashMap<Car, Truck> initializeAndPopulateMap() {
        HashMap<Car, Truck> vehiclesMap = new HashMap<>();
        Car car = new Car();
        car.setName("Mercdez");
        car.setModelYear(2008);
        Truck truck = new Truck();
        truck.setName("Ashok Leyland");
        truck.setModelYear(2008);
        Car car1 = new Car();
        car1.setName("AUDI");
        car1.setModelYear(2010);
        Truck truck1 = new Truck();
        truck1.setName("Tatra");
        truck1.setModelYear(2010);
        vehiclesMap.put(car,truck);
        vehiclesMap.put(car1,truck1);
        return vehiclesMap;
    }
}
