package JavaPrograms.Anonymus;

public class DriverClass {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() {
            @Override
            public String blowHorn() {
                return "Press H to Blow Horn!";
            }
        };
        System.out.println(vehicle.blowHorn());
    }


}
