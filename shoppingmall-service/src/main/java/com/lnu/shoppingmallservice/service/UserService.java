package com.lnu.shoppingmallservice.service;

import com.lnu.shoppingmallentity.User;

import java.util.List;

/**
 * @author
 */
public interface UserService {

   public User addOne(User user);

   public List<User> findAllUser();

   public User save(User user);

   public void delete(Integer id);



}
