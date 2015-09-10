package org.v11.redis_java_demo;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class Keys {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("10.20.14.10",6379 );
		Set st = jedis.keys("*");
		System.out.println(st.size());
	}
}
