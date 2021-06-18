import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        CarroF1[] carro = new CarroF1[10];
        
        
        //REGISTRANDO TODOS DADOS NA ESTRUTURA E PASSANDO INDICE NO VETOR
        CarroF1 atual1 = new CarroF1();
        atual1.cadastra("Mercedes", "Mercedes 1.6 V6", "Pirelli", "Prata", "Hamilton", "Bottas", 650);
        carro[0] = atual1;
        CarroF1 atual2 = new CarroF1();
        atual2.cadastra("Aston Martin", "Mercedes 1.6 V6", "Pirelli", "Verde", "Vettel", "Stroll", 655);
        carro[1] = atual2;
        CarroF1 atual3 = new CarroF1();
        atual3.cadastra("Mclaren", "Mercedes 1.6 V6", "Pirelli", "Amarelo", "Ricciardo", "Norris", 650);
        carro[2] = atual3;
        CarroF1 atual4 = new CarroF1();
        atual4.cadastra("Alpine", "Renault 1.6 V6", "Pirelli", "Preto", "Alonso", "Ocon", 645);
        carro[3] = atual4;
        CarroF1 atual5 = new CarroF1();
        atual5.cadastra("Hass", "Ferrari1.6 V6", "Pirelli", "Branco", "Schummacher", "Mazepin", 660);
        carro[4] = atual5;
        CarroF1 atual6 = new CarroF1();
        atual6.cadastra("Alpha Romeo", "Ferrari1.6 V6", "Pirelli", "Vermelho", "Raikkonen","Giovinazzi", 640);
        carro[5] = atual6;
        CarroF1 atual7 = new CarroF1();
        atual7.cadastra("Alpha Tauri", "Honda 1.6 V6", "Pirelli", "Preto Branco", "Tsunoda", "Gasly", 640);
        carro[6] = atual7;
        CarroF1 atual8 = new CarroF1();
        atual8.cadastra("Williams", "Mercedes 1.6 V6", "Pirelli", "Azul Vermelho", "Russel", "Latifi",640);
        carro[7] = atual8;
        CarroF1 atual9 = new CarroF1();
        atual9.cadastra("Red Bull", "Honda 1.6 V6", "Pirelli", "Preto Vermelho", "Verstappen", "Perez",630);
        carro[8] = atual9;
        CarroF1 atual10 = new CarroF1();
        atual10.cadastra("Ferrari", "Ferrari 1.6 V6", "Pirelli", "Vermelho", "Sainz", "Leclerc", 630);
        carro[9] = atual10;
        
        //IMPRIMINDO VETOR COM POSICAO E O CARRO GRAVADO PARA VER COMO ESTÁ
        System.out.println("-------------------------------------------------");
        System.out.println("Todos os 10 carros foram registrados em um vetor");
        for (int i=0; i < 10; i++) {
		    System.out.println("["+i+"]"+ carro[i].getEquipe());
		}
        System.out.println("-------------------------------------------------");
        
        //FAZENDO UMA BUSCA COM O NOME DA EQUIPE
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual carro deseja puxar: ");
        String aux1 = teclado.nextLine();
        System.out.println("-------------------------------------------------");
        for (int i=0; i < 10; i++) {
		    if(carro[i].getEquipe().compareToIgnoreCase(aux1)==0){
		        //CHAMANDO FUNCOES DE GET PARA ESTRUTURAR A MENSAGEM
		        System.out.println("FICHA DO CARRO");
		        System.out.println("Equipe: " + carro[i].getEquipe());
		        System.out.println("Motor: " + carro[i].getFabri_motor());
		        System.out.println("Pneus: " + carro[i].getPneus());
		        System.out.println("Cor: " + carro[i].getCor());
		        System.out.println("Piloto1: " + carro[i].getPiloto1());
		        System.out.println("Piloto2: " + carro[i].getPiloto2());
		        System.out.println("Peso: " + carro[i].getPeso());
		    }
		}
		
		//DELETANDO ELEMENTO DO VETOR E REALOCANDO ELE
		System.out.println("-------------------------------------------------");
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Qual posicao do vetor quer remover: ");
        int aux2 = teclado2.nextInt();
        System.out.println("-------------------------------------------------");
        System.out.println("Carro removido com sucesso, o vetor foi realocado");
        
        //CLONANDO O VETOR ORIGINAL
        CarroF1[] aux = carro.clone();
        
        //SUBSTITUINDO VALORES A PARTIR DAQUELE QUE QUER REMOVER SUBTRAINDO 1 DA POSICAO
        for (int i=aux2; i < 10; i++) {
            if(i+1 < 10){
                carro[i] = aux[i+1];
            }
		}
		
		//REMOVENDO A ULTIMA POSICAO DO VETOR
		carro[carro.length - 1] = null;
		
		//IMPRIMINDO VETOR COM POSICAO E NOME PARA VER COMO FICOU
        System.out.println("O vetor ficou assim:");
        for (int i=0; i < 9; i++) {
		    System.out.println("["+i+"]"+ carro[i].getEquipe());
		}
	}
}
