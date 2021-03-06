package com.hanhee.item.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Field {
  private String id;
  private String name;
  private String type;
  private String value;
  private String sortOrder;
  private String isActive;
}
