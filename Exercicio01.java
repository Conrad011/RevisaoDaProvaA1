public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("OS 100 Primeiros numeros pares: ");
        for (int i = 0; i<=100; i++){
            if (i % 2 == 0){
                System.out.printf(i +" e par \n");
            }else {
                continue;
            }
        }
    }

}