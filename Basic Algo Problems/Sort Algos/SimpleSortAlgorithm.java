/*Simple algorithm for sorting an array*/

public class SimpleSortAlgorithm{

        public static void main(String[] args) {
		
 		
                int[] ar = {2,3,4,1,8,9,5,6,7}; 
		int buk = 0; 

                 for(int i=0; i<ar.length; i++){
                     for(int j=i+1; j<ar.length; j++){
                         if(ar[i]>ar[j]) {
                             buk = ar[i];
                             ar[i] = ar[j]; 
                             ar[j] = buk; 
                         }
                     }
                 }
        
        
                  for(int i=0; i<ar.length; i++){
                      System.out.print(" "+ar[i]);
                  }
		
          }

}

