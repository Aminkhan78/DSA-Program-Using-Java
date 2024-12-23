// Printing the factorial of the number using for loop and asking the number from the user.

import java.util.Scanner;

class Factorial
{
    public static void main(String args[])
    {
        int n;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}




/*

The number printing in the decreasing order and asking the number from the user 
{
    public static void main(String[] args) 
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        System.out.print(a + "! = ");
        for(int i = a; i > 0; i--)
        {
            System.out.print(i);
            if(i > 1)
            {
                System.out.print(", ");
            }
        }
    }
} 
 */