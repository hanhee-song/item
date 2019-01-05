package com.hanhee.item.service;

import com.hanhee.item.model.Item;
import com.hanhee.item.repository.ItemRepository;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ItemService implements ItemServiceInterface {
  private ItemRepository itemRepository;
  
  public ItemService(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }
  
  @Override
  public Mono<Item> findById(String id) {
    return itemRepository.findById(id);
  }
  
  @Override
  public Flux<Item> findAll() {
    return itemRepository.findAll();
  }
  
  @Override
  public Mono<Item> save(Item item) {
    return itemRepository.save(item);
  }
  
  @Override
  public Mono<Void> deleteById(String id) {
    return itemRepository.deleteById(id);
  }
}
