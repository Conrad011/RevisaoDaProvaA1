//Algoritmo para calcular o fatorial de um número fornecido pelo utilizador

import java.util.Scanner; 

class Main { 
 public static void main(String[] args) { 
 Scanner dados = new Scanner(System.in); 

  int fatorial;
  int multiplicador;
  

  System.out.print("Insira o número que deseja calcular: ");
  fatorial = dados.nextInt();

   multiplicador = fatorial-1;

   for(;multiplicador>1;multiplicador--){
   fatorial*=multiplicador;
     
   }System.out.println (" O fatorial é: " + fatorial);
       
   
}
}