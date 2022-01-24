package JavaPrograms.ExcpetionPractice.CustomException;

public class CheckInputException extends Exception{
    CheckInputException(String message){
        System.out.println(message);
    }
}
