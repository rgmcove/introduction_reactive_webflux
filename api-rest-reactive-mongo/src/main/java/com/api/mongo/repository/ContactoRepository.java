package com.api.mongo.repository;

import com.api.mongo.documents.Contacto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ContactoRepository extends ReactiveMongoRepository<Contacto, String> {

    Mono<Contacto> findFirstByEmail(String email);
    Mono<Contacto> findAllByTelefonoOrNombre(String telefonoOrNombre);
}
