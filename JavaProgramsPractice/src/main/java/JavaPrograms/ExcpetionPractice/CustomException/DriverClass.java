package JavaPrograms.ExcpetionPractice.CustomException;

import java.util.Scanner;

public class DriverClass {

    public void printPage(String number){
        if(number.equals("10")){
            throw  new PageNotFoundException(number+"Not Found!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String page = scanner.next();
        DriverClass driverClass = new DriverClass();
        driverClass.printPage(page);
    }
}
