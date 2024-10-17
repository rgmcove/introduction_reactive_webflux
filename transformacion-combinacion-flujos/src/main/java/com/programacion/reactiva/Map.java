package com.programacion.reactiva;

import reactor.core.publisher.Flux;

public class Map {
    public static void main(String[] args) {

        Flux.fromArray(new String[]{"Tom", "Melissa", "Steve", "Megan"})
                .map(String::toUpperCase)
                .subscribe(System.out::println);
    }
}