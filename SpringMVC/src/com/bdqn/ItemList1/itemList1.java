/**
 * @description
 * @author Administrator
 * @create 2019-5-29
 * @since 1.0.0
 */
package com.bdqn.ItemList1;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019-5-29.
 * 测试handler实现Controller接口
 */
public class itemList1 implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        //配置学生
        List<student> s = new ArrayList<student>();
        student a = new student();
        a.setAge(1);
        a.setName("僵尸黄福");
        s.add(a);
        student a1 = new student();
        a.setAge(13);
        a1.setName("孙敏儿子");
        s.add(a1);

        //创建modeAndView准备填充数据，设置视图
        ModelAndView modelAndView = new ModelAndView();
        //填充数据 相当于request.getSession().setAttribute
        modelAndView.addObject("itmesList",s);
        //视图
//        modelAndView.setViewName("/abc.jsp");
        modelAndView.setViewName("abc");

        return modelAndView;
    }
}
