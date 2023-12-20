package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
//        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe")
//                .peek(e-> System.out.println(e))
//                .map(nombre -> {
//                    return nombre.toUpperCase();
//                });
//        nombres.forEach(e-> System.out.println(e));

//        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe")
//                .map(String::toUpperCase)
//                .peek(System.out::println)
//                .map(String::toUpperCase);
////                .peek(System.out::println);
//
//        List<String> lista = nombres.collect(Collectors.toList());
//        lista.forEach(System.out::println);

        //-------------------------------------------------------------
//        Stream<Usuario> usuarios = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
//                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
//                .peek(System.out::println)
//                .map(usuario -> {
//                    String nombre = usuario.getNombre().toUpperCase();
//                    usuario.setNombre(nombre);
//                    return usuario;
//                });
//
//        List<Usuario> lista = usuarios.collect(Collectors.toList());
//        lista.forEach(System.out::println);

        //-------------------------------------------------------------
        Stream<Usuario> usuarios = Stream.of("Pato Guzman",
                        "Paco Gonzalez",
                        "Pepa Gutierrez",
                        "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u-> u.getNombre().equals("Pepe"))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista = usuarios.collect(Collectors.toList());
        lista.forEach(System.out::println);
    }
}
