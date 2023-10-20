import java.util.Scanner;
import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);

    int contador = 1;
    int idadefem;
    int idademasc;
    int somasexf=0;
    int somasexm=0;
    int somaidadef=0;
    int somaidadem=0;

    do{
    Object[] options = {"Masculino", "Feminino"};
    int sexo = JOptionPane.showOptionDialog(null, "Qual seu sexo?","Selecione uma Opção",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);


      if(sexo == 1){
        somasexf++;
        System.out.println("Insira sua idade: ");
        idadefem = dados.nextInt();
        somaidadef+=idadefem;
        
      }else if(sexo == 0){
        somasexm++;
        System.out.println("Insira sua idade: ");
        idademasc = dados.nextInt();
        somaidadem+=idademasc;
        
      }
      
      contador++; 
    }while(contador<=20);

    System.out.print("A média de idade da população feminina é: " + somaidadef/somasexf);
    System.out.println();
    System.out.print("A média de idade da população masculina é: " + somaidadem/somasexm);
    

  }
}