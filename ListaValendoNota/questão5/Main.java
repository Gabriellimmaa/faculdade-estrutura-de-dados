import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    
		int G[] = new int[13];
		int R[] = new int[13];
        int aux=0;
        int quantidadeApostadores;
		for(int i=0;i<13;i++){
		    System.out.print("Digite o gabarito " +(i+1)+ ": ");
            G[i] = teclado.nextInt();
		}
		
		System.out.print("Insira o numero que terá de apostadores: ");
		quantidadeApostadores = teclado.nextInt();
		do{
		   	int acertos = 0;
		    int apostador;
		    
    		System.out.print("Insira o numero do apostador: ");
    		apostador = teclado.nextInt();
    		for(int i=0;i<13;i++){
    		    System.out.print("Informe a aposta do "+(i+1)+ "º jogo: ");
                R[i] = teclado.nextInt();
    		}
    
            for (int i=0;i<13;i++){
               if(G[i] == R[i]){
                   acertos++;
               }
            } 
            
            if(acertos == 13){
                System.out.println("Numero apostador:"+ apostador);
                System.out.println("Numero acertos:"+ acertos);
                System.out.println("GANHADOR, PARABENS");
            }else{
                System.out.println("Numero apostador:"+ apostador);
                System.out.println("Numero acertos:"+ acertos);
            }
            
            aux++;
		}
        while(aux<quantidadeApostadores);
	}
}



