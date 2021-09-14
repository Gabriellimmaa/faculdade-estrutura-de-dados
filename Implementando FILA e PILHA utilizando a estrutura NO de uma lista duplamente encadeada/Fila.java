public class Fila {
    No inicio;
    No fim;

    public boolean vazia() {
        return inicio == null && fim == null;
    }

    public void insere(int dado) {
        No novo = new No(dado);
        if (vazia()) {
            inicio = novo;
            fim = novo;
            fim.setProx(inicio);
        } else {
            novo.setProx(inicio);
            fim.setProx(novo);
            fim = novo;
        }
    }

    public void remove() {
        if (vazia()) {
            System.out.println("=== FILA VAZIA ===");
        } else if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProx();
        }
    }

    public String imprimirFila() {
        System.out.println(" === IMPRIME FILA === ");

        String listados = "";
        if (vazia()) {
            return "=== FILA VAZIA ===";
        } else if (inicio == fim) {
            listados = "Valor: [" + inicio.getValor()+"]";
        } else {
            No aux = inicio;
            if (aux == fim.getProx()) {
                listados = listados + "Valor: [" + aux.getValor()+"]\n";
                aux = aux.getProx();
            }
            while (aux != fim.getProx()) {
                listados = listados +"Valor: [" + aux.getValor()+"]\n";
                aux = aux.getProx();
            }
        }
        return listados;

    }


}
