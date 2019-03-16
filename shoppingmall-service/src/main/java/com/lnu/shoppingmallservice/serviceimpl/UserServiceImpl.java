package com.lnu.shoppingmallservice.serviceimpl;

import com.lnu.dao.UserRepository;
import com.lnu.entity.TbUser;
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
    public TbUser addOne(TbUser user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<TbUser> findAllUser() {
        return this.userRepository.findAll();
    }

    @Override
    public TbUser save(TbUser user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }
}
