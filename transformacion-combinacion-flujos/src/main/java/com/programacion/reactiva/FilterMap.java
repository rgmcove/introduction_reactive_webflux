package com.programacion.reactiva;

import reactor.core.publisher.Flux;

public class FilterMap {
    public static void main(String[] args) {

        Flux.fromArray(new String[]{"Tom", "Melissa", "Steve", "Megan"})
                .filter(nombre -> nombre.length() > 5)
                .map(String::toUpperCase)
                .subscribe(System.out::println);
    }
}