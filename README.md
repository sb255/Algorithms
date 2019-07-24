# Algorithms using Java!

## *Algorithms Topics:*

   * Big O Concept
   * Searching Algorithms
   * Sorting Algorithms
   * Recursion
   * BitWise Operation
   * Dynamic Programming
 
---------------------------------------------------------------------------------------------

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

arr.length -> for calculating the length of all types of array (int[], String[], char[])

arr.size() -> for calculating the size of an object array(Ex. List array as it stores only objects)


------------------------------------------------------------------------------------------------------------------------------

# Point to remember

.length -> It is used for calculating the length of all types of array (int[], String[], char[])

.length() -> It is used for calculating the length of a String

---------------------------------------------------------------------------------------------

# Big O:

#### *Run-time: Time taken or the Iteration made by function/algorithm to process the input. If the number of Iteration are equal to the given input x, then the run time will be O(x).*  

*  O(n): When run-time is proportional to the input size n. In an average case of a linear search algorithm, we have to check each value in an array, the run time in that case is proportional to the size of the array.  
*  O(1): When run-time is constant and independent of the input size.
*  O(log(n)): When run-time increases exponentially with the size of input. In case of binary search, the worst case is O(log(n)).

---------------------------------------------------------------------------------------------
# Searching Algorithms:

## Linear Search Algorithm:

```java
    
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

```java
    
/*--We are assuming that the array is sorted and the array has more than one element--*/    
    
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
Bubble Sort: 
```
SWAPS the first two elements of the array and then swaps the adjacent elements, and keeps on SWAPPING until the array is sorted!

```
Merge Sort: 
```
First DIVIDES the array into two halves, SORT each of them and then MERGE them together!

```
Quick Sort: 
```
In quick sort, we create a partition known as PIVOT, and then divide the array on the basis of elements less than the PIVOT and the elements larger than the PIVOT element!

```
Selection Sort: 
```
Performs a LINEAR SCAN, find the smallest element and place it to 0th Index, and then keeps on doing the process until the array is sorted!

```
Insertion Sort: 
```
In Insertion sort, we COMPARE a element with the elements COMING BEFORE IT in the array, Ex: Element at INDEX=3, will be compared with the elements positioned at INDEX=0,1,2 respectively and then the element is placed at the correct position!


## General Sorting Algorithm:

```java

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

```java

/*--In built methods for sorting Arrays and Lists--*/

Arrays.sort(stringArray); 

Collections.sort(list);

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

# Recursion:

```java

/*--Printing the elements of a SinglyLinkedList in reverse order using recursion--*/ 

   
    static void printInReverse(Node head) {
        
        if(head == null){
        }
            
        else{
             printInReverse(head.next);
             System.out.println(head.data);
        }

    }

 //   Recursion Stack: [printInReverse1(printInReverse2(printInReverse3(...)))]

 //   Calling Order(LIFO): ..., printInReverse3, printInReverse2, printInReverse1
 

```

---------------------------------------------------------------------------------------------

# BitWise Operations: 

*  AND | &  : Returns 1(True) if both the operands are 1(True).
*  OR  | |  : Returns 1(True) if atleast one of the operands is 1(True).
*  XOR | ^  : Returns 1(True) if exactly one of the operands is 1(True). 

---------------------------------------------------------------------------------------------
