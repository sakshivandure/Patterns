package pattern_new;
import java.util.Scanner;
public class pattern5 {
    
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        
        System.out.println("** Printing the pattern... **");
        
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
