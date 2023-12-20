package org.aguzman.api.stream.tareas;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Tarea1 {
    /**
     * Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int,
     * utilizando el api stream se pide eliminar los divisibles en 10,
     * luego convertir los elementos restante del flujo en tipo double y
     * dividirlos en 2, para finalmente devolver la suma total de todos ellos
     * usando el operador terminal reduce. El resultado debería ser 2250.0
     */
    public static void main(String[] args) {

        int[] arreglo = new int[100];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i+1;
        }

        double total = Arrays.stream(arreglo)
                .filter(e -> e % 10 != 0)
                .mapToDouble(e -> (double) e / 2)
                .reduce(0, (ac, e) -> ac + e);

        System.out.println(total); // 2250.0



//        double resultado = IntStream.rangeClosed(1, 100)
//                .peek(System.out::println)
//                .filter(n -> n % 10 > 0)
//                .mapToDouble(n -> (double) n)
//                .map(n -> n / 2)
//                .reduce(0, (a, b) -> a + b);
//
//        System.out.println("resultado = " + resultado);
    }
}
