package org.aguzman.api.stream.tareas;

import org.aguzman.api.stream.tareas.models.Producto;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Tarea4 {
    /**
     * El siguiente requerimiento es para una lista de productos
     * List<Producto> , de 3 a 5 elementos, se pide calcular el
     * importe (precio por cantidad) y sumarlos.
     * <p>
     * La clase Producto debe tener el atributo precio del tipo
     * double y cantidad int, entonces utilizando stream convertir la
     * lista de productos en el gran total del tipo double.
     */
    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
                new Producto("pendrive", 2.5, 1),
                new Producto("pantalla", 50, 2),
                new Producto("teclado", 10, 1),
                new Producto("ratón", 100, 1),
                new Producto("router", 40, 1)
        );

        DoubleSummaryStatistics result = productos.stream()
                .collect(Collectors.summarizingDouble(product -> product.getPrecio() * product.getCantidad()));

        System.out.println(result);
        System.out.println("count = " + result.getCount());
        System.out.println("Sum = " + result.getSum());
        System.out.println("Max price = " + result.getMax());
        System.out.println("Min price = " + result.getMin());
        System.out.println("Average price = " + result.getAverage());

        // otra forma
        System.out.println("-------------------------------------------");
        double resultado2 = productos.stream()
                .map(p -> p.getPrecio() * p.getCantidad())
                .reduce(0.0, (ac, b) -> ac + b);
        System.out.println("resultado2 = " + resultado2);

        // hecho por el profe

//        Forma 1:
        System.out.println("-------------------------------------------");
        List<Producto> facturas = Arrays.asList(
                new Producto("pantalla", 9.99, 1),
                new Producto("ratón", 19.99, 1),
                new Producto("teclado", 4.99, 2));
        double sum = facturas.stream()
                .map(p -> p.getCantidad() * p.getPrecio())
                .reduce(0d, Double::sum);
        System.out.println(sum);
//        Forma 2:
        System.out.println("-------------------------------------------");
        List<Producto> facturas2 = Arrays.asList(
                new Producto("pantalla", 9.99, 1),
                new Producto("ratón", 19.99, 1),
                new Producto("teclado", 4.99, 2));

        double sum2 = facturas2.stream()
                .mapToDouble(x -> x.getCantidad() * x.getPrecio())
                .sum();

        System.out.println(sum);
    }
}
