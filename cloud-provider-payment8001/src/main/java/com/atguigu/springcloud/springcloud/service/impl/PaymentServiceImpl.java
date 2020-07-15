package com.atguigu.springcloud.springcloud.service.impl;

import com.atguigu.springcloud.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * [用一句话描述此类]
 *
 * @author: liuzx
 * @create: 2020-07-02 17:49
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Integer id){
        return paymentDao.getPaymentById(id);
    }
}
