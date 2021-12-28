package JavaPrograms.RegularPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.stream.Stream;

public class VariableConversion {
	
	public static void main(String[] args) throws IOException {
		TreeMap<String, String> map = new TreeMap<>();

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String str = bufferedReader.readLine();
		System.out.println("CamelCase " + camelCasing(str));
		System.out.println("NonCamelCase " + noCamelCasing(camelCasing(str)));
	}
	public static String camelCasing(String str1){
		String[] fin = str1.split("_");
		String strr= fin[0];
		for(int i =1; i< fin.length; i++){
			strr = strr + upperCase(fin[i]);
		}
		return strr;
	}
	
	
	public static String noCamelCasing(String str){
		String fin=" ";
		int j =0;
		for(int i = 0 ; i< str.length();){
			char ch[] = str.toCharArray();
			if(ch[i] < 'a' ){
				String strr = str.substring(0,i);
				String strrr = str.substring(i,ch.length);
				fin = strr + "_" + lowerCase(strrr);
				str = fin;
				i= i+2;
			}
			else{
				i=i+1;
			}
		}
		return fin;
	}
	
	public static String lowerCase(String abc){
		char [] cha = null;
		if(null != abc && abc.length()!= 0){
			cha = abc.toCharArray();
			cha[0] = Character.toLowerCase(cha[0]);
		}
		return new String(cha);	
		}
	public static String upperCase(String abc){
		char [] charr= null;
		if(null != abc && abc.length()!=0){
			charr=abc.toCharArray();
			charr[0] = Character.toUpperCase(charr[0]);
		}
		return new String(charr);
	}
}
 