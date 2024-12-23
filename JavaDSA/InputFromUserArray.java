import java.util.Scanner;
public class InputFromUserArray
{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements you want to store: ");
            int a = sc.nextInt();
            int[] numbers = new int[a]; // Create an array of size 'n'

            for(int i = 0; i<a; i++) // Taking input from the user
            {
                System.out.print("Enter the element" + (i+1) + " : ");
                numbers[i] = sc.nextInt();  // Storing input in the array
            }
            System.out.println("The elements in the array are : ");
            for(int i =0; i<a; i++)
            {
                System.out.println(numbers[i]);
            }
        sc.close();
    }
}