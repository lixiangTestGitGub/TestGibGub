/**
 * @description
 * @author Administrator
 * @create 2019-5-26
 * @since 1.0.0
 */
package com.ssm.Dao.Impl;

import com.ssm.Dao.student;
import com.ssm.entity.studentDto;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by Administrator on 2019-5-26.
 */
public class StudentImpl extends SqlSessionDaoSupport implements student {
    @Override
    public studentDto selectByid(Integer id) {
        //继承SqlSessionDaoSupport 通过this.getSqlSession()得到sqlsession
        SqlSession sqlSession = this.getSqlSession();
        studentDto studentDto = sqlSession.getMapper(student.class).selectByid(id);
        return studentDto;
    }

    @Override
    public List<studentDto> selectAll() {
        //继承SqlSessionDaoSupport 通过this.getSqlSession()得到sqlsession
        SqlSession sqlSession = this.getSqlSession();
        List<studentDto> studentDtos = sqlSession.getMapper(student.class).selectAll();
        return studentDtos;
    }
}
