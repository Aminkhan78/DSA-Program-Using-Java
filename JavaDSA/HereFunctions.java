public class HereFunctions 
{
    public static void printHelloWorld()
    {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return;
    }

    public static int calculateSum(int a, int b)
    {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }


    public static void main(String[] args) 
    {
        printHelloWorld();
        calculateSum(5, 17);
    }   
}
