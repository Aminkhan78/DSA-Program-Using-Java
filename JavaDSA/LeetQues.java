import java.util.*;
// // Remove Element


// // public class LeetQues {
// //     public static int Solutions(int arr[], int val)
// //     {
// //         int i = 0;
// //         for(int j = 0; j<arr.length; j++){
// //             if (arr[j] != val) 
// //             {
// //                 arr[i] = arr[j];
// //                 i++;
// //             }
// //         }
// //         return i;
// //     }
// //     public static void main(String[] args) {
// //         int arr [] = {2,3,4,5,5,6,6};
// //         int val = 4;
// //         System.out.println(Solutions(arr,val));
// //     }
// // }

// /**
//  * LeetQues
//  */
// public class LeetQues 
// {

//     public static int[] Solutions(int arr[])
//     {
//         arr[arr.length-1] += 1;
//         for(int i = 0; i<arr.length; i++)
//         {
//             System.out.print(arr[i]);
//         }
//          return arr;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4};
//         Solutions(arr);
//     }
// }

// class Solution 
// {
//     public int[] plusOne(int[] digits) 
//     {
//        int n = digits.length;
//         for(int i = n-1; i>=0; i--)
//         {
//             if(digits[i] != 9)
//             {
//                 digits[i]++;
//                 break;
//             }
//             else{
//                 digits[i] = 0;
//             }
//             if(digits[0] == 0)
//             {
//                 int[] res = new int[n+1];
//                 res[0] = 1;
//                 return res;
//             }
//         }
//         return digits;
//     }
// }
