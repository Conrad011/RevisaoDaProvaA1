public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; 
        
        if (n < 1) {
            System.out.println("Por favor, insira um valor válido para 'n'.");
        } else {
            System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
            printFibonacciSeries(n);
        }
    }

    public static void printFibonacciSeries(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
