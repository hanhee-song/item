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
public class SortRule {
  private String id;
  private String field;
  private String order; // asce or desc
  private String isActive;
}
