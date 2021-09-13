public class Fila {
    int TAM = 10;
    No fila[];
    int comeco = -1;
    int fim = -1;

    public Fila(int tam) {
        fila = new No[tam];
        this.TAM = tam;
    }

    public void insere(No n) {
        if (comeco == -1) {
            comeco = 0;
            fim = 0;
            fila[fim] = n;
        } else if (fim < (TAM - 1)) {
            fim = fim + 1;
            fila[fim] = n;
        } else {
            System.out.println(" === FILA CHEiA === ");
        }
    }

    public No remove() {
        if (this.comeco != -1) {
            No temp = fila[comeco];
            for (int i = comeco; i < fim; i++) {
                fila[i] = fila[i + 1];
            }
            fila[fim] = null;
            fim = fim - 1;
            return temp;
        } else {
            System.out.println(" === LISTA VAZIA === ");
            return null;
        }
    }

    public void imprimeLista() {
        System.out.println(" === IMPRIME LISTA === ");
        for (int i = this.comeco; i <= this.fim; i++) {
            System.out.println("Posição: [" + i + "] " + fila[i].tostring());
        }
    }
}