public abstract class ListaEstatica {
    public int prim;
    static public int ultimo = -1;

    abstract public void insere(No n);
    abstract public void limpaLista();
    abstract public No busca(String s);
    abstract public void remove(String r);
    abstract public void imprimeLista();
}
