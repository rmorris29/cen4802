/**
* <h1>Fibonacci Sequence</h1>
* This Fibonacci program will list the fibonacci 
* series based on user input for the n value.
* @author Richard Morris
* @version 1.01
* @since 08-31-2021
*/
import java.util.Scanner;
class Fibonacci { 
        static int fib(int n) 
        {  
                if (n <= 1) 
                {
                        return n; 
                }
                
                // Recursive algorithm
                return fib(n - 1) + fib(n - 2); 
        } 

        public static void main(String args[]) 
        { 
                System.out.println("Enter the value of n:");
                // This is the scanner object
                Scanner scanner = new Scanner(System.in);
                
                // reads input from the user
                int n = scanner.nextInt();
                scanner.close();
                
                // prints the fibonacci sequence based on user input
                System.out.println("Fibonacci Series: ");
                for (int i = 1; i <=n; i++) { 
                        System.out.print(fib(i) + ", "); 
                }
        } 
} 
