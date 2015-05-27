/** 
*
* This program provides methods for handling an array, including
* printing, sorting, binary searching and sequential searching the array 
* 
*
*/ 

public class ArrayHandler
{ 

   public int[] anArray;

   // Constructor accepts an array
   public ArrayHandler(int[] inputArray)
   {
      anArray = inputArray;
   }
     
   public void arrayPrint()
   {
        for (int x=0; x<anArray.length; x++)
        {
            System.out.println("Element at index " + x + " is " + anArray[x]);
        }
   }
      
      // perform a bubble sort and print out the sorted array  
      public void arraySort()
      {
         int n = anArray.length;
         int intHolder = 0;
                  
         for (int x=0; x < n; x++){
             for (int y=1; y < (n-x); y++){
                  
                 // execute the swap                
                 if(anArray[y-1] > anArray[y]){
                    intHolder = anArray[y-1];
                    anArray[y-1] = anArray[y];
                    anArray[y] = intHolder;
                 }
             }
         }
         // Display the sorted array
         System.out.print("\n" + "Sorted values of the array are: {");
         for (int c=0; c<n; c++)
         {
            System.out.print(anArray[c]);
            if (c != (n-1)) 
                System.out.print(", ");               
         }
            System.out.print("}" + "\n\n");
      } // end of sort method

   public int arraySequentialSearch(int indivNumberToFind)
   {
        // Search through the array to find the number that is passed in
	    int numberOfTries = 0;
        System.out.println();
               
        for (int c=0; c<anArray.length; c++)
        { 
          numberOfTries++;
          if (anArray[c] == indivNumberToFind)
          {
              System.out.println ("Found the value " + indivNumberToFind + 
            		  " in " + numberOfTries + " comparisons at position " + (c+1));
              return numberOfTries;
          }
        }
        	// Return -1 if number is not found during loop
          System.out.println("The value " + indivNumberToFind + 
            			     " was not found in the array after " + 
            			     numberOfTries + " comparisons"); 
          return numberOfTries;
          
   } // end of arraySequentialSearch method
        
    public int arrayBinarySearch(int indivualNumberToFind)
    {
	   int arrayStart = 0;
       int arrayEnd = (anArray.length - 1);
       int position;
       int numberOfTries = 1;    

     // Start at the middle
     position = (arrayStart + arrayEnd) / 2;

     while((anArray[position] != indivualNumberToFind) && (arrayStart <= arrayEnd))
     {
    	 numberOfTries++;
         if (anArray[position] > indivualNumberToFind) 
         {                                             
        	 arrayEnd = position - 1;  
         }                                                            
              else                                                  
         {                                                       
            	  arrayStart = position + 1;        // move to the next position
         }
       position = (arrayStart + arrayEnd) / 2;
     }
     if (arrayStart <= arrayEnd) 					// Number was found
     {
          System.out.println ("Found the value " + indivualNumberToFind + 
        		  " in " + numberOfTries + " comparisons at position " + 
        		  (position+1) + "\n");
          return numberOfTries;
     }
     else										   // Number not found
    	  System.out.println("The value " + indivualNumberToFind + 
    			 " was not found in the array after " + 
    			  numberOfTries + " comparisons\n");
     	  return numberOfTries;
 
   } // end of arraySearch method
 
} // end class
