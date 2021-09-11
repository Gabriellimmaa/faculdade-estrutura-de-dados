public class Main {
    public static void main(String[] args) {
        ListaEncadeadaDinamicaDupla listaLivros = new ListaEncadeadaDinamicaDupla();

        Aluno l1 = new Aluno("Wesley", 22178901, 8.5, "Ciência da Computação");
        Aluno l2 = new Aluno("Carlos", 22178911, 6.5, "Administração");
        Aluno l3 = new Aluno("Alice", 22178922, 6.9, "Agronomia");
        Aluno l4 = new Aluno("Bruno", 22178922, 6.9, "Fisioterapia");
        Aluno l5 = new Aluno("Alisson", 22178922, 6.9, "Marketing");
        Aluno l6 = new Aluno("Carol", 22178922, 6.9, "Engenharia civil");


        listaLivros.cadastrar(new No(l1), l1.getNome());
        listaLivros.cadastrar(new No(l2), l2.getNome());
        listaLivros.cadastrar(new No(l3), l3.getNome());
        listaLivros.cadastrar(new No(l4), l4.getNome());
        listaLivros.cadastrar(new No(l5), l5.getNome());
        listaLivros.cadastrar(new No(l6), l6.getNome());

        listaLivros.imprimeAlunos();
    }
}