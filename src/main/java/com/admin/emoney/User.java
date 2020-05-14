package com.admin.emoney;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @Id long id;
  String name;
  String email;
  String phone;
  String password;
  long balance;
  boolean active;
}
