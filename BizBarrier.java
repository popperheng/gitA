package com.suning.zhongtai.barrier.global.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 业务级别流控，例如同一四要素的流控
 * @author 15100468
 *
 */
@Target({ElementType.METHOD}) 
@Retention(RetentionPolicy.RUNTIME)
public @interface BizBarrier {
	String bizName();  //业务定义名称,用于获取scm配置阀值,配置方法demo：bizXXXX=10000,该业务类型的流控阀值是10000
	String fieldNames() default "";//需要获取bean中的要素名称，以,分割，要素在bean中应为String类型变量
	int paramOrder() default 0; //javaBean所在参数位置，或javaBean所属集合所在参数位置
	
}
