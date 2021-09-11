import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;


public class ListaEncadeadaDinamicaDupla {
    No inicio;
    No fim;
    List<String> lista = new ArrayList<String>();

    public void cadastrar(No n, String name){
        if (inicio == null){
            inicio = n;
            fim = n;
        }
        else{
            fim.setProximo(n);
            n.setAnterior(fim);
            fim = n;
        }
        lista.add(name);
        System.out.println("Elemento inserido com sucesso: "+n.toString());
    }

    public void imprimeAlunos(){
        No aux = inicio;
        System.out.println("\n === IMPRIMINDO ALUNOS ORDENADOS ===\n");

        Collections.sort(lista);

        for(String i : lista){
            busca(i);
            aux = aux.getProximo();
        }
    }

    public void busca(String buscar){
        No aux = inicio;
        while(aux!=null){
            if (aux.toString().contains(buscar)){
                System.out.print(aux.toString());
                System.out.println();
                System.out.println("----------------------");
            }
            aux = aux.getProximo();
        }
    }

}