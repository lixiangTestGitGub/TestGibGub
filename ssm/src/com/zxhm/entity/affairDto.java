/**
 * @description 实体类
 * @author Administrator
 * @create 2019-6-2
 * @since 1.0.0
 */
package com.zxhm.entity;

/**
 * Created by Administrator on 2019-6-2.
 */
public class affairDto {

    private  int id;
    private  String nameA;
    private  String moneyA;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public String getMoneyA() {
        return moneyA;
    }

    public void setMoneyA(String moneyA) {
        this.moneyA = moneyA;
    }

    @Override
    public String toString() {
        return "affairDto{" +
                "id=" + id +
                ", nameA='" + nameA + '\'' +
                ", moneyA='" + moneyA + '\'' +
                '}';
    }

}
