import java.util.*;
public class Whileloop 
{
    public static void main(String args[])
    {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        while (number > 0) 
        {
            factorial = factorial*number;
            number--;
        }
        System.out.println(factorial);
    }    
}
