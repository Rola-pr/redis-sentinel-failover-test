import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**JDVD03327080404
 * @author peirongzhang
 */

public class RedisSentinelFailoverTest {
    private static Logger logger = LoggerFactory.getLogger(RedisSentinelFailoverTest.class);
    public static void main(String[] args) {

        String masterName = "mymaster";
        Set<String> sentinels = new HashSet<>();
        sentinels.add("127.0.0.1:6379");

        JedisSentinelPool jedisSentinelPool = new JedisSentinelPool(masterName,sentinels);

        while (true){
            Jedis jedis = null;
            try {
                jedis = jedisSentinelPool.getResource();
                int index = new Random().nextInt(100000);
                String key = "k-" + index;
                String value = "v-" + index;
                jedis.set(key,value);
                jedis.get(key);
                logger.info("{} value is {}", key, jedis.get(key));
                TimeUnit.MILLISECONDS.sleep(10);
            }catch (Exception e){
                // TODO: handle exception
                logger.error(e.getMessage(),e);
            }finally {
                if (jedis != null){
                    jedis.close();
                }
            }
        }
    }
}
