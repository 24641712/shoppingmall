package com.lnu.shoppingmallweb;

import com.lnu.shoppingmallentity.User;
import com.lnu.shoppingmallservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制层
 * 实现用户登录验证,注册查询操作
 * @author
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/add")
    private User add(){
        User user = new User();
        user.setId(1);
        user.setName("name");
        return userService.addOne(user);// 成功返回 保存后的 demo

    }




}
