package com.suning.zhongtai.barrier.global.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 全局流控注解
 * 用于方法上的注解
 * 对方法级别的流控
 * @author 15100468
 *
 */
@Target({ElementType.METHOD}) 
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodBarrier {

}
