package com.hanhee.item.web;

import com.hanhee.item.model.Item;
import com.hanhee.item.service.ItemService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ItemController {
  private ItemService itemService;
  
  public ItemController(ItemService itemService) {
    this.itemService = itemService;
  }
  
  @GetMapping(value = "/item/{id")
  public Mono<Item> getItemById(@PathVariable String id) {
    return itemService.findById(id);
  }
  
  @GetMapping(value = "/items")
    public Flux<Item> getItems() {
    return itemService.findAll();
  }
  
  @PostMapping(value = "/item")
  public Mono<Item> createItem(@RequestBody Item item) {
    return itemService.save(item);
  }
}
