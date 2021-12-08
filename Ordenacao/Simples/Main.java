public class Main {
    public static void main(String[] args) {
        int max = 150000; 
        int min = 1; 
        int range = max - min + 1; 
        int tamVet = 10;
        
        int vet[] = new int[] {21, 71, 7, 1, 3, 2, 15, 12};

        imprimeVet(vet);
        Main ordena = new Main();
        vet = ordena.bublesort(vet);
        //vet = ordena.selectionSort(vet);
        //vet = ordena.insertionSort(vet);
    }
    public static void imprimeVet(int vet[]){
        System.out.println("");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(""+vet[i]+" | ");
        }        
    }
    public int[] bublesort(int vet[]){
        System.out.println("\n ...Buble Sort...");
        int tam = vet.length;
        int numeroTrocas = 0;
        for (int out = (tam-1); out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if(vet[in]>vet[in+1]){
                    int temp = vet[in];
                    vet[in] = vet[in+1];
                    vet[in+1] = temp;
                    imprimeVet(vet);
                    numeroTrocas++;
                }                
            }
            System.out.println("");
        }
        System.out.println(" <<VETOR ORDENADO>> Trocas: "+numeroTrocas);        
        return vet;
    }
    public int[] selectionSort(int vet[]){
        System.out.println("\n ... Selection Sort...");
        int posMin=0;
        int minimo=0;
        int trocas = 0;
        for (int out = 0; out < vet.length; out++) {
            posMin = out;
            minimo = vet[out];
            for (int in = out; in < vet.length; in++) {                
                if(vet[posMin] > vet[in]){
                    posMin = in;
                    minimo = vet[in];                    
                }                                
            }
            if(posMin!=out){
                int temp = vet[posMin];
                vet[posMin] = vet[out];
                vet[out] = temp;
                trocas++;
                imprimeVet(vet);
            }                
        }
        System.out.println(" << Vetor Ordenado >> Trocas: "+trocas);
        return vet;
    }
    public int[] insertionSort(int vet[]){
        System.out.println(" \n ...Insertion Sort...");
        int trocas = 0;
        for (int out = 1; out < vet.length; out++) {            
            for (int in = out; in > 0; in--) {
                if(vet[in] < vet[in-1]){
                    int temp = vet[in];
                    vet[in] = vet[in-1];
                    vet[in-1] = temp;
                    trocas++;
                    imprimeVet(vet);
                }
                else
                    break; 
            }            
        }
        System.out.println(" << Vetor Ordenado >> Trocas: "+trocas);
        return vet;
    }
    
    
    
}
