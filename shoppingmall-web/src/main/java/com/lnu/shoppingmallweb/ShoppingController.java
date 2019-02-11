package com.lnu.shoppingmallweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *购物控制层
 *实现用户购物时的控制逻辑
 * @author ccl
 **/
@Controller
@RequestMapping("/shopping")
public class ShoppingController {

    @RequestMapping("/address")
    public ModelAndView getAddress(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/address");
        return modelAndView;
    }

    @RequestMapping("/bill")
    public ModelAndView getBill(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/bill");
        return modelAndView;
    }

    @RequestMapping("/bonus")
    public ModelAndView getBonus(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/bonus");
        return modelAndView;
    }


    @RequestMapping("/cardlist")
    public ModelAndView getCardlist(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/cardlist");
        return modelAndView;
    }

    @RequestMapping("/change")
    public ModelAndView getChange(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/change");
        return modelAndView;
    }

    @RequestMapping("/collection")
    public ModelAndView getCollection(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/collection");
        return modelAndView;
    }

    @RequestMapping("/comment")
    public ModelAndView getComment(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/comment");
        return modelAndView;
    }

    @RequestMapping("/consultation")
    public ModelAndView getConsultation(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/consultation");
        return modelAndView;
    }

    @RequestMapping("/coupon")
    public ModelAndView getCoupon(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/coupon");
        return modelAndView;
    }

    @RequestMapping("/foot")
    public ModelAndView getFoot(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/foot");
        return modelAndView;
    }

    @RequestMapping("/frame")
    public ModelAndView getFrame(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/frame");
        return modelAndView;
    }

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

    @RequestMapping("/shopcart")
    public ModelAndView getShopcart(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ftl/shopping/shopcart");
        return modelAndView;
    }

    @RequestMapping("/introduction")
    public ModelAndView getIntroduction(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ftl/shopping/introduction");
        return modelAndView;
    }

    @RequestMapping("/information")
    public ModelAndView getInformation(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ftl/personal/information");
        return modelAndView;
    }

    @RequestMapping("/news")
    public ModelAndView getNews(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ftl/personal/news");
        return modelAndView;
    }

    @RequestMapping("/pay")
    public ModelAndView getPay(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/shopping/pay");
        return modelAndView;
    }

    @RequestMapping("/points")
    public ModelAndView getPoints(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/points");
        return modelAndView;
    }

    @RequestMapping("/safety")
    public ModelAndView getSafety(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/safety");
        return modelAndView;
    }

    @RequestMapping("/success")
    public ModelAndView getSuccess(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/shopping/success1");
        return modelAndView;
    }

    @RequestMapping("/suggest")
    public ModelAndView getSuggest(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/suggest");
        return modelAndView;
    }

    @RequestMapping("/order")
    public ModelAndView getOrder(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/order");
        return modelAndView;
    }

    @RequestMapping("/orderinfo")
    public ModelAndView getOrderInfo(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/shopping/orderinfo");
        return modelAndView;
    }

    @RequestMapping("/walletlist")
    public ModelAndView getWalletlist(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/ftl/personal/walletlist");
        return modelAndView;
    }












}
