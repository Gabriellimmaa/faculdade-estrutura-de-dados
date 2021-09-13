public class Carro {

    String nome;
    String marca;
    String cor;
    double valor;
    int qtd;

    public void cadastraProd(String _nome, String _marca, String _cor, double _valor, int _qtd) {
        nome = _nome;
        marca = _marca;
        cor = _cor;
        valor = _valor;
        qtd = _qtd;
    }

    public String toString() {
        return "| Carro: " + nome + "| Marca: " + marca + "| Cor: " + cor + "| Valor: " + valor + "| Quantidade: " + qtd;
    }
}