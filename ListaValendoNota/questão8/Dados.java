public class Dados {
    String nomeTitular;
    int numeroConta;
    int numeroAgencia;
    double saldoConta;

    public Dados(){
    }

    public void cadastrar(String _nome, int _numeroConta, int _numeroAgencia){
        nomeTitular = _nome;
        numeroConta = _numeroConta;
        numeroAgencia = _numeroAgencia;
        saldoConta = 0;
        System.out.println("Conta cadastrada com sucesso\n");
    }


    public void buscar(){
	    System.out.println("Nome: "+ nomeTitular);
        System.out.println("Nmr Conta: "+ numeroConta);
        System.out.println("Nmr Agencia: "+ numeroAgencia);
        System.out.println("Saldo: "+ saldoConta);
    }
    
    public void depositar(double _quantidade){
        saldoConta += _quantidade;
        System.out.println("Saldo atualizado: "+ saldoConta);
    }
    
    public void retirar(double _quantidade){
        double auxiliar = this.saldoConta - _quantidade;
        saldoConta = auxiliar;
        System.out.println("Saldo atualizado: "+ saldoConta);
    }
    
    public String getNome(){
        return nomeTitular;
    }
}
