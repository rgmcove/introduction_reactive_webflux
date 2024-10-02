package org.ragomos.reactor;

import reactor.core.publisher.Mono;

public class Ejemplo2 {
    public static void main(String[] args) {

        Mono<String> mono = Mono.just("Hello");
        mono.subscribe(
                data -> System.out.println(data), //onNext
                err -> System.out.println(err), //onError
                () -> System.out.println("Terminado") //onComplete
        );
    }
}
