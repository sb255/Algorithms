/*Checking whether a word is a Palindrome or not*/

import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int counter = 0; 
        int len = (int)A.length()/2; 


        for(int i=0, j=A.length(); i<A.length()/2; i++, j--){
            if(A.charAt(i)==A.charAt(j-1)){
                counter++; 
            }
        }

        if(len==counter){
            System.out.print("Yes");
        }

        if(len!=counter){
            System.out.print("No");

        }
        
    }

}




