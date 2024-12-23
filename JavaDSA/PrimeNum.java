// public class PrimeNum 
// {
//     public static boolean Prime(int n)
//     {
//         boolean Prime = true;
        
//         for(int i = 2; i <= n-1; i++)
//         {
//             if (n % i == 0) 
//             {    
//                 Prime = false;
//             }
//         }
//         return Prime;
//     }
//     public static void main(String args[])
//     {
//         System.out.println(Prime(28));
//     }
// }

/**
 * PrimeNum
 */
public class PrimeNum 
{
    public static void Hollow(int rows, int cols)
    {
        for(int i = 1; i<=rows; i++)
        {
            for(int j = 1; j<=cols; j++)
            {
                if (i == 1 || j == 1 || i == rows || j == cols) 
                {
                    System.out.print("  *");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Hollow(6,12);
    }
    
}