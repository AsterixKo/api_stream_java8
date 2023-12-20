package org.aguzman.api.stream.tareas;

import java.util.Arrays;
import java.util.function.Function;

public class Tarea2 {
    /**
     * El siguiente ejercicio es obtener el numero mayor de un arreglo
     * pero utilizando programación funcional, implementando la expresión
     * lambda Function<T,R> (que viene predefinida) con el api stream y operador reduce.
     */
    public static void main(String[] args) {

        // la función lambda que obtiene el numero mayor del arreglo usando api stream en su implementación
        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (ac, e) -> ac > e? ac: e);

        int resultado = max.apply(new Integer[]{1, 78, -1700, 2500, 0, 2000, 54, 2});
        System.out.println(resultado);

//        int[] arreglo = {2, 45, 3, 6, 7, 2, 3, 10, 40};
//
//        double total = Arrays.stream(arreglo)
//                .reduce(0, (ac, e) -> {
//                    return Math.max(ac, e);
//                });
//
//        System.out.println(total); // 45

    }
}
