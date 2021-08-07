import java.util.Scanner;

public class Main
{
   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);

       int vetor[] = new int[20];

       for (int i=0; i < 20; i++) {
           System.out.println("Digite o valor da posicao "+(i+1));
           vetor[i] = ler.nextInt();
       }

       System.out.println("Vetor normal:");
       for (int i=0; i < 20; i++) {
           System.out.print("["+vetor[i]+"]");
       }

       for(int i=0; i<10; i++)
       {
           int aux;
           aux = vetor[i];
           vetor[i] = vetor[19-i];
           vetor[19-i] = aux;
       }

       System.out.println("\nVetor modificado: ");
       for(int i=0; i<20; i++)
       {
           System.out.print("["+vetor[i]+"]");
       }

   }
}
