package com.lnu.shoppingmallservice.service;

import com.lnu.entity.TbUser;

import java.util.List;

/**
 * @author
 */
public interface UserService {

   public TbUser addOne(TbUser user);

   public List<TbUser> findAllUser();

   public TbUser save(TbUser user);

   public void delete(Integer id);



}
