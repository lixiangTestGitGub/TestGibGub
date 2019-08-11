package com.zxhm.service;

import java.util.List;

import com.zxhm.entity.affairDto;
import  com.zxhm.entity.affairDtoCustom;
import  com.zxhm.entity.queryVo;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019-6-2.
 */

public interface queryService {
    //查询
    public List<affairDto>queryservice();
}
