package JavaPrograms.NestedClass;


import JavaPrograms.inheritancePractice.TypeVisibility.package1.A;

interface Age{
    int x= 21;
    void getAge();
}

interface Gender{
    String  getGender();
    void setGender(String s);
}
public class AnnonymusClass {

    public static void main(String[] args) {

        Age object = new Age() {
            @Override
            public void getAge() {
                System.out.println("The Age is:" + x);
            }
        };

        Gender gender = new Gender() {
            private String type;

            @Override
            public String getGender() {
                return type;
            }

            @Override
            public void setGender(String s) {
                this.type =s;
            }
        };

        gender.setGender("MALE");
        object.getAge();
        System.out.println(gender.getGender());
    }
}
