import java.util.Scanner;

public class ex1 {
    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true; 
        }
        
        int a = 0;
        int b = 1;
        int fib = 0;
  
        while (fib < num) {
            fib = a + b;
            a = b;
            b = fib;
        }
        
        return fib == num; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Informe um número para verificar se está na sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}
