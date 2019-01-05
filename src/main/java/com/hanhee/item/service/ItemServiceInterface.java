package com.hanhee.item.service;

import com.hanhee.item.model.Item;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ItemServiceInterface {
  Mono<Item> findById(String id);
  Flux<Item> findAll();
  Mono<Item> save(Item item);
  Mono<Void> deleteById(String id);
}
