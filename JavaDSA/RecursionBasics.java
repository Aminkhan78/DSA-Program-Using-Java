public class RecursionBasics 
{
   // // Print number in descending order
    // public static void printDec(int n)
    // {
    //     if (n == 1) 
    //     {
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n + " ");
    //     printDec(n-1);
    // }

   // // Print number in ascending order
    // public static void printInc(int n)
    // {
    //     if (n == 1) 
    //     {
    //         System.out.print(n + " ");
    //         return;
    //     }
    //     printInc(n-1);
    //     System.out.print(n+" ");
    // }

    // Main Function
    

    // // To print factorial
    // public static int printFact(int n)
    // {
    //     if (n == 0) 
    //     {
    //         return 1;
    //     }
    //     int fnm1 = printFact(n-1);
    //     int fn = n*printFact(n-1);
    //     return fn;
    // }

    // // For finding sum of previous numbers
    // public static int twoSum(int n)
    // {
    //     if (n == 1)
    //     {
    //         return 1;    
    //     }
    //     int snm1 = twoSum(n-1);
    //     int sn = n+twoSum(n-1);
    //     return sn;
    // }

    // // Fibonacci series
    // public static int printFib(int n)
    // {
    //     if (n==0 || n==1) {
    //         return n;
    //     }
    //     int fibnm1 = printFib(n-1);
    //     int fibnm2 = printFib(n-2);
    //     int fibOfn = fibnm1 + fibnm2;
    //     return fibOfn;
    // }

    // // To print firstOccurance the key
    // public static int firstOcc(int arr[], int key, int i)
    // {
    //     if (i==arr.length)
    //     {
    //         return -1;
    //     }
    //     if (arr[i]==key) 
    //     {
    //         return i;    
    //     }
    //     return firstOcc(arr, key, i+1);
    // }


    // // To print the last Occurance of the key
    // public static int lastOcc(int arr[], int key, int i)
    // {
    //     if (i == arr.length)
    //     {
    //         return -1;    
    //     }
    //     int isfound = lastOcc(arr, key, i+1);
    //     if (isfound == -1 && arr[i] == key) 
    //     {
    //         return i;    
    //     }
    //     return isfound;
    // }

    // To print power of the number
    public static int power(int x, int n)
    {
        if (n == 0) 
        {
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x*xnm1;
        return xn;
    }

    // Main Function
    public static void main(String[] args) 
    {
        // printInc(10);
        // System.out.println(printFact(5));
        // printDec(10);
        // System.out.println(twoSum(5));
        // System.out.println(printFib(10));
        int arr[] = {2,4,6,8,10,1,3,5,7,9};
        // System.out.println(firstOcc(arr, 11, 0));
        // System.out.println(lastOcc(arr, 5, 0));
        System.out.println(power(2, 10));
    }
}