package jedis;

import java.util.Set;

import com.alibaba.fastjson.JSON;

import redis.clients.jedis.Jedis;

public class JedisTest {

	public static void main(String[] args) {
		connect();
	}
	
	
	/**
	 * ����redisע������
	 * 1���޸�redis���� ע��bind 127.0.0.1
	 * 2���޸�protected-mode  no
	 * 3��redisĬ�϶˿���6379 ����Ҫ��ͨ����ǽ
	 * 4������redis���룬Ĭ������
	 * */
	private static void connect(){
		Jedis jedis =new Jedis("192.168.161.12",6379);
		jedis.auth("111111");
		System.out.println("���ӳɹ�");
		jedis.set("name", "������");
		String val =jedis.get("name");
		String foot =jedis.get("foot");
		System.out.println(val);
		System.out.println(foot);
		Set<String> keys =jedis.keys("*");
		System.out.println(JSON.toJSONString(keys));
	}

	
}
