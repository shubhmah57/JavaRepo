package JavaPrograms.DataStructures.String;

import org.jetbrains.annotations.NotNull;

public class GoldManEncodingDecoding {
    public static void main(String[] args) {
        String message = "opened";
        String key = "123";
        GoldManEncodingDecoding object = new GoldManEncodingDecoding();
        String encodedMessage = object.encode(message,key);
    }



    public String encode(@NotNull String message, String key) {

        StringBuilder sb = new StringBuilder();
        int i =0;

        for(char c: message.toCharArray()){

            if(i<key.length()){
                int value = key.charAt(i) - '0';
                for(int k=0;k<value;k++){
                    sb.append(c);
                }
                i++;
            }
            else{
                sb.append(message.substring(message.indexOf(c)));
                break;
            }
        }
         System.out.println("Encoded Message:" + sb);
        return sb.toString();
    }
}
