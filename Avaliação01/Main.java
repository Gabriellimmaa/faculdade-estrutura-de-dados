import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Lista lista = new Lista();

        Livro l1 = new Livro();
        l1.inserirLivro(999821, "Clarice Lispector", "A Hora da Estrela", 300, "Romance", "Matheus Valeri");
        lista.insere(new No(l1));

        Livro l2 = new Livro();
        l2.inserirLivro(888123, "Machado de Assis", "O Alienista", 421, "Crônica", "");
        lista.insere(new No(l2));

        Livro l3 = new Livro();
        l3.inserirLivro(235566, "William Shakespeare", "A Tempestade", 289, "Drama", "");
        lista.insere(new No(l3));

        Livro l4 = new Livro();
        l4.inserirLivro(123533, "Jorge Amado", "Capitões de Areia", 533, "Romance", "Rodrigo Tavares");
        lista.insere(new No(l4));

        lista.imprimeLista();
        System.out.println(lista.buscaTitulo("NADA HAVER"));
        System.out.println(lista.buscaTitulo("Capitões de Areia"));
    }
}
