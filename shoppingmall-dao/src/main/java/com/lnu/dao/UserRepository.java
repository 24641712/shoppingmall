package com.lnu.dao;

import com.lnu.entity.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author
 */
public interface UserRepository extends JpaRepository<TbUser, Integer> {
}
