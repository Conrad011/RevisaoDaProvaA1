import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);

    String ast = "*";
    int n=0;
    int limite;

    do{
    System.out.print("Insira um número de 1 a 20: ");
    limite = dados.nextInt();
      System.out.println();
      if(limite<1 || limite>20){
        System.out.println("Número inválido! \n");
      }
      }while(limite<1 || limite>20);

    do{

    for(int c = 0; c < n; c++){
      System.out.print(ast + " ");
    }System.out.print("\n");
    n++;
    }while(n<=limite);

  }
}