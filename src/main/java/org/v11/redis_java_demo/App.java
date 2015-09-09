package org.v11.redis_java_demo;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("10.20.14.10",6379 );
		
		System.out.println("Connection to server sucessfully");
		// check whether server is running or not
		System.out.println("Server is running: " + jedis.ping());
		// set the data in redis string
		jedis.set("tutorial-name", "Redis tutorial");
		// Get the stored data and print it
		System.out.println("Stored string in redis:: "
				+ jedis.get("tutorial-name"));
		// some key not exist
		System.out.println("No exist key in redis:: "
				+ jedis.get("tutorial-name1"));
		// store data in redis list
		jedis.lpush("tutorial-list", "Redis");
		jedis.lpush("tutorial-list", "Mongodb");
		jedis.lpush("tutorial-list", "Mysql");
		// Get the stored data and print it
		// pop order like stack
		List<String> list = jedis.lrange("tutorial-list", 0, 2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Stored string List in redis:: " + list.get(i));
		}
		// Get the stored data and print it
		Set<String> keys = jedis.keys("*");
		for (String key : keys) {
			System.out.println("List of stored keys:: " + key);
		}
	}
}
