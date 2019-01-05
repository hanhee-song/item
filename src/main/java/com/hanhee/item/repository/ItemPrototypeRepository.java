package com.hanhee.item.repository;

import com.hanhee.item.model.ItemPrototype;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ItemPrototypeRepository extends ReactiveMongoRepository<ItemPrototype, String> {
  
}
