import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        ArvoreBinaria ab = new ArvoreBinaria();

        //Inserção;
        ab.insere(new No(50));
        ab.insere(new No(35));
        ab.insere(new No(40));
        ab.insere(new No(33));
        ab.insere(new No(80));
        ab.insere(new No(3));
        ab.insere(new No(76));
        ab.insere(new No(90));
        ab.insere(new No(56));
        ab.insere(new No(24));
        ab.insere(new No(13));
        ab.insere(new No(45));
        ab.insere(new No(92));
        ab.insere(new No(32));
        ab.insere(new No(51));
        ab.insere(new No(81));
        ab.insere(new No(88));

        //Busca;
        No search_el = ab.busca(56);
        if (search_el!=null){
            System.out.println("Buscando elemento");
            System.out.println(search_el.toString());
        }
        else{
            System.out.println("Elemento nao encontrado");
        }

        //Remoção
        No remover_el = ab.remove(45);
        if (remover_el!=null){
            System.out.println("Removendo elemento");
            System.out.println(remover_el.toString());
        }
        else{
            System.out.println("Elemento nao encontrado");
        }

        //Impressão;
        System.out.println("Imprimindo arvore");
        ab.imprimeArvore(ab.raiz);

        //Percurso em ordem;
        System.out.println("Imprimindo em  ordem");
        ab.emOrdem(ab.raiz);

        //Percurso pós ordem;
        System.out.println("Imprimindo em pos ordem");
        ab.posOrdem(ab.raiz);

        //Percurso pré ordem;
        System.out.println("Imprimindo em pre ordem");
        ab.preOrdem(ab.raiz);
    }
}
