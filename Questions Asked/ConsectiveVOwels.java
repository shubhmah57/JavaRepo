import java.util.*;
public class ConsectiveVOwels{

 public static void main(String[] args){
	
	String S = "ASEIOTHR";
	int result = -404;
	int count = 0;
	List<Character> vowelsList = new ArrayList<>();
	for(int i=0; i <S.length();i++){
		for(int j= i+1; j<S.length();j++){
		   if(S.charAt(i)=='A' || S.charAt(i) == 'E' || S.charAt(i) == 'I' || S.charAt(i) == 'O' || S.charAt(i) =='U'){
			  if(S.charAt(j)=='A' || S.charAt(j) == 'E' || S.charAt(j) == 'I' || S.charAt(j) == 'O' || S.charAt(j) =='U'){
				vowelsList.add(S.charAt(j));
				count = count +1;
				}
			  else{
				
					break;
				}	
			}
			else{
			break;
			}
		}
		result = Math.max(result,count);
		count =0;	
	}
		for(char p: vowelsList){
		  System.out.println(p);
			}
	System.out.println("The count:"+ result);
	}
}