public class Lista {
    static No lista[] = new No[2000];
    static int ultimo = -1;

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

    //imprime lista
    public void imprimeLista() {
        System.out.println("-------------IMPRIMIR LISTA-----------------");
        for (int i = 0; i <= ultimo; i++) {
            System.out.println("Posição: " + i + " | " + lista[i].toString());
        }
    }

    //busca na lista
    public No buscaTitulo(String s) {
        int index = -1;
        for (int i = 0; i <= ultimo; i++) {
            if (lista[i].toString().contains(s)) {
                index += 1;
                index += i;
            }
        }
        System.out.println("-------------BUSCAR TITULO-----------------");
        try {
            No aux = lista[index];
            return aux;
        } catch (Exception e) {
            return null;
        }
    }

}