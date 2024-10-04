package com.contrapresion;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo1 {
    public static void main(String[] args) {

        Flux<String> ciudades = Flux.fromIterable(
                new ArrayList<>(Arrays.asList("New York", "San Francisco", "London", "Paris", "Cali"))
        );
        ciudades.log().subscribe();
    }
}