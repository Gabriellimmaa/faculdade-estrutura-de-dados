public class Main {
    public static void main(String[] args) {
        int tamVet = 100;
        int []lista = new int[tamVet];
        for (int i = 0; i < tamVet; i++) {
            lista[i] = i+1;
        }

        int resultado = somatorio(lista, 0);;
        System.out.println(resultado);
    }

    public static int somatorio(int[] lista, int i) {
        if (i < lista.length){
            if(lista[i] % 2 == 0) {
                return lista[i] + somatorio(lista,i + 1);
            }else{
                return somatorio(lista, i+1);
            }
        }
        else{
            return 0;
        }
    }
}
