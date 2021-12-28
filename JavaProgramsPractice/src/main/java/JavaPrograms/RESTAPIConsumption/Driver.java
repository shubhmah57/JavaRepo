package JavaPrograms.RESTAPIConsumption;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

public class Driver {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String s =restTemplate.getForObject("http://shubham:62265//users/1/albums/",
                String.class);
        System.out.println(s);
        try{
            AlbumsResponseModel albumsResponseModel = new ObjectMapper().readValue(s, AlbumsResponseModel.class);
            System.out.println(albumsResponseModel);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
