package JavaPrograms.FileOperations;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "com.practice.Main" only if the class is public. */
class CNOTE
{
	public static void main (String[] args) throws Exception
	{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String no = br.readLine();
			if(null != no ){
				int number = Integer.parseInt(no);
				while(number > 0){
					int x=0, y=0, k =0, n=0, pages=0, cost=0, flag=0;
					String abc = br.readLine();
					if(null != abc){
						String []abcd = abc.split(" ");
						x= Integer.parseInt(abcd[0]);
						y= Integer.parseInt(abcd[1]);
						k= Integer.parseInt(abcd[2]);
						n= Integer.parseInt(abcd[3]);
					}
					for (int i=0;i<n;i++){
						String noteBooks = br.readLine();
						if(null!= noteBooks){
							String []noteBook = noteBooks.split(" ");
							pages= Integer.parseInt(noteBook[0]);
							cost=Integer.parseInt(noteBook[1]);
							if(pages>= (x-y) && k>= cost){
								flag =1;
								System.out.println("LuckyChef");
								break;
							}
						}
					}
					if(flag == 0){
						System.out.println("UnluckyChef");
					}
					number = number-1;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}