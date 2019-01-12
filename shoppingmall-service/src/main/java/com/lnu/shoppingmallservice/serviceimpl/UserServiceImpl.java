package com.lnu.shoppingmallservice.serviceimpl;

import com.lnu.shoppingmalldao.UserRepository;
import com.lnu.shoppingmallentity.User;
import com.lnu.shoppingmallservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 逻辑层
 * 用户实现类
 * @author
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User addOne(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> findAllUser() {
        return this.userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        this.userRepository.deleteById(id);
    }
}
