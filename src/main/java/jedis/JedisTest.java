package jedis;

import java.util.Set;

import com.alibaba.fastjson.JSON;

import redis.clients.jedis.Jedis;

public class JedisTest {

	public static void main(String[] args) {
		connect();
	}
	
	
	/**
	 * 连接redis注意事项
	 * 1、修改redis配置 注掉bind 127.0.0.1
	 * 2、修改protected-mode  no
	 * 3、redis默认端口是6379 ，需要开通防火墙
	 * 4、设置redis密码，默认设置
	 * */
	private static void connect(){
		Jedis jedis =new Jedis("192.168.161.12",6379);
		jedis.auth("111111");
		System.out.println("连接成功");
		jedis.set("name", "沪旦铭");
		String val =jedis.get("name");
		String foot =jedis.get("foot");
		System.out.println(val);
		System.out.println(foot);
		Set<String> keys =jedis.keys("*");
		System.out.println(JSON.toJSONString(keys));
	}

	
}
