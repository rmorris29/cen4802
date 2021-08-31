import java.util.Scanner;
class Fibonacci { 
        static int fib(int n) 
        {  
                if (n <= 1) 
                {
                        return n; 
                }
                
                return fib(n - 1) + fib(n - 2); 
        } 

        public static void main(String args[]) 
        { 
                System.out.println("Enter the value of n:");
                
                Scanner scanner = new Scanner(System.in);
                
                int n = scanner.nextInt();
                scanner.close();
            
                System.out.println("Fibonacci Series: ");
                for (int i = 1; i <=n; i++) { 
                        System.out.print(fib(i) + ", "); 
                }
        } 
} 