import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tabuada: ");
        System.out.println("Qual tabuada deseja saber ? \n" +
                "[1] Adicao \n" +
                "[2] Subtracao \n" +
                "[3] Multiplicaco \n" +
                "[4] Divisao");
        int escolha = entrada.nextInt();
        for (int i = 0; i <= 10; i++) {
            if (escolha == 1) {
                System.out.println("Voce escolheu Adicao");
                System.out.println("Digite um numero e saiba a sua tabuada: ");
                int a = entrada.nextInt();
                for (int c = 0; c <= 10; c++) {
                    System.out.printf(a + " + " + c + " = " + (a + c) + "\n");
                }
            }
            if (escolha == 2) {
                System.out.println("Voce escolheu Subtracao");
                System.out.println("Digite um numero e saiba a sua tabuada: ");
                int a = entrada.nextInt();
                for (int c = 0; c <= 10; c++) {
                    System.out.printf(a + " - " + c + " = " + (a - c) + "\n");
                }
            }
            if (escolha == 3) {
                System.out.println("Voce escolheu Multiplicacao");
                System.out.println("Digite um numero e saiba a sua tabuada: ");
                int a = entrada.nextInt();
                for (int c = 0; c <= 10; c++) {
                   if (a!= 10){
                       System.out.println(a + " * " + c + " = " + (a *c) + "\n");
                    } else if (a == 10) {
                        System.out.println(a + " * " + c + " = " + (1 * c) + "\n");
                    }
 
                 }
             }
             if (escolha == 4) {
                 System.out.println("Voce escolheu Divisao");
                 System.out.println("Digite um numero e saiba a sua tabuada: ");
                 int a = entrada.nextInt();
                 for (int c = 1; c <= 10; c++) {
                   System.out.println(a + " * " + c + " = " + (a / c) + "\n");
 
                 }
             }
         }
 
     }
 }