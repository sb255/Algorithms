/*Checking whether first String is lexicographically greater than String B*/
/*Input: Hello World*/

import java.io.*;
import java.util.*;

public class Lexicon {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(compareWords(A,B)); 

    }

    static String compareWords(String a, String b){
        if(a.length()<=b.length()){
            for(int i=0,j=0; i<a.length(); i++, j++){
                if(a.toLowerCase().charAt(i)>b.toLowerCase().charAt(j)){
                    return "Yes";
                }
                else {
                    return "No";
                }
            }
        }

        else {
            for(int i=0,j=0; i<b.length(); i++, j++){
                if(b.toLowerCase().charAt(i)>a.toLowerCase().charAt(j)){
                    return "No";
                }
                else {
                    return "Yes";
                }
            }
        }
    return "No"; 
    }

}




