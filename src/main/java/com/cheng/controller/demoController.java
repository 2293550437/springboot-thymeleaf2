package com.cheng.controller;

import com.cheng.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class demoController {

    /**
     * 传递单个变量
     * @param m
     * @return
     */
    @RequestMapping("/demo")
    public String demo(Model m){
        String msg="hello thymeleaf";
        m.addAttribute("msg",msg);
        return "demo1";
    }

    /**
     * 传递对象和传递map集合
     * @param m
     * @return
     */
    @RequestMapping("demo2")
    public String demo2(Model m){
        User user = new User(1L, "猪肉", 19);
        m.addAttribute("user",user);

        Map map = new HashMap();
        map.put("address","北极无房琪琪货币兑换");
        map.put("phone","1546546662");
        map.put("zipcode","hbdsjskj");
        map.put("pic","http://www.keedu.cn/static/20589/pic/photos/201907231751522716573.png");
        m.addAttribute("map",map);
        return "demo2";
    }


    /**
     * 传递集合
     * @param m
     * @return
     */
    @RequestMapping("/demo3")
    public String demo3(Model m){
        List<User> list = new ArrayList<>();
        list.add(new User(1L,"羊蝎子",100));
        list.add(new User(2L,"鸭脖子",100));
        list.add(new User(3L,"肘子",100));
        list.add(new User(4L,"大西瓜",100));
        m.addAttribute("list",list);
        return "demo3";
    }


    /**
     * 传递参数到前端拼接
     * @param m
     * @return
     */
    @RequestMapping("/demo4")
    public String demo4(Model m){
        m.addAttribute("username","优就业");
        m.addAttribute("href","http://www.baidu.com");
        return "demo4";
    }

    /**
     *
     * @param m
     * @return
     */
    @RequestMapping("/demo5")
    public String demo5(Model m){
        m.addAttribute("flag","no");
        m.addAttribute("menu","admin");
        m.addAttribute("manager","manager");
        return "demo5";
    }

    /**
     *传递日期时间格式对象
     * @param m
     * @return
     */
    @RequestMapping("/demo6")
    public String demo6(Model m){
        m.addAttribute("now",new Date());
        Double price = 4646634.5465;
        m.addAttribute("price",price);
        String str = "是高速东莞市国际机场过段时间倒数第和调换号地块大股东高速开工对皇帝误会抵达后我还是傻傻的考试的对我待会我皇帝搜我很多事客户端考试都饿的我回电话is客户端考试的";
        m.addAttribute("str",str);
        return "demo6";
    }


}
