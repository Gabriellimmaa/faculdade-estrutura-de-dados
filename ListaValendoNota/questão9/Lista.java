public class Lista {
    private int primeiro = -1;
    private int ultimo = -1;
    //definicao de uma constante
    private final int TAM=8;
    
    //Declara a estrutura lista do tipo No
    static int listaOrd[] = new int [8];

    public void insere(int n){
        if(primeiro == -1){
            //lista vazia...inserir
            primeiro = 0;
            ultimo = 0;
            listaOrd[primeiro] = n;
        }
        else if((ultimo+1)<TAM){
            //insere na lista...            
            int posIns = -1;
            //localizar posição de inserção...
            for (int i = primeiro; i <= ultimo; i++) {
                if(Integer.compare(listaOrd[i], n) > 0){
                    posIns = i;
                    break; //força a saída do FOR!
                }                
            }
            if( posIns == -1) 
                posIns = ultimo+1;
            
            for (int i = ultimo; i >= posIns; i--) {
                listaOrd[i+1] = listaOrd[i];                
            }
            //insere na posição de inserção o elemento novo
            listaOrd[posIns] = n;
            //atualiza ponteiro ultimo
            ultimo = ultimo +1;
            System.out.println("===Inserido com sucesso!===");
        }
        else
            System.out.println("===Lista cheia===");        
    }
    public void imprimeLista(){
        if(primeiro!=-1){
            System.out.println("=== IMPRIME LISTA ===");
            for (int i = primeiro; i <= ultimo; i++) {
                System.out.println(i+" : "+listaOrd[i]);
            }
        }
        else
            System.out.println("== LISTA VAZIA ==");
    }
    public int busca(int b){
        for (int i = primeiro; i <= ultimo; i++) {
            if(listaOrd[i] == b)
                return i;
        }
        return -1;
    }
    public void remove(int rem){
        System.out.println("==Remocao==");
        int posRem = busca(rem);
        //desloca os elementos uma posicao anterior
        if(posRem!=-1){
            for (int i = posRem; i < ultimo; i++) {
                listaOrd[i] = listaOrd[i+1];                
            }
            ultimo = ultimo - 1;
        }
    }
    public void limpalista(){
        System.out.println("===Limpando a lista===");
        primeiro = -1;
        ultimo = -1;
    }
}
