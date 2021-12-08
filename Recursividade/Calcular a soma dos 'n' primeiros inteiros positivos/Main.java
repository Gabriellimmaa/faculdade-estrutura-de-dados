import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Informe a quantidade dos primeiros inteiros positivos que será lido:");
        n = ler.nextInt();

        int []lista = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = i+1;
        }

        int resultado = somatorio(lista, 0);;
        System.out.println("A soma dos " + n + " primeiros inteiros positivos é: " + resultado);
    }

    public static int somatorio(int[] lista, int i) {
        if (i < lista.length){
            return lista[i] + somatorio(lista,i + 1);
        }
        else{
            return 0;
        }
    }
}
