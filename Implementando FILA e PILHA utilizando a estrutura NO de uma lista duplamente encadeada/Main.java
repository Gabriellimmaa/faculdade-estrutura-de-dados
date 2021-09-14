class Main {
    public static void main(String[] args) {
        System.out.println(" ================ IMPLEMENTANDO A FILA ================ ");
        Fila fila = new Fila();
        for (int i = 0; i < 5; i++) {
            fila.insere(i);
        }
        System.out.println(" === VALORES INSERIDOS === ");
        System.out.println(fila.imprimirFila());

        fila.remove();
        System.out.println(" === VALORES REMOVIDOS === ");
        System.out.println(fila.imprimirFila());

        System.out.println(" ================ IMPLEMENTANDO A PILHA ================ ");
        Pilha pilha = new Pilha();
        for (int i = 0; i < 5; i++) {
            No novo = new No(i);
            pilha.empilha(novo);
        }
        System.out.println(" === VALORES INSERIDOS === ");
        pilha.imprimirPilha();

        pilha.desempilha();
        System.out.println(" === VALORES REMOVIDOS === ");
        pilha.imprimirPilha();
    }
}
