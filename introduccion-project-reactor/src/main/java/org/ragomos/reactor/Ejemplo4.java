package org.ragomos.reactor;

import reactor.core.publisher.Flux;

public class Ejemplo4 {
    public static void main(String[] args) {

        Flux<String> flux = Flux.fromArray(new String[]{"data1","data2","data3"});
        flux.subscribe(System.out :: println);

        //Otra forma de mostrar los resultados
        flux.doOnNext(System.out::println).subscribe();
    }
}
