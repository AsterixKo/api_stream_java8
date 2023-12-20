package org.aguzman.api.stream.tareas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tarea3 {
    /**
     * El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel
     * y eliminar repetidos usando el api stream.
     * Aplanar un arreglo significa quitar los elementos del arreglo anidado
     * y dejarlos en el arreglo de primer nivel.
     * <p>
     * Por ejemplo, para el arreglo:
     * <p>
     * String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
     * <p>
     * debería quedar:
     * <p>
     * {"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
     */
    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        String[] result = Arrays.stream(lenguajes)
                .flatMap(x -> Arrays.stream(x))
                .distinct()
                .peek(System.out::println)
                .toArray(String[]::new);


        // hecho por el profe


//                String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .forEach(e -> System.out.println(e));

//        Forma 2 con función lambda

//        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Function<String[][], List<String>> flatten = arr -> Arrays.stream(arr).flatMap(a -> Arrays.stream(a))
                .distinct()
                .collect(Collectors.toList());

        flatten.apply(lenguajes).forEach(e -> System.out.println(e));
    }
}
