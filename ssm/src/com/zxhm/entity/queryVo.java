/**
 * @description
 * @author Administrator
 * @create 2019-6-2
 * @since 1.0.0
 */
package com.zxhm.entity;

/**
 * 包装类
 * Created by Administrator on 2019-6-2.
 */
public class queryVo {
    //商品信息
    private  affairDto affairDto;
    //为了系统的可扩展性，对原始生成的po进行扩展
    private  affairDtoCustom affairDtoCustom;

    public com.zxhm.entity.affairDto getAffairDto() {
        return affairDto;
    }

    public void setAffairDto(com.zxhm.entity.affairDto affairDto) {
        this.affairDto = affairDto;
    }

    public com.zxhm.entity.affairDtoCustom getAffairDtoCustom() {
        return affairDtoCustom;
    }

    public void setAffairDtoCustom(com.zxhm.entity.affairDtoCustom affairDtoCustom) {
        this.affairDtoCustom = affairDtoCustom;
    }
}
