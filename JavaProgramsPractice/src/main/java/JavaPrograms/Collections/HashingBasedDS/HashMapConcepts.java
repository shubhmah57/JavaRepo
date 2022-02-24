package JavaPrograms.Collections.HashingBasedDS;

import JavaPrograms.Collections.HashingBasedDS.POJOs.Car;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

    public static void main(String[] args) {

        Car car = new Car("Seletos",2020);
        Car car1 = new Car("Seletos",2019);

        Map<Car, String> carMap = new HashMap<>();
        System.out.println(car==car);
        carMap.put(car,"1");
        carMap.put(car,"2");
        carMap.put(car1,"4");

        System.out.println(carMap);

        System.out.println(carMap.size());

        System.out.println(carMap.get(car));

    }
}
