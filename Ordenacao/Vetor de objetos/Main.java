public class Main {
    public static void main (String[] args) {
        int chave = 10;
        int max = 150000;
        int min = 1;
        int range = max - min + 1;

        Object[] vetObj = new Object[chave];
        for (int i = 0; i < chave; i++) {
            vetObj[i] = (int)(Math.random() * range) + min;
        }
        for (int i = 0; i < chave ; i++) {
            vetObj[i] = chave -i;
        }

        Main ordena = new Main();
        ordena.bublesort(vetObj);

        Main ordena2 = new Main();
        ordena2.selectionSort(vetObj);

        Main ordena3 = new Main();
        ordena3.insertionSort(vetObj);

    }

    public static void imprimeVet(Object[] vet){
        System.out.println("");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(""+vet[i]+"|");
        }
    }

    public void bublesort(Object[] vetObj){
        Object[] vet = vetObj.clone();
        System.out.println("\nBubble Sort");
        imprimeVet(vet);
        int tam = vet.length;
        int numeroTrocas = 0;
        for (int out = (tam-1); out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if((Integer)vet[in]>(Integer)vet[in+1]){
                    int temp = (Integer)vet[in];
                    vet[in] = vet[in+1];
                    vet[in+1] = temp;
                    imprimeVet(vet);
                    numeroTrocas++;
                }
            }
            System.out.println("");
        }
        System.out.println(" <<VETOR ORDENADO>> Trocas: "+numeroTrocas);
    }

    public void selectionSort(Object[] vetObj){
        Object[] vet = vetObj.clone();
        System.out.println("\n ... Selection Sort...");
        int posMin=0;
        int minimo=0;
        int trocas = 0;
        for (int out = 0; out < vet.length; out++) {
            posMin = out;
            minimo = (Integer)vet[out];
            for (int in = out; in < vet.length; in++) {
                if((Integer)vet[posMin] > (Integer)vet[in]){
                    posMin = in;
                    minimo = (Integer)vet[in];
                }
            }
            if(posMin!=out){
                int temp = (Integer)vet[posMin];
                vet[posMin] = vet[out];
                vet[out] = temp;
                trocas++;
                imprimeVet(vet);
            }
        }
        System.out.println(" << Vetor Ordenado >> Trocas: "+trocas);
    }
    public void insertionSort(Object[] vetObj){
        Object[] vet = vetObj.clone();
        System.out.println(" \n ...Insertion Sort...");
        int trocas = 0;
        for (int out = 1; out < vet.length; out++) {
            for (int in = out; in > 0; in--) {
                if((Integer)vet[in] < (Integer)vet[in-1]){
                    int temp = (Integer)vet[in];
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
    }
}
