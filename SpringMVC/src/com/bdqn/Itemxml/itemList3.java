/**
 * @description
 * @author Administrator
 * @create 2019-5-31
 * @since 1.0.0
 */
package com.bdqn.Itemxml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019-5-31.
 */
//标明这是一个控制器
@Controller
public class itemList3 {

    //实现对show方法的url进行映射，一个方法对应一个url
    @RequestMapping
    public ModelAndView  show(){
        //配置学生
        List<student> s = new ArrayList<student>();
        student a = new student();
        a.setAge(1);
        a.setName("注解僵尸黄福");
        s.add(a);
        student a1 = new student();
        a.setAge(13);
        a1.setName("注解孙敏儿子");
        s.add(a1);
        //创建modeAndView准备填充数据，设置视图
        ModelAndView modelAndView = new ModelAndView();
        //填充数据 相当于request.getSession().setAttribute
        modelAndView.addObject("itmesList",s);
        //视图
        modelAndView.setViewName("abc");
        return modelAndView;
    }
}
