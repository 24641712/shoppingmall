package com.lnu.shoppingmallweb;

import com.lnu.ShoppingmallWebApplication;
import com.lnu.shoppingmallentity.User;
import com.lnu.shoppingmallservice.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 测试类
 * @author ccl
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShoppingmallWebApplication.class)
public class UserControllerTest {

    @Autowired
    private UserService userService;

    /*
    *测试添加用户功能
    *@return
    **/
    @Test
    public void testAdd(){
        User user = new User();
        user.setName("小头");
        user.setId(3);
        System.out.println(userService.addOne(user).toString());

    }

    /*
    *测试查询所有用户功能
    *@return
    **/
    @Test
    public void testFindAllUser(){

        List<User> list = userService.findAllUser();

        for(User user:list){
            System.out.println(user.toString());
        }
    }

    /*
    *
    *@return
    **/
    @Test
    public void update(){
        User user = new User();
        user.setName("小头1");
        user.setId(3);
        System.out.println(userService.save(user).toString());
    }

    /*
    *
    *@return
    **/
    @Test
    public void delete(){
       try {
           userService.delete(3);
           System.out.println("删除id为3的用户");
       }catch (Exception e){
           e.printStackTrace();
       }

    }





}
