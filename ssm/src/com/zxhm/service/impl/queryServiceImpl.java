/**
 * @description
 * @author Administrator
 * @create 2019-6-2
 * @since 1.0.0
 */
package com.zxhm.service.impl;

import com.zxhm.dao.affair;
import com.zxhm.entity.affairDto;
import com.zxhm.entity.affairDtoCustom;
import com.zxhm.entity.queryVo;
import com.zxhm.service.queryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019-6-2.
 */
@Service("queryService")
public class queryServiceImpl implements queryService {

    @Autowired
    private affair affair;

    @Override
    public List<affairDto> queryservice() {
        return affair.query();
    }
}
