public class Pilha {
    No top;
    No inicio;

    Pilha() {
        inicio = null;
        top = null;
    }

    boolean vazia() {
        return top == null;
    }

    public void empilha(No novo) {
        if(inicio == null){
            inicio = novo;
            top  = novo;
        }
        else{
            novo.setProx(top);
            top = novo;
        }
    }

    public void desempilha(){
        if (!vazia()) {
            top = top.getProx();
        } else {
            System.out.println(" === PILHA VAZIA === ");
        }
    }

    public void imprimirPilha() {
        System.out.println(" === IMPRIME PILHA === ");
        No p;
        p = top;
        while (p != null) {
            System.out.println(p.toString());
            p = p.getProx();
        }

    }

}
