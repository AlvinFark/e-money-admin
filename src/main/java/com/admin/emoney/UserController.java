package com.admin.emoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  UserRepository userRepository;

  @DeleteMapping("/{email}")
  public String delete(@PathVariable String email) {
    User user = userRepository.getByEmail(email);
    userRepository.delete(user);
    return "success";
  }

  @GetMapping
  public List<User> getAll() {
    return userRepository.findAll();
  }

  @PutMapping
  public User update(@RequestBody User userRequest) {
    User user = userRepository.getByEmail(userRequest.email);
    user.setBalance(userRequest.getBalance());
    user.setActive(userRequest.isActive());
    return userRepository.save(user);
  }

}
