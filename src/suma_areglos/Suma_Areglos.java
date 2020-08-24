
package suma_areglos;

import java.util.Scanner;

public class Suma_Areglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        // sumar el valor de cada elemento al total
        for (int contador = 0; contador < arreglo.length; contador++) {
            total += arreglo[contador];
            System.out.println(arreglo[contador]+"-->"+total);
        }

    }
}
