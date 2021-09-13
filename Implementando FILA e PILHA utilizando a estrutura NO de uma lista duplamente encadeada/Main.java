class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        Pilha pilha = new Pilha(5);


        System.out.println(" ================ IMPLEMENTANDO A FILA ================ ");
        for (int i = 0; i < 5; i++) {
            No no = new No(i);
            fila.insere(no);
        }
        System.out.println(" === VALORES INSERIDOS === ");
        fila.imprimeLista();
        fila.remove();
        fila.remove();
        System.out.println(" === VALORES REMOVIDOS === ");
        fila.imprimeLista();


        System.out.println(" ================ IMPLEMENTANDO A PILHA ================ ");
        for (int i = 0; i < 5; i++) {
            No no = new No(i);
            pilha.empilha(no);
        }
        System.out.println(" === VALORES INSERIDOS === ");
        pilha.imprimePilha();
        pilha.desempilha();
        pilha.desempilha();
        System.out.println(" === VALORES REMOVIDOS === ");
        pilha.imprimePilha();
    }
}