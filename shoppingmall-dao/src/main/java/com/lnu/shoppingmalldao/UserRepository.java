package com.lnu.shoppingmalldao;

import com.lnu.shoppingmallentity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
