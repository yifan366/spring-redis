package com.zhongtai.spring_redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.StringRedisTemplate;

public class Main {

	public static void main(String[] args) {
		
		 long starTime=System.currentTimeMillis();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StringRedisTemplate st = (StringRedisTemplate) ctx.getBean("redisTemplate");
		RedisConnection con = st.getConnectionFactory().getConnection();
		
		byte[] result = con.get("ztzf".getBytes());
		System.out.println(new String(result));
		
		long endTime=System.currentTimeMillis();
		long Time=endTime-starTime;
		
		System.out.println(Time);
		
	}
}
