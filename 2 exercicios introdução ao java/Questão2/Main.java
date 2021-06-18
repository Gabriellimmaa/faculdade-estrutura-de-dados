import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Carro car1 = new Carro();
        System.out.println("CARRO 1");
        System.out.println("Marca: ");
        String car1_marca = teclado.nextLine();
        System.out.println("Modelo: ");
        String car1_modelo = teclado.nextLine();
        System.out.println("AnoFabricacao: ");
        int car1_anoFabricacao = teclado.nextInt();
        System.out.println("NumPortas: ");
        int car1_numPortas = teclado.nextInt();
        car1.atribuirDados(car1_marca, car1_modelo, car1_anoFabricacao, car1_numPortas);

        Scanner teclado2 = new Scanner(System.in);
        Carro car2 = new Carro();
        System.out.println("CARRO 2");
        System.out.println("Marca: ");
        String car2_marca = teclado2.nextLine();
        System.out.println("Modelo: ");
        String car2_modelo = teclado2.nextLine();
        System.out.println("AnoFabricacao: ");
        int car2_anoFabricacao = teclado2.nextInt();
        System.out.println("NumPortas: ");
        int car2_numPortas = teclado2.nextInt();
        car2.atribuirDados(car2_marca, car2_modelo, car2_anoFabricacao, car2_numPortas);
        
        Scanner teclado3 = new Scanner(System.in);
        Carro car3 = new Carro();
        System.out.println("CARRO 3");
        System.out.println("Marca: ");
        String car3_marca = teclado3.nextLine();
        System.out.println("Modelo: ");
        String car3_modelo = teclado3.nextLine();
        System.out.println("AnoFabricacao: ");
        int car3_anoFabricacao = teclado3.nextInt();
        System.out.println("NumPortas: ");
        int car3_numPortas = teclado3.nextInt();
        car3.atribuirDados(car3_marca, car3_modelo, car3_anoFabricacao, car3_numPortas);
        
        System.out.println("----------------------------");
        System.out.println("Marca: " + car1.exibirMarca());
        System.out.println("Modelo: " + car1.exibirModelo());
        System.out.println("Ano de fabricação: " + car1.exibirAnoFabricacao());
        System.out.println("Número de portas: " + car1.exibirNumPortas());
        System.out.println("----------------------------");
        System.out.println("Marca: " + car2.exibirMarca());
        System.out.println("Modelo: " + car2.exibirModelo());
        System.out.println("Ano de fabricação: " + car2.exibirAnoFabricacao());
        System.out.println("Número de portas: " + car2.exibirNumPortas());
        System.out.println("----------------------------");
        System.out.println("Marca: " + car3.exibirMarca());
        System.out.println("Modelo: " + car3.exibirModelo());
        System.out.println("Ano de fabricação: " + car3.exibirAnoFabricacao());
        System.out.println("Número de portas: " + car3.exibirNumPortas());
        System.out.println("----------------------------");
    }
}
