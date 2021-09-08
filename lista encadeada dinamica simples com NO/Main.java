import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaDinamica listaAtleta = new ListaEncadeadaDinamica();
        int opcao = 0;
        Scanner menu = new Scanner (System.in);
        do {
            System.out.println("");
            System.out.println(" =========================");
            System.out.println("|     1 - Inserir         |");
            System.out.println("|     2 - Remover         |");
            System.out.println("|     3 - Buscar          |");
            System.out.println("|     4 - Imprimir        |");
            System.out.println(" =========================\n");

            System.out.print("Digite a opção: ");
            opcao = menu.nextInt();
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    Scanner teclado = new Scanner (System.in);
                    System.out.print("Nome: ");
                    String _nome = teclado.next();
                    System.out.print("\nAltura: ");
                    Double _altura = teclado.nextDouble();
                    System.out.print("\nPeso: ");
                    Double _peso = teclado.nextDouble();
                    System.out.print("\nEsporte: ");
                    String _esporte = teclado.next();
                    System.out.print("\nPatrocinadores: ");
                    String _patrocinadores = teclado.next();
                    listaAtleta.insereFim(new No(_nome, _altura, _peso, _esporte, _patrocinadores));
                    break;
                case 2:
                    Scanner teclado2 = new Scanner (System.in);
                    System.out.print("Nome: ");
                    String _nomeRemover = teclado2.next();
                    listaAtleta.remove(_nomeRemover);

                    break;
                case 3:
                    Scanner teclado3 = new Scanner (System.in);
                    System.out.print("Nome: ");
                    String _nomeBusca = teclado3.next();
                    System.out.print(_nomeBusca);
                    No atleta = listaAtleta.busca(_nomeBusca);
                    System.out.println(" === RESULTADO BUSCA ===\n"+atleta.toString());
                    break;
                case 4:
                    listaAtleta.imprimeLista();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}