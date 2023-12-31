package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        //-------------------------------------------------------------
        Stream<Usuario> usuarios = Stream.of("Pato Guzman",
                        "Paco Gonzalez",
                        "Pepa Gutierrez",
                        "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u-> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        Optional<Usuario> usuario = usuarios.findFirst();
        System.out.println(usuario);
    }
}
