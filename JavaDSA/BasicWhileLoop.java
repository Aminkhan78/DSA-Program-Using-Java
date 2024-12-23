import java.util.Scanner;

public class BasicWhileLoop {
    public static void main(String[] args) 
    {
        /* 
        // printing number from 1 to 10 
        int counter = 1;
        while (counter <=10) 
        {
            System.out.println(counter);
            counter++;            
        }  */


        int counter = 1;
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        while (counter <= range) 
        {
            System.out.print(counter + " ");
            counter++;    
        }
            System.out.println();
    }
}

