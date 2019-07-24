/*Counting the maximum occurance of the largest number in an array*/

static int SimpleSortMax(int[] ar) {

        int[] arr = ar; 
        int buk = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i]<=arr[j]){

                    buk = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buk;
                }

            }
        }

        int counter = 1; 

        for(int i=arr.length-1; i>0; i--){
            if(arr[i]==arr[i-1]){
                counter++;
            }
        }

    return counter; 
    
 }
