import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Dados ct[] = new Dados[50];
        
    	for(int i = 0; i < 50; i++){
            do{
    			System.out.println("[1] Criar Conta");
    			System.out.println("[2] Depositar");
    			System.out.println("[3] Sacar");
    			System.out.println("[4] Buscar");
    			System.out.println("[5] Sair");
    
    			Scanner sc = new Scanner(System.in);
    			int opcao;
    
    			System.out.println("\n> Qual a opcao escolhida? ");
                opcao = sc.nextInt();
    
    			switch(opcao){
    				case 1: 
    				    ct[i] = new Dados();
    				    
    				    Scanner sc1conta = new Scanner(System.in);
    			        System.out.print("> Digite o numero da conta: ");
    			        int numeroConta = sc1conta.nextInt();
    			        
    			        Scanner sc1agencia = new Scanner(System.in);
    			        System.out.print("> Digite o numero da agencia: ");
    			        int numeroAgencia = sc1agencia.nextInt();
    			        
    			        Scanner sc1nome = new Scanner(System.in);
    			        System.out.print("> Digite o nome do titular: ");
    			        String nomeUsuario = sc1nome.nextLine();
    			        try{
    					    for(int x = 0; x < 50; x++){
    					        if(ct[x].getNome().equals(nomeUsuario)){
				        	        System.out.println("ERRO! Este nome já está registrado em uma conta\n");
    					            break;
    					        }
    					    }
    			        }catch (Exception e){
    			            ct[i].cadastrar(nomeUsuario, numeroConta, numeroAgencia);
    			            i++;
				        }
    			        break;
    			    case 2:
    			        Scanner sc2nome = new Scanner(System.in);
						System.out.print("> Informe o nome do titular: ");
						String nomeConta2 = sc2nome.nextLine();
					    try{
    					    for(int x = 0; x < 50; x++){
    					        if(ct[x].getNome().equals(nomeConta2)){
                			        Scanner sc2valor = new Scanner(System.in);
            						System.out.print("> Informe o valor do deposito: ");
                                    double valor = Double.parseDouble(sc2valor.next());
                                    ct[x].depositar(valor);
    					            break;
    					        }
    					    }
    			        }catch (Exception e){
				        	System.out.println("ERRO! Este nome não corresponde a nenhuma conta\n");
				        }
						break;
				    case 3:
				        Scanner sc3nome = new Scanner(System.in);
						System.out.print("> Informe o nome do titular: ");
						String nomeConta3 = sc3nome.nextLine();
						try{
    					    for(int x = 0; x < 50; x++){
    					        if(ct[x].getNome().equals(nomeConta3)){
                			        Scanner sc3valor = new Scanner(System.in);
            						System.out.print("> Informe o valor do deposito: ");
                                    double valor = Double.parseDouble(sc3valor.next());
                                    ct[x].retirar(valor);
    					            break;
    					        }
    					    }
    			        }catch (Exception e){
				        	System.out.println("ERRO! Este nome não corresponde a nenhuma conta\n");
				        }
						break;
    			    case 4:
    				    Scanner sc4 = new Scanner(System.in);
						System.out.print("> Informe o nome do titular: ");
						String nomeConta4 = sc4.nextLine();
						try{
    					    for(int x = 0; x < 50; x++){
    					        if(ct[x].getNome().equals(nomeConta4)){
        					        ct[x].buscar();
    					            break;
    					        }
    					    }
						}catch (Exception e){
				        	System.out.println("ERRO! Este nome não corresponde a nenhuma conta\n");
				        }
						break;
				    case 5: 
				        System.exit(0);
    			}
    
    		}while (true);
    	}
	}
}
