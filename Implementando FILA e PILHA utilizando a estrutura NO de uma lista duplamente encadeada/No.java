public class No {
    int valor;
    No prox;
    No ant;

    public No(int x){
        setValor(x);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    @Override
    public String toString(){
        return "Valor: ["+valor+"]";

    }

}
