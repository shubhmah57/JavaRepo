package JavaPrograms.DataStructures;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "com.practice.Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws Exception
	{
            		// your code goes here
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String nos = br.readLine();
            int elephants  =0;
            int candies =0;
            if (null != nos) {
                int n = Integer.parseInt(nos);
                int sum = 0;
                while (n > 0) {
                    String abc = br.readLine();
                    String[] a = abc.split(" ");
                    if (a.length > 0) {
                        elephants = Integer.parseInt(a[0]);
                        candies = Integer.parseInt(a[1]);
                        String numbers = br.readLine();
                        String[] number = numbers.split(" ");
                        int aa[] = new int[number.length];
                        for (int i = 0; i < aa.length; i++) {
                            aa[i] = Integer.parseInt(number[i]);
                            sum = sum + aa[i];
                        }
                    } else {
                        System.out.println("No");
                    }
                    if(sum> candies){
                        System.out.println("No");
                    }
                    else{
                        System.out.println("Yes");
                    }
                    n = n - 1;
                }
            }
        }
	catch(Exception e){
	    e.printStackTrace();
	}
        }
	}

