package JavaPrograms.Collections.HashingBasedDS.POJOs;

public class Car {
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Car() {

    }

    public Car(String name, int modelYear) {
        this.name = name;
        this.modelYear = modelYear;
    }

    private int modelYear;

    public String getName() {
        return name;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }
}
