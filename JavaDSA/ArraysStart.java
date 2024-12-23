import java.util.*;
// public class ArraysStart 
// {

//     public static void Update(int marks[])
//     {
//         for(int i = 0; i < marks.length; i++)
//         {
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String[] args) 
//     {
//         int marks[] = {45,67,83};
//         Update(marks);
//         for(int i = 0; i<marks.length; i++)
//         {
//             System.out.println(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }


/**
 * ArraysStart
 */
// public class ArraysStart 
// {
//     public static int LinearSearch(int numbers[], int key)
//     {
//         for(int i = 0; i<numbers.length; i++)
//         {
//             if (numbers[i] == key) 
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static int MaxMinarray(int plumber[])
//     {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i = 0; i<plumber.length; i++)
//         {
//             if (largest<plumber[i]) 
//             {
//                 largest = plumber[i];
//             }
//             if (smallest>plumber[i]) 
//             {
//                 smallest = plumber[i];
//             }
//         }
//         System.out.println("Smallest number is : "+ smallest);
//         return largest;
//     }

//     public static void main(String[] args)
//     {
//         int numbers[] = {2,3,5,6,7,23,45,56,67,78};
//         int key = 2;
//         int index = LinearSearch(numbers, key);
//         if (index == -1) 
//         {
//             System.out.println("Index not found.");    
//         }
//         else
//         {
//         System.out.println("The key is at index : "+ index);
//         }

//         System.out.println(MaxMinarray(numbers));


//     }
// }

/**
 * ArraysStart
 */
// public class ArraysStart {

//     public static int Binarysearch(int numbers[], int key)
//     {
//         int start = 0;
//         int end = numbers.length;
//         while (start<=end) 
//         {
//             int mid = (start + end)/2;
//             if (numbers[mid] == key) 
//             {
//                 return mid;
//             }
//             if (numbers[mid]<key) 
//             {
//                 start = mid+1;
//             }
//             if (numbers[mid]>key) {
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) 
//     {
//         int numbers[] = {2,3,5,7,10,12,14,17,20,25,30};
//         int key = 14;
//         System.out.println("The index value of the given key is :" + Binarysearch(numbers, key));    
//     }
// }


/**
 * ArraysStart
 */
public class ArraysStart 
{
    public static void reverse(int array[])
    {
        int first = 0;
        int last = array.length-1;

        while(first<last)
        {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++;
            last--;
        }

    }
    public static void main(String[] args)
    {
        int array[] = {2,3,4,5,6,7,8,9,10};
        reverse(array);
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
}