package com.springnovel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springnovel.dao.IOrderDao;
import com.springnovel.payment.springmixed.PaymentActionMixed;


/**
 * 使用注解 注入
 */
@Configuration
//@ComponentScan(basePackageClasses={IOrderDao.class,PaymentActionMixed.class})
@ComponentScan("com.springnovel")
public class PaymentConfig {

}
