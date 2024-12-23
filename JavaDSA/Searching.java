import java.util.Scanner;

// public class Searching {
//     // Linear searching
//     public static int Linear(int anaya[],int key)
// {
//     for(int i = 0; i<anaya.length; i++)
//     {
//        if (anaya[i] == key) 
//        {
//         return i;
//        } 
//     }
//     return -1;
// }
//     public static void main(String args[])
//     {
       
//         int anaya[] = {1,2,3,4,5,6,7,8,9,0};
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the key value you want to find out in the array...");
//         int key = sc.nextInt();
//         int index = Linear(anaya, key);
//         if (index == -1) 
//         {
//             System.out.println("Index not found...");
//         }
//         else{
//             System.out.println(index);
//         }
//     }
// }


/**
 * Searching
 */
public class Searching {
    public static int BinarySearch(int num[],int key)
    {
        int start = 0;
        int end = num.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if (num[mid]==key)
            {
                return mid;
            }
            if (num[mid]<key) 
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14};
        int key = 11;
        int index = BinarySearch(num, key);
        System.out.println("Target should be at index: " + index);
    }
}