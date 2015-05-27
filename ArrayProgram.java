/** 
* This program demonstrates the use of arrays and sorting 
* 
*/ 

public class ArrayProgram
{ 
   public static void main(String[] args) 
   { 
        // declare and initialize the array with values
        int[] anArray = {29, 14, 15, 9, 33, 76, 12, 99, 7, 39, 44, 1, 5,
                         11, 71, 88, 43, 18, 91, 9, 55, 76, 68, 48,54 
                        };    
        
        // Numbers to find in the array
        int[] numbersToSearchFor = {33, 30, 91, 75, 68};
        
        ArrayHandler myArrayHandler = new ArrayHandler(anArray);
        
        // Print out the values contained in the unsorted array
        myArrayHandler.arrayPrint();
        
        // Perform a sequential search of the array to find the desired numbers
        System.out.println("\n*********** Sequential Search ***********");
        int totalTriesSeq = 0;
        
        for (int c=0; c<numbersToSearchFor.length; c++)
        { 
          Integer indivNumberToFind = numbersToSearchFor[c];
          int numberOfTries = 
        		  myArrayHandler.arraySequentialSearch(indivNumberToFind);
          totalTriesSeq = totalTriesSeq + numberOfTries;
        }
        System.out.println("\nTotal number of comparisons in sequential search is " + 
        				   totalTriesSeq);
      
        // Sort the array and print out the sorted array
        myArrayHandler.arraySort();
        
        // Perform a binary search on each of the numbers to find
        System.out.println("*********** Binary Search ***********\n");
        int totalTriesBin = 0;
                
        for (int c=0; c<numbersToSearchFor.length; c++)
        { 
          Integer indivNumberToFind = numbersToSearchFor[c];
          int numberOfTries = myArrayHandler.arrayBinarySearch(indivNumberToFind);
          totalTriesBin = totalTriesBin + numberOfTries;
          //System.out.println("Number of tries = " + numberOfTries);
        }
        System.out.println("Total number of comparisons in the binary search is " + 
        					totalTriesBin);
           
   } // end of main
} // end of ArrayProgram


