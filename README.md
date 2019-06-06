# Basics about Arrays
Array declaration for all data types and list(list objects)


------------------------------------------------------------------------------------------------------------------------------

# Most Basic types of array declaration:

type var-name [10];

OR

type[10] var-name; 


(Generally second type of declaration is preffered)

------------------------------------------------------------------------------------------------------------------------------

# Initializing an array


int[] intArray = new int[10] 

OR

int[] intArray = {0,1,2,3,4,5,6,7,8,9}


------------------------------------------------------------------------------------------------------------------------------

# Most common methods to find the size or length of an array

arr.length -> for calculating the size of a data type array.

arr.length() -> for calculating the size of a String array. 

arr.size() -> for calculating the size of an object array(Ex. List array as it stores only objects)


------------------------------------------------------------------------------------------------------------------------------

# Searching Algorithms:

## Linear Search Algorithm:

```
    
    int linearSearch(int[] arr, int searchElement){
    
        int array[] = arr;
        int sElement = searchElement; 
        
        for(int i=0; i<array.length; i++){
            if(array[i]==sElement)
                return i; 
        }
        
        return -1;
    }
    
```

## Binary Search Algorithm:

```
    
/*-- We are assuming that the array is sorted and the array has more than one element --*/    
    
    int binarySearch(int[] array, int searchElement, int startingIndex, int endingIndex){
    
        int middleIndex = (startingIndex + endingIndex)/2;
        
       
        if(searchElement==array[middleIndex]){
            return middleIndex;
        }

            
        else if(searchElement<array[middleIndex]){
            return binarySearch(array, searchElement, startingIndex, middleIndex-1);
        }

            
        else if(searchElement>array[middleIndex])
            return binarySearch(array, searchElement, middleIndex+1, endingIndex);
           
 
        else
            return -1; 
        
    }

```

## Time and Space complexities of search algorithms:

## Time Complexity: 

Search Algorithm | Best Case | Average Case | Worst Case
--- | --- | --- | ---
Linear Search | O(1) | O(n) | O(n) 
Binary Search | O(1) | O(logn) | O(logn) 


## Space Complexity: </br>

Search Algorithm | Space Complexity
--- | ---
Linear Search | O(1)
Binary Search | O(1)


---------------------------------------------------------------------------------------------

# Sorting Algorithms:

```
Bubble Sort: Swaps the first two elements of the array and then swaps the adjacent numbers, and keeps on swapping until the array is sorted
```

## General Sorting Algorithm:

```
    int[] generalSort(int[] arr){
                        
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
    
        return ar;
    
    }
```

## Time and Space complexities of sorting algorithms:

## Time Complexities:

Sorting Algorithm | Best Case | Average Case | Worst Case
--- | --- | --- | ---
Bubble Sort | O(n) | O(n^2) | O(n^2) 
Merge Sort | O(nlog(n)) | O(nlog(n)) | O(nlog(n))
Quick Sort | O(nlog(n)) | O(nlog(n)) | O(n^2)
Selection Sort | O(n^2) | O(n^2) | O(n^2)
Insertion Sort | O(n) | O(n^2) | O(n^2)


## Space Complexities:

Sorting Algorithm | Space Complexity(Worst)
--- | ---
Bubble Sort | O(1)
Merge Sort | O(n)
Quick Sort | O(1)
Selection Sort | O(1)
Insertion Sort | O(1)

-----------------------------------------------------------------------------------------------
