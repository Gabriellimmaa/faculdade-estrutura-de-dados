import java.util.Scanner;

public class Main {
    public static int potencia(int n, int expoente){
        if(expoente == 0){
            return 1;
        }
        else{
            return n * potencia(n,expoente-1);
        }
    }

    public static void main(String[] args) {
        int elevado, potencia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor elevado:");
        elevado = teclado.nextInt();
        System.out.println("Digite o valor da potencia:");
        potencia = teclado.nextInt();
        System.out.println(potencia(elevado, potencia));
    }
}
