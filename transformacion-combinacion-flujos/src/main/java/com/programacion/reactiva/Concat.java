package com.programacion.reactiva;

import reactor.core.publisher.Flux;

public class Concat {
    public static void main(String[] args) {

        Flux<String> firtsFlux = Flux.fromArray(new String[] {"a", "b", "c"});
        Flux<String> secondFlux = Flux.fromArray(new String[] {"d", "e", "f"});

        Flux<String> fluxConcat = Flux.concat(firtsFlux, secondFlux);

        fluxConcat.subscribe(element -> System.out.println(element + " "));
    }
}
