import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Aluno a1 = new Aluno();
        System.out.println("Digite o nome do aluno a1: ");
        String nome_a1 = teclado.nextLine();
        a1.atribuirNome(nome_a1);
        System.out.println("Digite a nota do aluno a1: ");
        float nota_a1 = teclado.nextFloat();
        a1.atribuirNota(nota_a1);

        Scanner teclado2 = new Scanner(System.in);
        Aluno a2 = new Aluno();
        System.out.println("Digite o nome do aluno a2: ");
        String nome_a2 = teclado2.nextLine();
        a2.atribuirNome(nome_a2);
        System.out.println("Digite a nota do aluno a2: ");
        float nota_a2 = teclado2.nextFloat();
        a2.atribuirNota(nota_a2);

        Aluno a3 = new Aluno();
        a3.atribuirNome("Nome3");
        a3.atribuirNota(5.5f);

        Aluno a4 = new Aluno();
        a4.atribuirNome("Nome4");
        a4.atribuirNota(7.5f);

        Aluno a5 = new Aluno();
        a5.atribuirNome("Nome5");
        a5.atribuirNota(8.0f);

        System.out.println("Aluno: " + a1.verNome() + "         Nota:" + a1.verNota());
        System.out.println("Aluno: " + a2.verNome() + "         Nota:" + a2.verNota());
        System.out.println("Aluno: " + a3.verNome() + "         Nota:" + a3.verNota());
        System.out.println("Aluno: " + a4.verNome() + "         Nota:" + a4.verNota());
        System.out.println("Aluno: " + a5.verNome() + "         Nota:" + a5.verNota());
    }
}
