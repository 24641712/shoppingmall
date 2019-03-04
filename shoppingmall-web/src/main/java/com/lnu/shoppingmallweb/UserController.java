package com.lnu.shoppingmallweb;

import com.lnu.entity.TbUser;
import com.lnu.shoppingmallservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户控制层
 * 实现用户登录验证,注册查询操作
 * @author　ccl
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/add")
    private TbUser add(){
        TbUser user = new TbUser();
        user.setId(1);
        user.setUsername("name");
        return userService.addOne(user);// 成功返回 保存后的 demo

    }

    @RequestMapping("/login")
    public ModelAndView getLogin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ftl/person/login");
        return modelAndView;
    }


    @RequestMapping("/register")
    public ModelAndView getRegister(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ftl/person/register");
        return modelAndView;
    }





}
