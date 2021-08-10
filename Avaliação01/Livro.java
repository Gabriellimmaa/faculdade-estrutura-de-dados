public class Livro {
    long isbn;
    String autor;
    String nome;
    int numPaginas;
    String categoria;
    String emprestado;

    public void inserirLivro(long _isbn, String _autor, String _nome, int _numPaginas, String _categoria, String _emprestado) {
        this.isbn = _isbn;
        this.autor = _autor;
        this.nome = _nome;
        this.numPaginas = _numPaginas;
        this.categoria = _categoria;
        this.emprestado = _emprestado;
    }

    @Override
    public String toString() {
        return "isbn=" + isbn + "| autor='" + autor + '\'' + "| nome='" + nome + '\'' + "| numPaginas=" + numPaginas + "| categoria='" + categoria + '\'' + "| emprestado='" + emprestado + '\'';
    }
}
