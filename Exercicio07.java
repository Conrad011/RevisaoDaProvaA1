import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
  public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("#0.00");
    
    double altura;
    double peso;
    double imc;
    

    System.out.print("Insira sua altura: ");
    altura = dados.nextDouble();

    System.out.print("Insira sua peso: ");
    peso = dados.nextDouble();

    imc = peso/Math.pow(altura, 2);
   
    System.out.println("Seu IMC é: " + formatter.format(imc));

    if(imc<18.5){
      System.out.print("Você está abaixo do peso.");
    }else if(imc>=18.5 && imc<=24.9){
      System.out.print("Você está no peso ideal.");
    }else if(imc>=25 && imc <=29.9){
      System.out.print("Você está acima do peso.");
    }else if(imc>=30 && imc<=34.9){
      System.out.print("Você está com obesidade classe 1!");
    }else if(imc>=35 && imc<=39.9){
      System.out.print("Você está com obesidade classe 2!");
    }else{
      System.out.print("Você está com obesidade classe 3!");
    }
    
    
  }
}