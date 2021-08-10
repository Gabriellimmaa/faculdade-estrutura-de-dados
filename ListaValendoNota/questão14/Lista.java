public class Lista extends ListaEstatica {
    static No lista[] = new No[5];

    //insercao no final da lista
    public void insere(No n) {
        //insere no vetor
        if (ultimo == -1 || ultimo < (lista.length - 1)) {
            //vetor vazio
            ultimo++;
            lista[ultimo] = n;
            System.out.println("-------------ITEM ADICIONADO-----------------");
        }
    }

    //remove
    public void remove(String r) {
        int s = 0;
        for (int i = 0; i <= ultimo; i++) {
            if (lista[i].toString().contains(r)) {
                s += i;
            }
        }

        No aux = lista[s];
        for (int i = s; i < ultimo; i++) {
            lista[i] = lista[i + 1];
        }
        lista[ultimo] = null;
        ultimo--;
        System.out.println("--------------ITEM REMOVIDO-----------------");
    }

    //imprime lista
    public void imprimeLista() {
        System.out.println("-------------IMPRIMIR LISTA-----------------");
        for (int i = 0; i <= ultimo; i++) {
            System.out.println("Posição: " + i + " | " + lista[i].toString());
        }
    }

    //busca na lista
    public No busca(String s) {
        int index = -1;
        for (int i = 0; i <= ultimo; i++) {
            if (lista[i].toString().contains(s)) {
                index += 1;
                index += i;
            }
        }
        try {
            No aux = lista[index];
            return aux;
        } catch (Exception e) {
            return null;
        }
    }


    public void limpaLista() {
        for (int i = 0; i <= ultimo; i++) {
            lista[i] = null;
        }
        System.out.println("--------------LIMPAR LISTA------------------");
        ultimo = -1;
    }
}