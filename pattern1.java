package pattern_new;
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the number of rows to print the pattern ");

       int rows = scanner.nextInt();

        System.out.println("** Printing the pattern... **");

        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
    }
}