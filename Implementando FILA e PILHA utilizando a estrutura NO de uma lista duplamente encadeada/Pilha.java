public class Pilha {
    No pilha[];
    int TAM;
    int topo = -1;

    public Pilha(int tam) {
        pilha = new No[tam];
        this.TAM = tam;
    }

    public void empilha(No n) {
        if (topo == -1 || topo < (this.TAM - 1)) {
            topo = topo + 1;
            pilha[topo] = n;
        } else {
            System.out.println(" === PILHA CHEIA === ");
        }
    }

    public No desempilha() {
        if (topo != -1) {
            No temp = pilha[topo];
            pilha[topo] = null;
            topo = topo - 1;
            return temp;
        } else {
            System.out.println(" === PILHA VAZIA ====");
            return null;
        }
    }

    public void imprimePilha() {
        System.out.println(" === IMPRIME PILHA === ");
        for (int i = this.topo; i >= 0; i--) {
            System.out.println("Posição: [" + i + "] " + pilha[i].tostring());
        }
    }
}