package cn.ly;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @ClassName test
 * @Description TODO
 * @Author 刘阳
 * @Date 2020/6/19 17:00
 */
public class test {
    @Test
    public void testJedis(){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("xxx","李东是傻逼");

        System.out.println(jedis.get("xxx"));
        jedis.close();
    }
}
