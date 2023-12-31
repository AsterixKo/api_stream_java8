package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamFilterDistinctUsuarioSum {
    public static void main(String[] args) {

        //-------------------------------------------------------------
        IntStream largoNombres = Stream.of(
                        "Pato Guzman",
                        "Paco Gonzalez",
                        "Pepa Gutierrez",
                        "Pepe Mena",
                        "Pepe Garcia",
                        "Pato Guzman",
                        "Pato Guzman",
                        "Pato Guzman")
//                .distinct()
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct() // Tiene que estar implementado el método equals
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

//        largoNombres.forEach(System.out::println);
        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("######");
        System.out.println("total = " + stats.getSum());
        System.out.println("max = " + stats.getMax());
        System.out.println("min = " + stats.getMin());
        System.out.println("promedio = " + stats.getAverage());
    }
}
