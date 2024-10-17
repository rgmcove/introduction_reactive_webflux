package org.ragomos.reactor;

import reactor.core.publisher.Mono;

public class Ejemplo3 {
    public static void main(String[] args) {

        Mono<String> mono = Mono.fromSupplier(() -> {
            throw new RuntimeException("Excepcion ocurrida");
        });

        mono.subscribe(
                System.out::println, //onNext
                System.out::println, //onError
                () -> System.out.println("Terminado") //onComplete
        );
    }
}
