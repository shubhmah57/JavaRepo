package JavaPrograms.collections.HashingBasedDS;



import JavaPrograms.collections.HashingBasedDS.POJOs.Car;
import JavaPrograms.collections.HashingBasedDS.POJOs.Truck;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        EmployeeUnModiifiableList e1 = new EmployeeUnModiifiableList(1, "JOHN");
        e1.address.add(1);
        EmployeeUnModiifiableList e2 = new EmployeeUnModiifiableList(1, "JOHN");
        e2.address.add(1);
            if(e1.equals(e2)){
                System.out.println("TRUE");
            }
            else {
                System.out.println("FALSE");
            }
        HashMap<EmployeeUnModiifiableList, EmployeeUnModiifiableList> employeeHashMap = new HashMap<>();
        employeeHashMap.put(e1, e1);
        System.out.println("TreeSetPractice when e2 is added" + employeeHashMap.get(e2));
        System.out.println(employeeHashMap.size());
        employeeHashMap.put(e2, e2);
        System.out.println(employeeHashMap.size());
        System.out.println(employeeHashMap.get(e2));
        Car car = new Car();
        car.setName("i20");
        Truck truck = new Truck();
        truck.setModelYear(2012);
        HashMap<Car, Truck> vehicleHashMap = new HashMap<>();
        vehicleHashMap.put(car, truck);

        System.out.println(vehicleHashMap.get(new Car()));
    }
}
