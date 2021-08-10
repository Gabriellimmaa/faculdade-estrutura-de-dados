import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Lista l = new Lista();
        boolean status = true;

        do{
            System.out.println("--------------------------------------------");
            System.out.println("[1] Inserir item    |   [5] Imprimir lista");
            System.out.println("[2] Remover item    |   [6] Calcular total");
            System.out.println("[3] Buscar item     |   [7] Finalizar");
            System.out.println("[4] Limpar lista    |");

            Scanner sc = new Scanner(System.in);
            int opcao;

            System.out.println("\n> Digite sua opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    Scanner scnome1 = new Scanner(System.in);
                    System.out.print("> Digite o nome do item: ");
                    String nome1 = scnome1.nextLine();

                    Scanner scvalor1 = new Scanner(System.in);
                    System.out.print("> Digite o valor do item: ");
                    double valor = scvalor1.nextDouble();

                    Scanner scquantidade1 = new Scanner(System.in);
                    System.out.print("> Digite q quantidade do item: ");
                    int quantidade = scquantidade1.nextInt();

                    Produto p = new Produto();
                    p.preencheProd(nome1, valor, quantidade);
                    l.insere(new No(p));
                    break;
                case 2:
                    Scanner scnome2 = new Scanner(System.in);
                    System.out.print("> Digite o nome do item: ");
                    String nome2 = scnome2.nextLine();
                    l.remove(nome2);
                    break;
                case 3:
                    Scanner scnome3 = new Scanner(System.in);
                    System.out.print("> Digite o nome do item: ");
                    String nome3 = scnome3.nextLine();

                    System.out.println("-----------------BUSCAR ITEM----------------");
                    System.out.println(l.busca(nome3));
                    break;
                case 4:
                    l.limpaLista();
                    break;
                case 5:
                    l.imprimeLista();
                    break;
                case 6:
                    new ListaCompras().calculoTotal();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }while (status == true);
    }
}
