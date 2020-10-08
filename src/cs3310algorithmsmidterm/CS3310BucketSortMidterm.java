package cs3310algorithmsmidterm;

import java.util.*; 
import java.util.Collections; 
/*
S. Renee Eller
Nima
CS 3310 Section 2
Midterm Project
 */
public class CS3310BucketSortMidterm {
    
    public static void main(String[] args) {
        int myArray[] = { (int)4, (int)6, 
                          (int)3, (int)9, 
                          (int)7, (int)2}; 
  
        int maximumValue = maximumValue(myArray); 
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(myArray));
        myArray = bucketSort(myArray, maximumValue);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(myArray));
    }
    
    public static int[] bucketSort(int[] array, int maximumValue) 
    {

        int[] buckets = new int[maximumValue + 1];
        int[] completedSort = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            buckets[array[i]]++;
        }
         int index = 0;
         for (int i = 0; i < buckets.length; i++)
         {
            for (int j = 0; j < buckets[i]; j++)
            {
                completedSort[index++] = i;    
            }           
         }
         return completedSort;  
    }
      
 
    public static int maximumValue(int[] array) 
    {
        int maximumValue = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > maximumValue)
                maximumValue = array[i];
        return maximumValue;
    }      
    
}
