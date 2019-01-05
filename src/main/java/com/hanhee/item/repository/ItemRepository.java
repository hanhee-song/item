package com.hanhee.item.repository;

import com.hanhee.item.model.Item;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Mono<> save()
 * Flux<> saveAll()
 * Flux<> findById()
 * Mono<Boolean> existsById()
 * Flux<> findAll()
 * Flux<> findAllById()
 * Mono<Long> count()
 * Mono<void> delete()
 * Mono<Void> deleteById()
 * Mono<Void> deleteAll()
 * Flux<> insert()
 */

public interface ItemRepository extends ReactiveMongoRepository<Item, String> {
  
}
