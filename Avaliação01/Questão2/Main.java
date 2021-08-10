import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[15];
        int i;
        int aux=1;
        
        for (i=0; i<15; i++) {
            System.out.print("Valor da posicao " + (i + 1) + ": ");
            vet[i] = teclado.nextInt();
        }
        
        for(i = 0; i<15; i++) {
            if(vet[i]%2 == 0) {
                aux *= vet[i];
            }
        }
        System.out.print("\nResultado da multiplicacao: "+aux);
    }
}
