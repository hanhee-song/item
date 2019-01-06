package com.hanhee.item.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
  private String id;
  private String parentItemId;
  private String itemPrototypeId;
  private String name;
  private String description;
  private String createdBy;
  private Date createdDate;
  private Date lastModifiedDate;
  private String sortOrder;
  private SortRule sortRule;
  private HashMap<String, Field> fields; // denormalized
  private List<Item> itemPrototypes; // join table
  private String isActive;
}
