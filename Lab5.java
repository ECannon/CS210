//This program sorts strings by length, if strings are the same length then it sorts them lexicographically.

import java.util.Scanner;

public class Lab5 {
    public static void main(String args[]) { 
    	
        Scanner sc = new Scanner(System.in);
        
        String[] ar1 =new String[Integer.parseInt(sc.nextLine())];
        
        for(int i = 0; i < ar1.length; i++) {
            ar1[i] = sc.nextLine();
        }

        for(int i = 0; i < ar1.length; i++) {
        	
            String temp="";

            for(int j = 0; j < ar1.length-1; j++) {

                if(ar1[j].length() > ar1[j+1].length()) {
                	
                    temp = ar1[j+1];                     
                    ar1[j+1] = ar1[j];                    
                    ar1[j] = temp;                       

                } else if(ar1[j].length() == ar1[j+1].length()) {   
                	
                    if(ar1[j].compareToIgnoreCase(ar1[j+1]) > 0) {   
                    	
                        temp = ar1[j+1];
                        ar1[j+1] = ar1[j];
                        ar1[j] = temp;
                    }
                }
            }
        }

        for(String i : ar1) System.out.print(i+" ");

    }
}