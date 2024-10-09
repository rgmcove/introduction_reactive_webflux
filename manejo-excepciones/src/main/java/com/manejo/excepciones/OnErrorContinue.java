package com.manejo.excepciones;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class OnErrorContinue {
    public static void main(String[] args) {

        Flux.just(2,0,7,10,8,12,22,24)
                .map(element -> {
                    if (element == 0) {
                        throw new RuntimeException("Exception ocurred");
                    }
                    return element;
                }).onErrorContinue((ex, element) -> {
                    System.out.println("Exception: " + ex);
                    System.out.println("El elemento que causa la excepcion es: " + element);
                })
                .log()
                .subscribe();
    }
}