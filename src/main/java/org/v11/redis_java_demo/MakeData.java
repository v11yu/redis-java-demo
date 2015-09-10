package org.v11.redis_java_demo;

import redis.clients.jedis.Jedis;

public class MakeData {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("10.20.14.10",6379 );
		jedis.set("tsina_3842138922480576#senti_score", "-0.2841890112829164");
		jedis.set("tsina_3842138922480576#senti_label", "neg");
		//jedis.set("tsina_3842138922480577#", "Redis tutorial");
	}
}
