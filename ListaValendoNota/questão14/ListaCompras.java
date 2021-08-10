import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListaCompras extends Lista {
    public void calculoTotal() {
        double total =0;
        for (int i = 0; i <= ultimo; i++) {
            Matcher m = Pattern.compile("\\d+\\.\\d+").matcher(lista[i].toString());
            while(m.find()){
                double d = Double.parseDouble(m.group());
                total += d;
            }
        }
        System.out.println("----------------CALCULO TOTAL---------------");
        System.out.println(total);

    }
}
