package JavaPrograms.Java8.StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class Stream {
    private String customerName;
    private int points;

    Stream(String name, int point){
        this.customerName=name;
        this.points=point;
    }
    public static void main(String[] args) {
        Stream stream = new Stream("Shubham", 9000);
        Stream stream1 = new Stream("Shubham", 2000);
        Stream stream2 = new Stream("Shubham", 3000);
        Stream stream3 = new Stream("Shubham", 5000);
        Stream stream4 = new Stream("Shubham", 6000);
        Stream stream5 = new Stream("Shubham", 7000);
        Stream stream6 = new Stream("Shubham", 8000);
        List<Stream> list = Arrays.asList(stream, stream1, stream2, stream3,stream4,stream5,stream6 );
         list.stream().filter(c->c.points>3000).forEach(p-> System.out.println(p.points));
    }}

