package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingleOptional {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------");
        Stream<Usuario> usuarios = Stream.of("Pato Guzman",
                        "Paco Gonzalez",
                        "Pepa Gutierrez",
                        "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepex"))
                .peek(System.out::println);

        Optional<Usuario> usuario = usuarios.findFirst();
//        System.out.println(usuario.get());
//        System.out.println(usuario.orElse(new Usuario("John", "Doe")));
//        System.out.println(usuario.orElse(null));
//        System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")));
//        System.out.println(usuario.orElseThrow());
//        if(usuario.isPresent()){
//            System.out.println(usuario.get().getNombre());
//        }else{
//            System.out.println("No se encontró el objeto");
//        }
        if(!usuario.isEmpty()){
            System.out.println(usuario.get().getNombre());
        }else{
            System.out.println("No se encontró el objeto");
        }
    }
}
