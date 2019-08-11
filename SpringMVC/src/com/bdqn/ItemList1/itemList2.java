/**
 * @description
 * @author Administrator
 * @create 2019-5-31
 * @since 1.0.0
 */
package com.bdqn.ItemList1;

import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019-5-31.
 * 测试handler实现HttpRequestHandler
 * 此种方法可以通过修改httpServletResponse，设置响应的数据格式，比如响应json数据
 *   httpServletRequest.setCharacterEncoding("UTF-8");
 httpServletResponse.setContentType("application/json,charset=UTF-8");
 httpServletResponse.getWriter().write("json串");
 *
 */
public class itemList2 implements HttpRequestHandler{
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        //配置学生
        List<student> s = new ArrayList<student>();
        student a = new student();
        a.setAge(1);
        a.setName("僵尸黄福2");
        s.add(a);
        student a1 = new student();
        a.setAge(13);
        a1.setName("孙敏儿子2");
        s.add(a1);
        //设置模型数据
        httpServletRequest.setAttribute("itmesList",s);
        //设置转发的视图
//        httpServletRequest.getRequestDispatcher("/abc.jsp").forward(httpServletRequest,httpServletResponse);
        httpServletRequest.getRequestDispatcher("/abc.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
