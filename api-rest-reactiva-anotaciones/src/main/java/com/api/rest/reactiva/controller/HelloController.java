package com.api.rest.reactiva.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/mono")
    public Mono<String> getMono() {
        return Mono.just("Bienvenidos a mi Rest API");
    }

    @GetMapping(value = "/flux", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<String> getFlux() {
        return Flux.just("Bienvenidos ", "a ", "mi ", "Rest ", "API ")
                .delayElements(Duration.ofSeconds(1)).log();
    }
}