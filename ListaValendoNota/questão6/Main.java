import java.util.Scanner;


public class Main
{
   public static void questaoA(int[][] array){
       int soma = array[3][0] + array[3][1] + array[3][2] + array[3][3] + array[3][4];
       System.out.println("Soma da linha 4: "+soma);
   }
   public static void questaoB(int[][] array){
       int soma = array[0][1] + array[1][1] + array[2][1] + array[3][1] + array[4][1];
       System.out.println("Soma da coluna 2: "+soma);
   }
   public static void questaoC(int[][] array){
       int soma = array[0][0] + array[1][1] + array[2][2] + array[3][3] + array[4][4];
       System.out.println("Soma da diagonal principal: "+soma);
   }
   public static void questaoD(int[][] array){
       int soma = array[0][4] + array[1][3] + array[2][2] + array[3][1] + array[4][0];
       System.out.println("Soma da diagonal secundaria: "+soma);
   }
   public static void questaoE(int[][] array){
       int soma = 0;
       for(int linha=0; linha < array.length; linha++) {
           for(int coluna=0; coluna < array[linha].length; coluna++) {
               soma += array[linha][coluna];
           }
       }
       System.out.println("Soma de todos os elementos: "+soma);
   }
   public static void questaoF(int[][] array){
       System.out.println("Escrever matriz:");
       System.out.print(array[0][0]+"|");
       System.out.print(array[0][1]+"|");
       System.out.print(array[0][2]+"|");
       System.out.print(array[0][3]+"|");
       System.out.print(array[0][4]+"\n");
       System.out.print(array[1][0]+"|");
       System.out.print(array[1][1]+"|");
       System.out.print(array[1][2]+"|");
       System.out.print(array[1][3]+"|");
       System.out.print(array[1][4]+"\n");
       System.out.print(array[2][0]+"|");
       System.out.print(array[2][1]+"|");
       System.out.print(array[2][2]+"|");
       System.out.print(array[2][3]+"|");
       System.out.print(array[2][4]+"\n");
       System.out.print(array[3][0]+"|");
       System.out.print(array[3][1]+"|");
       System.out.print(array[3][2]+"|");
       System.out.print(array[3][3]+"|");
       System.out.print(array[3][4]+"\n");
       System.out.print(array[4][0]+"|");
       System.out.print(array[4][1]+"|");
       System.out.print(array[4][2]+"|");
       System.out.print(array[4][3]+"|");
       System.out.print(array[4][4]+"\n");
   }

   public static void main(String[] args) {
       int[][] M = new int[5][5];
       Scanner ler = new Scanner(System.in);

       for(int l=0; l<=4; l++){
           for(int c=0; c<=4; c++){
               System.out.println("Linha "+l+" Coluna "+c+":");
               M[l][c] = ler.nextInt();
           }
       }

       questaoA(M);
       questaoB(M);
       questaoC(M);
       questaoD(M);
       questaoE(M);
       questaoF(M);
   }
}
