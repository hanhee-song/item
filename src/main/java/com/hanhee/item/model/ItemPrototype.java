package com.hanhee.item.model;

import java.util.Date;
import java.util.HashMap;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPrototype {
  private String id;
  private String name;
  private String description;
  private String createdBy;
  private Date createdDate;
  private Date lastModifiedDate;
  private HashMap<String, Field> fields;
}
