package jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisConnectionPool {
	private final String  host ="192.168.161.12";
	private final int port =6379;
	private final String password ="111111";
	private JedisPool jedisPool =null;
	private void init(){
		JedisPoolConfig jedisPoolConfig =new JedisPoolConfig();
		jedisPoolConfig.setTestOnBorrow(true);
		jedisPoolConfig.setMaxWaitMillis(1000*100);
		jedisPool = new JedisPool(jedisPoolConfig,host,port,500,password);
	}
	
	public static Jedis getJedis(){
		
		return null;
	}

}
