/**
 * @description
 * @author Administrator
 * @create 2019-6-2
 * @since 1.0.0
 */
package com.zxhm.servlet;

import com.zxhm.entity.affairDtoCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.zxhm.service.queryService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019-6-2.
 */
//标明这是一个控制器
@Controller
public class hander {

//    @Resource
//    protected queryService queryService;
//
//
//    //对该方法url的url进行映射，一个方法对应一个url
//    @RequestMapping("querya.action")
//    public ModelAndView  query(){
//        List<affairDtoCustom> queryservice = queryService.queryservice();
////        返回modelandview
//        ModelAndView modelAndView = new ModelAndView();
//        //填充数据
//        modelAndView.addObject("itmesList",queryservice);
//        modelAndView.setViewName("/abc.jsp");
//        return  modelAndView;
//    }

}
