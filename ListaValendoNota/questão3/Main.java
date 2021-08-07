public class Main
{
   public static void main(String[] args) {
       int [] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       String msg = "";
       String msg2 = "";

       System.out.println("Vetor 1");
       for (int i=0; i < 10; i++) {
           msg += vetor1[i] + ", ";
       }
       System.out.println(msg);

       int [] vetor2 = vetor1.clone();
       System.out.println("Vetor 2");
       for (int i=0; i < 10; i++) {
           msg2 += vetor2[i] + ", ";
       }
       System.out.println(msg2);
   }
}
