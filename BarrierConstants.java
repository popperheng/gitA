package com.suning.zhongtai.barrier.global.constants;

public class BarrierConstants {
	
	
	public static final int SCM_NO_BARRIER = 0;         //SCM中如果配置了某个流控值是0,则不需要流控
	
	public static final String SCM_NODE = "barrier";             //SCM全局流控节点名
	
	public static final int SECOND_PERIOD = 1;     //流控计算周期，默认1s
	
	public static final String COMMA_SPERATOR = ",";  //参数之间逗号分割符
	
	public static final String SUCCESS_FLAG = "SUCC";  //成功标识
	public static final String FAIL_FLAG = "FAIL";     //失败标识
}
