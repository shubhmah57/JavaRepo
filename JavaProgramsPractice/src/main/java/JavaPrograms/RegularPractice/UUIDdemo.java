package JavaPrograms.RegularPractice;

import javax.xml.transform.sax.SAXSource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
class UUIDdemo 
{ 
    public static void main(String arg[])  
    { 
        // generating random UUID 
        UUID gfg1 = UUID.randomUUID(); 
        UUID gfg2 = UUID.randomUUID();
        System.out.println("UID is:" + gfg1.toString());
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        if(gfg1.equals(gfg2)) 
            System.out.println("both are equal"); 
        else
            System.out.println("both are not same"); 
    } 
} 