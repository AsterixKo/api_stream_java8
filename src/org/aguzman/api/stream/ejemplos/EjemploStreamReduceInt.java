package org.aguzman.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------");
        Stream<Integer> nombres = Stream.of(
                        5, 10, 15, 20)
                .distinct();
        int resultado = nombres.reduce(0, (a, b) -> a + b);
        System.out.println(resultado);

    }
}
