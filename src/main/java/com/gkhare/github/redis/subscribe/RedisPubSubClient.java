package com.gkhare.github.redis.subscribe;

import redis.clients.jedis.Jedis;

/**
 * Created by gkhare on 4/17/14.
 */
public class RedisPubSubClient {
    public static void main(String args[]) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Redis server hostname required to passed a command line argument");
        }
        Jedis redisClient = new Jedis(args[0]);
        redisClient.psubscribe(new RedisSubscriber(), "hotel*");
    }
}
