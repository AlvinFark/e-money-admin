package com.admin.emoney;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  void deleteByEmail(String email);
  User getByEmail(String email);
}
