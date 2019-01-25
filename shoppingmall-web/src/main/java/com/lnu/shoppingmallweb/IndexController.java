package com.lnu.shoppingmallweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","hello");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/home")
    public ModelAndView getHome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","home");
        modelAndView.setViewName("home");
        return modelAndView;
    }




}
