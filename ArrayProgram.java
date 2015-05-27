/** 
* This program demonstrates the use of arrays and sorting 
* 
*/ 

public class ArrayProgram
{ 
   public static void main(String[] args) 
   { 
        // declare and initialize the array with values
        int[] anArray = {23, 17, 5, 90, 12, 44, 38, 84, 77, 3, 66, 55, 
                         1, 19, 37, 88, 8, 97, 25, 50, 75, 61, 49 
                        };    
        
        // Numbers to find in the array
        int[] numbersToSearchFor = {25, 30, 50, 75, 92};
        
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


