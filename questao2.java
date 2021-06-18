import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
        int numero[]=new int [20];
        
        for(int i=0;i<20;i++){
            System.out.print("Digite o número " + (i + 1) + ": ");
            numero[i] = teclado.nextInt();
        }

        System.out.println("\n");
        System.out.println("Vetor normal");
        for(int j=0;j<20;j++){
            System.out.println("posicao: " +j+ "| valor: " + numero[j]);
        }
        System.out.println("\n");

        int n=20;
        int i=0;        
        int j=n-1;
        int aux;

        while(i < j){
            aux=numero[i];
            numero[i]=numero[j];
            numero[j]=aux;
            i++;
            j--;
        }
        
        System.out.println("Vetor invertido");
        
        for(j=0;j<n;j++){
            System.out.println("posicao: " +j+ "| valor: " + numero[j]);
        }
	}
}

