package JavaPrograms.ExcpetionPractice.CustomException;

public class PageNotFoundException extends RuntimeException{
    PageNotFoundException(String message){
        System.out.println(message);
    }
}
