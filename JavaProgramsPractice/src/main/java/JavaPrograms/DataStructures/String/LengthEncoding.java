package JavaPrograms.DataStructures.String;/*package whatever //do not write package name here */

import java.util.*;
import java.util.stream.Stream;

class LengthEncoding {
	public static void main (String[] args) {
		String str = "wwwwaaadexxxxxxghghhg";
		StringBuilder sb = new StringBuilder();
		Map<Character,Integer> map = new HashMap<>();
		for(int i =0; i < str.length();i++){
		    if(map.containsKey(str.charAt(i))){
		        map.put(str.charAt(i), map.get(str.charAt(i))+1);
		    }
		    else{
		        if(map.size()>0){
					map.forEach((k,v)-> sb.append(k).append(v));
		            map.clear();
		        }
		        map.put(str.charAt(i),1);
		    }
		}
		map.forEach((k,v)->sb.append(k).append(v));
		Stream.of(sb).forEach(System.out::println);
	}
}