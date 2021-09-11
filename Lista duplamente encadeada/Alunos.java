public class Aluno {
    String nome;
    int matricula;
    double nota;
    String curso;

    public Aluno(String a, int b, double c, String d){
        nome = a;
        matricula = b;
        nota = c;
        curso = d;

    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return "Aluno: "+nome+"| Matricula: "+matricula+"| Nota: "+nota+"| Curso: "+curso;
    }
}
