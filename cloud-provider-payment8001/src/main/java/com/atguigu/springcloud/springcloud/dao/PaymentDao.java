package com.atguigu.springcloud.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * [用一句话描述此类]
 *
 * @author: liuzx
 * @create: 2020-07-02 17:22
 **/
@Mapper
public interface PaymentDao {
    //增删该查

    //创建
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Integer id);
}
