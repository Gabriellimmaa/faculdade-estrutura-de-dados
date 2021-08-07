public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.insere(1);
        lista.insere(15);
        lista.remove(3);
        lista.insere(4);
        lista.remove(7);
        lista.limpalista();
        lista.insere(10);
        lista.insere(9);
        lista.insere(5);
        lista.insere(7);
        lista.imprimeLista();

    }
}
