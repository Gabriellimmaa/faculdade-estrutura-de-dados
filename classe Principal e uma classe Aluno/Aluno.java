
public class Aluno
{
    String nome;
    Float nota_ed;
    
    public void atribuirNota(float nota){
        this.nota_ed = nota;
    }
    
    public float verNota(){
        return this.nota_ed;
    }
    
    public String verNome(){
        return this.nome;
    }
    
    public void atribuirNome(String n){
        this.nome = n;
    }
}
