package com.ssm.Dao;
import  com.ssm.entity.studentDto;

import java.util.List;

/**
 * Created by Administrator on 2019-5-26.
 */
public interface student {

   public studentDto selectByid(Integer id);

   public List<studentDto> selectAll();

}
