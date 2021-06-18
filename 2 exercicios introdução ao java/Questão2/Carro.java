public class Carro
{
    String Marca;
    String Modelo;
    int AnoFabricacao;
    int NumPortas;
    
    public void atribuirDados(String marca, String modelo, int anoFabricacao, int numPortas){
        this.Marca = marca;
        this.Modelo = modelo;
        this.AnoFabricacao = anoFabricacao;
        this.NumPortas = numPortas;
    }
    
    public String exibirMarca() {
        return this.Marca;
    }
    
    public String exibirModelo() {
        return this.Modelo;
    }
    
    public int exibirAnoFabricacao() {
        return this.AnoFabricacao;
    }

    public int exibirNumPortas() {
        return this.NumPortas;
    }
}
