package org.ragomos.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {

        List<Integer> elementsFromMono = new ArrayList<>();
        List<Integer> elementsFromFlux = new ArrayList<>();

        //Creamos un Mono
        Mono<Integer> mono = Mono.just(1);

        //Creamos un Flux
        Flux<Integer> flux = Flux.just(1, 2, 3, 8, 9, 23, 45, 15);

        //Nos suscribimos al Mono
        mono.subscribe(elementsFromMono::add);

        //Nos suscribimos al Flux
        flux.subscribe(elementsFromFlux::add);

        System.out.println(elementsFromMono);
        System.out.println(elementsFromFlux);
    }
}