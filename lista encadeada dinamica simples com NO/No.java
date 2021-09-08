public class No {
    Object obj;
    No proximo;

    String nome;
    Double altura;
    Double peso;
    String esporte;
    String patrocinadores;

    public No(String _nome, Double _altura, Double _peso, String _esporte, String _patrocinadores){
        nome = _nome;
        altura = _altura;
        peso = _peso;
        esporte = _esporte;
        patrocinadores = _patrocinadores;
    }

    public String toString(){
        return "Nome: "+nome+" Altura: "+altura+" Peso: "+peso+" Esporte: "+esporte+" Patrocinadores: "+patrocinadores;
    }

    public void setProximo(No n){
        proximo = n;
    }
    public No getProximo(){
        return proximo;
    }

}
