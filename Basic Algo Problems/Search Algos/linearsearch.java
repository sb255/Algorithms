
/*
sample input: 
6 1
1 2 3 4 1 2

first line has the size and search element
second line is the array

Solution: we have to find the last occurance of the search element in the array and print the ouput

sample output:
5
*/

import java.util.*;
import java.lang.*;


class LinearSearch {
    public static void main(String args[] ) throws Exception {
        
        
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int searchElement = s.nextInt();
        int array[] = new int[size];
        int mark = -2;
        
        for(int i=0; i<size; i++)
            array[i]=s.nextInt(); 
        
        
        for(int i=0;i<size;i++){
            
            if(array[i]==searchElement)
                mark=i;
                
        }
        
        System.out.print(mark+1);
       

    }
}

