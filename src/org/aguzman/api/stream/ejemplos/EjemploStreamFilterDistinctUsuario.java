package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterDistinctUsuario {
    public static void main(String[] args) {

        //-------------------------------------------------------------
        Stream<Usuario> usuarios = Stream.of(
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
                .distinct(); // Tiene que estar implementado el método equals

        usuarios.forEach(System.out::println);
    }
}
