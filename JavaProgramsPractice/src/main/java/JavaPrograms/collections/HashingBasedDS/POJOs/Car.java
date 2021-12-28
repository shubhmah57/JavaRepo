package JavaPrograms.collections.HashingBasedDS.POJOs;

public class Car {
    public void setName(String name) {
        this.name = name;
    }

    private String name;
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
}
