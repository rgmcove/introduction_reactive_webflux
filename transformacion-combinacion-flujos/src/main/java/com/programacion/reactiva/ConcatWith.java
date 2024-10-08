package com.programacion.reactiva;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ConcatWith {
    public static void main(String[] args) {

        Flux<String> flux = Flux.fromArray(new String[] {"a", "b", "c"});
        Mono<String> mono = Mono.just("f");

        Flux<String> fluxConcatWith = flux.concatWith(mono);

        fluxConcatWith.subscribe(element -> System.out.println(element + " "));
    }
}
